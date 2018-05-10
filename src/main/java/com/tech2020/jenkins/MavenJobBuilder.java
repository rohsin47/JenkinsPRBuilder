package com.tech2020.jenkins;

import javaposse.jobdsl.dsl.DslFactory;
import javaposse.jobdsl.dsl.jobs.MavenJob;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;

public class MavenJobBuilder extends BaseJobBuilder<MavenJob> {
	public MavenJobBuilder(DslFactory dslFactory) {
		super(dslFactory);
	}

	protected final MavenJob newJob(String name) {
		CallSite[] arrayOfCallSite = $getCallSiteArray();
		return (MavenJob) ScriptBytecodeAdapter.castToType(
				arrayOfCallSite[4].call(arrayOfCallSite[5].callGroovyObjectGetProperty(this), name), MavenJob.class);
		return null;
	}

}
