package com.tech2020.jenkins;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import org.codehaus.groovy.runtime.callsite.CallSite;

public final class JenkinsBuildConstants implements GroovyObject {
	public static final String ARTIFACT_REPO_NAME = "artifactory";
	public static final String ARTIFACT_REPO_URL = "";
	public static final String RELEASE_REPO = "libs-releases";
	public static final String SNAPSHOT_REPO = "libs-snapshots";
	public static final String RELEASE_LOCAL_REPO = "libs-releases-local";
	public static final String SNAPSHOT_LOCAL_REPO = "libs-snapshots-local";
	public static final String GIT_BASE_URL = "";
	public static final String SVN_BASE_URL = "";
	public static final String CI_CREDENTIALS_ID = "cibuild";
	public static final String MAVEN_INSTALLATION_ID = "maven-3.3.9";
	public static final String JDK_8_X64_ID = "jdk_8u25_x64";
	public static final String JDK_7_X64_ID = "jdk_7u5_x64";
	public static final String JDK_7_X32_ID = "jdk_7u5_x32";
	public static final String JDK_6_X64_ID = "jdk_6u24_x64";

	private JenkinsBuildConstants() {
		CallSite[] arrayOfCallSite = $getCallSiteArray();
		MetaClass localMetaClass = $getStaticMetaClass();
		this.metaClass = localMetaClass;
	}
}