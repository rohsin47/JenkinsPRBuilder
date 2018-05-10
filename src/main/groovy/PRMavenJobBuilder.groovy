package com.tech2020.jenkins

import com.tech2020.jenkins.BaseJobBuilder
import com.tech2020.jenkins.MavenJobBuilder
import com.tech2020.jenkins.PullRequestConfigurer

import javaposse.jobdsl.dsl.DslFactory
import javaposse.jobdsl.dsl.RequiresPlugin
import javaposse.jobdsl.dsl.jobs.MavenJob

class PRMavenJobBuilder extends MavenJobBuilder {

	PRMavenJobBuilder(DslFactory dslFactory) {
		super(dslFactory)
	}

	@RequiresPlugin(id = 'stash-pullrequest-builder', minimumVersion = '1.6.0', failIfMissing = true)
	BaseJobBuilder<MavenJob> pullRequest(String url) {
		add(new PullRequestConfigurer(url))
		return this
	}
}
