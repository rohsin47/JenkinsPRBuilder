package com.tech2020.jenkins;

import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.MissingMethodException;
import groovy.lang.Reference;
import java.util.Map;
import javaposse.jobdsl.dsl.DslFactory;
import javaposse.jobdsl.dsl.Job;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public abstract class BaseJobBuilder<J extends Job> implements GroovyObject {
	private final Map<Class, Configurer> configurers;
	protected final DslFactory dslFactory;

	public BaseJobBuilder(DslFactory arg1) {
		DslFactory dslFactory;
		CallSite[] arrayOfCallSite = $getCallSiteArray();
		MetaClass localMetaClass = $getStaticMetaClass();
		this.metaClass = localMetaClass;
		DslFactory localDslFactory1 = dslFactory;
		this.dslFactory = ((DslFactory) ScriptBytecodeAdapter.castToType(localDslFactory1, DslFactory.class));
		Map localMap = ScriptBytecodeAdapter.createMap(new Object[0]);
		this.configurers = localMap;
		arrayOfCallSite[0].callCurrent(this, arrayOfCallSite[1].callConstructor(MailConfigurer.class));
	}

	protected abstract J newJob(String paramString);

	protected final BaseJobBuilder add(Configurer c) {
		CallSite[] arrayOfCallSite = $getCallSiteArray();
		arrayOfCallSite[2].call(this.configurers, arrayOfCallSite[3].call(c), c);
		return this;
		return null;
	}

	protected final BaseJobBuilder addAll(Configurer... c) {
		CallSite[] arrayOfCallSite = $getCallSiteArray();
		arrayOfCallSite[4].call(c, new _addAll_closure1(this));
		return this;
		return null;
	}

	protected final void log(String message) {
		CallSite[] arrayOfCallSite = $getCallSiteArray();
		arrayOfCallSite[5].call(arrayOfCallSite[6].callGetProperty(this.dslFactory), message);
	}

	public final J build(String name) {
		CallSite[] arrayOfCallSite = $getCallSiteArray();
		Reference job = new Reference(null);
		Object localObject;
		Job localJob;
		if ((__$stMC) || (BytecodeInterface8.disabledStandardMetaClass())) {
			localObject = arrayOfCallSite[7].callCurrent(this, name);
			((Reference) job).set((Job) ScriptBytecodeAdapter.castToType(localObject, Job.class));
		} else {
			localJob = newJob(name);
			((Reference) job).set(localJob);
		}
		arrayOfCallSite[8].callCurrent(this,
				new GStringImpl(
						new Object[] { arrayOfCallSite[9].callGetProperty(
								arrayOfCallSite[10].callGroovyObjectGetProperty((Job) job.get())), name },
						new String[] { "creating ", ": ", "" }));
		arrayOfCallSite[11].call(arrayOfCallSite[12].call(this.configurers), new _build_closure2(this, job));
		return (Job) job.get();
		return null;
	}

	public final J build() {
		CallSite[] arrayOfCallSite = $getCallSiteArray();
		return (Job) ScriptBytecodeAdapter.castToType(
				arrayOfCallSite[13].callCurrent(this, arrayOfCallSite[14].call(JobUtils.class, this.dslFactory)),
				Job.class);
		return null;
	}

	public BaseJobBuilder<J> svn(String url) {
		CallSite[] arrayOfCallSite = $getCallSiteArray();
		arrayOfCallSite[15].callCurrent(this, arrayOfCallSite[16].callConstructor(SvnConfigurer.class, url));
		return this;
		return null;
	}

	public BaseJobBuilder<J> git(String url) {
		CallSite[] arrayOfCallSite = $getCallSiteArray();
		arrayOfCallSite[17].callCurrent(this, arrayOfCallSite[18].callConstructor(GitConfigurer.class, url));
		return this;
		return null;
	}

	public BaseJobBuilder<J> gitPullRequest(String url) {
		CallSite[] arrayOfCallSite = $getCallSiteArray();
		arrayOfCallSite[19].callCurrent(this, arrayOfCallSite[20].callConstructor(GitPullRequestConfigurer.class, url));
		return this;
		return null;
	}
}
