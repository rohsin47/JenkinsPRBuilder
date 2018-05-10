package com.tech2020.jenkins

import static com.tech2020.jenkins.BuildConstants.*
import com.tech2020.jenkins.GitConfigurer

import javaposse.jobdsl.dsl.Job

class PullRequestConfigurer {

    PullRequestConfigurer(String url) {
        super(url)
    }

    void configure(Job job) {
        // workaround to variable scope issues
        String theUrl = url

        job.with {
            description('Build pull requests in the repository.')
            scm {
                git {
                    remote {
                        url(theUrl)
                        credentials(CI_CREDENTIALS_ID)
                        name('origin')
                        refspec('+refs/pull-requests/*:refs/remotes/origin/pr/*')
                        branch('origin/pr/${pullRequestId}/merge')
                    }
                    browser {
                        stash(browseUrl)
                    }
                    extensions {
                        wipeOutWorkspace()
                    }
                }
            }
            triggers {
                bitbucketPush()
                stashBuildTrigger {
                    cron('H/2 * * * *')
                    stashHost(GIT_WEB_URL)
                    credentialsId(CI_CREDENTIALS_ID)
                    projectCode(projectOrUser)
                    projectPath(projectOrUser)
                    repositoryName(repo)
                    ignoreSsl(false)
                    targetBranchesToBuild(EMPTY)
                    checkDestinationCommit(true)
                    checkNotConflicted(true)
                    checkMergeable(false)
                    mergeOnSuccess(false)
                    deletePreviousBuildFinishComments(false)
                    cancelOutdatedJobsEnabled(true)
                    ciSkipPhrases('@cibuild NO TEST')
                    onlyBuildOnComment(false)
                    ciBuildPhrases('@cibuild build please')
                }
            }
            publishers {
                stashNotifier {
                    commitSha1('${sourceCommitHash}')
                    keepRepeatedBuilds(false)
                }
            }
        }
    }
}
