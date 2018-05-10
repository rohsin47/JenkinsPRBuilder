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

	public class _addAll_closure1 extends Closure implements GeneratedClosure {
		public _addAll_closure1(Object _thisObject) {
			super(_thisObject);
		}

		public Object doCall(Object it) {
			CallSite[] arrayOfCallSite = $getCallSiteArray();
			return arrayOfCallSite[0].callCurrent(this, it);
			return null;
		}

		public Object doCall() {
			CallSite[] arrayOfCallSite = $getCallSiteArray();
			return doCall(null);
			return null;
		}
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

	public class _build_closure2 extends Closure implements GeneratedClosure {
		public _build_closure2(Object _thisObject, Reference job) {
			super(_thisObject);
			Reference localReference = job;
			this.job = localReference;
		}

		public Object doCall(Object it) {
			CallSite[] arrayOfCallSite = $getCallSiteArray();
			return arrayOfCallSite[0].call(it, this.job.get());
			return null;
		}

		public Job getJob() {
			CallSite[] arrayOfCallSite = $getCallSiteArray();
			return (Job) ScriptBytecodeAdapter.castToType(this.job.get(), Job.class);
			return null;
		}

		public Object doCall() {
			CallSite[] arrayOfCallSite = $getCallSiteArray();
			return doCall(null);
			return null;
		}
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

	public class _methodMissing_closure3 extends Closure implements GeneratedClosure {
		public _methodMissing_closure3(Object _thisObject, Reference name) {
			super(_thisObject);
			Reference localReference = name;
			this.name = localReference;
		}

		public Object doCall(Object it) {
			CallSite[] arrayOfCallSite = $getCallSiteArray();
			return arrayOfCallSite[0].call(ScriptBytecodeAdapter.getPropertySpreadSafe(_methodMissing_closure3.class,
					arrayOfCallSite[1].callGetProperty(arrayOfCallSite[2].callGetProperty(it)), (String) "name"),
					this.name.get());
			return null;
		}

		public String getName() {
			CallSite[] arrayOfCallSite = $getCallSiteArray();
			return (String) ShortTypeHandling.castToString(this.name.get());
			return null;
		}

		public Object doCall() {
			CallSite[] arrayOfCallSite = $getCallSiteArray();
			return doCall(null);
			return null;
		}
	}

	public BaseJobBuilder<J> methodMissing(String name, Object args) {
		Reference name = new Reference(name);
		CallSite[] arrayOfCallSite = $getCallSiteArray();
		Object configurer = arrayOfCallSite[21].call(arrayOfCallSite[22].call(this.configurers),
				new _methodMissing_closure3(this, name));
		if (DefaultTypeTransformation.booleanUnbox(configurer)) {
			arrayOfCallSite[23].call(configurer, (String) name.get(), args);
			return this;
		}
		throw ((Throwable) arrayOfCallSite[24].callConstructor(MissingMethodException.class, (String) name.get(),
				arrayOfCallSite[25].callGroovyObjectGetProperty(this), args));
		return null;
	}

	public MetaClass getMetaClass()
  {
    MetaClass tmp4_1 = this.metaClass;
    if (tmp4_1 != null) {
      return tmp4_1;
    }
    tmp4_1;
    this.metaClass = $getStaticMetaClass();
    return this.metaClass;
  }

	public void setMetaClass(MetaClass paramMetaClass) {
		this.metaClass = paramMetaClass;
	}

	public Object invokeMethod(String paramString, Object paramObject) {
		return getMetaClass().invokeMethod(this, paramString, paramObject);
	}

	public Object getProperty(String paramString) {
		return getMetaClass().getProperty(this, paramString);
	}

	public void setProperty(String paramString, Object paramObject) {
		getMetaClass().setProperty(this, paramString, paramObject);
	}
}
