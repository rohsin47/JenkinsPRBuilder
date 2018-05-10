package com.tech2020.jenkins;

import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import java.io.File;
import javaposse.jobdsl.dsl.DslFactory;
import javaposse.jobdsl.dsl.Job;
import javaposse.jobdsl.dsl.jobs.IvyJob;
import javaposse.jobdsl.dsl.jobs.MavenJob;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class JobFactory
  implements GroovyObject
{
  public JobFactory()
  {
    JobFactory this;
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    MetaClass localMetaClass = $getStaticMetaClass();
    this.metaClass = localMetaClass;
  }
  
  public static String getRelativePath(String path, String seedJobName)
  {
    CallSite[] arrayOfCallSite = $getCallSiteArray();String jobsFolderPrefix = (String)ShortTypeHandling.castToString(new GStringImpl(new Object[] { seedJobName }, new String[] { "", "/jobs/" }));
    
    return (String)ShortTypeHandling.castToString(arrayOfCallSite[0].call(arrayOfCallSite[1].call(path, arrayOfCallSite[2].call(path, jobsFolderPrefix)), "/jobs", ""));return null;
  }
  
  public static String getRelativePath(DslFactory dslFactory)
  {
    CallSite[] arrayOfCallSite = $getCallSiteArray();String path = (String)ShortTypeHandling.castToString(arrayOfCallSite[3].callGetProperty(dslFactory));
    
    String pathWithoutGroovyExtension = (String)ShortTypeHandling.castToString(arrayOfCallSite[4].call(path, Integer.valueOf(0), arrayOfCallSite[5].call(arrayOfCallSite[6].call(path), Integer.valueOf(7))));
    return (String)ShortTypeHandling.castToString(arrayOfCallSite[7].callStatic(JobFactory.class, pathWithoutGroovyExtension, arrayOfCallSite[8].callGetProperty(arrayOfCallSite[9].callGetProperty(dslFactory))));return null;
  }
  
  private static void addSharedSettings(Job job)
  {
    CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[10].call(job, new _addSharedSettings_closure1(JobFactory.class, JobFactory.class));
  }
  
  public class _addSharedSettings_closure1
    extends Closure
    implements GeneratedClosure
  {
    public _addSharedSettings_closure1(Object _thisObject)
    {
      super(_thisObject);
    }
    
    public class _closure9
      extends Closure
      implements GeneratedClosure
    {
      public _closure9(Object _thisObject)
      {
        super(_thisObject);
      }
      
      public class _closure11
        extends Closure
        implements GeneratedClosure
      {
        public _closure11(Object _thisObject)
        {
          super(_thisObject);
        }
        
        public Object doCall(Object it)
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();return arrayOfCallSite[0].callCurrent(this, Integer.valueOf(300), Integer.valueOf(3), Integer.valueOf(30));return null;
        }
        
        public Object doCall()
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return doCall(null);
          return null;
        }
      }
      
      public class _closure12
        extends Closure
        implements GeneratedClosure
      {
        public _closure12(Object _thisObject)
        {
          super(_thisObject);
        }
        
        public Object doCall(Object it)
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();return arrayOfCallSite[0].callCurrent(this, null);return null;
        }
        
        public Object doCall()
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return doCall(null);
          return null;
        }
      }
      
      public Object doCall(Object it)
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, new _closure11(getThisObject()));
        
        return arrayOfCallSite[1].callCurrent(this, new _closure12(getThisObject()));return null;
      }
      
      public Object doCall()
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
        return null;
      }
    }
    
    public class _closure10
      extends Closure
      implements GeneratedClosure
    {
      public _closure10(Object _thisObject)
      {
        super(_thisObject);
      }
      
      public Object doCall(Object it)
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();return arrayOfCallSite[0].callCurrent(this, "H/15 H * * *");return null;
      }
      
      public Object doCall()
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
        return null;
      }
    }
    
    public Object doCall(Object it)
    {
      CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, new _closure9(getThisObject()));
      
      arrayOfCallSite[1].callCurrent(this, Integer.valueOf(7), Integer.valueOf(-1), Integer.valueOf(7), Integer.valueOf(-1));
      arrayOfCallSite[2].callCurrent(this, "java");
      
      arrayOfCallSite[3].callCurrent(this, arrayOfCallSite[4].callGetProperty(CiBuildConstants.class));
      return arrayOfCallSite[5].callCurrent(this, new _closure10(getThisObject()));return null;
    }
    
    public Object doCall()
    {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
      return null;
    }
  }
  
  private static String getJobName(DslFactory dslFactory)
  {
    CallSite[] arrayOfCallSite = $getCallSiteArray();String jobName = (String)ShortTypeHandling.castToString(arrayOfCallSite[11].callGetProperty(arrayOfCallSite[12].callConstructor(File.class, arrayOfCallSite[13].callGetProperty(dslFactory))));
    Object localObject = arrayOfCallSite[14].call(jobName, Integer.valueOf(0), arrayOfCallSite[15].call(jobName, "."));jobName = (String)ShortTypeHandling.castToString(localObject);
    return jobName;return null;
  }
  
  public class _antJob_closure2
    extends Closure
    implements GeneratedClosure
  {
    public _antJob_closure2(Object _thisObject, Reference jobName)
    {
      super(_thisObject);
      Reference localReference = jobName;
      this.jobName = localReference;
    }
    
    public class _closure13
      extends Closure
      implements GeneratedClosure
    {
      public _closure13(Object _thisObject, Reference jobName)
      {
        super(_thisObject);
        Reference localReference = jobName;
        this.jobName = localReference;
      }
      
      public Object doCall(Object it)
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();return arrayOfCallSite[0].callCurrent(this, new _closure15(getThisObject(), this.jobName));return null;
      }
      
      public String getJobName()
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return (String)ShortTypeHandling.castToString(this.jobName.get());
        return null;
      }
      
      public Object doCall()
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
        return null;
      }
      
      public class _closure15
        extends Closure
        implements GeneratedClosure
      {
        public _closure15(Object _thisObject, Reference jobName)
        {
          super(_thisObject);
          Reference localReference = jobName;
          this.jobName = localReference;
        }
        
        public Object doCall(Object it)
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, "clean");
          arrayOfCallSite[1].callCurrent(this, ScriptBytecodeAdapter.createList(new Object[] { "dist", "test", "validate", "report-ivy", "sonar" }));
          
          arrayOfCallSite[2].callCurrent(this, ScriptBytecodeAdapter.createMap(new Object[] { "brs.jacoco.version", "0.7.5" }));
          arrayOfCallSite[3].callCurrent(this, ScriptBytecodeAdapter.createMap(new Object[] { "sonar.jacoco.reportPath", "**/dbg1.*" }));
          arrayOfCallSite[4].callCurrent(this, ScriptBytecodeAdapter.createMap(new Object[] { "sonar.scm.disabled", Boolean.valueOf(true) }));
          arrayOfCallSite[5].callCurrent(this, ScriptBytecodeAdapter.createMap(new Object[] { "sonar.projectName", this.jobName.get() }));
          arrayOfCallSite[6].callCurrent(this, ScriptBytecodeAdapter.createMap(new Object[] { "sonar.projectKey", new GStringImpl(new Object[] { this.jobName.get() }, new String[] { "brs:", "" }) }));
          return arrayOfCallSite[7].callCurrent(this, "src/build.xml");return null;
        }
        
        public String getJobName()
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return (String)ShortTypeHandling.castToString(this.jobName.get());
          return null;
        }
        
        public Object doCall()
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return doCall(null);
          return null;
        }
      }
    }
    
    public Object doCall(Object it)
    {
      CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, new _closure13(getThisObject(), this.jobName));
      
      return arrayOfCallSite[1].callCurrent(this, new _closure14(getThisObject()));return null;
    }
    
    public String getJobName()
    {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (String)ShortTypeHandling.castToString(this.jobName.get());
      return null;
    }
    
    public Object doCall()
    {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
      return null;
    }
    
    public class _closure14
      extends Closure
      implements GeneratedClosure
    {
      public _closure14(Object _thisObject)
      {
        super(_thisObject);
      }
      
      public class _closure16
        extends Closure
        implements GeneratedClosure
      {
        public _closure16(Object _thisObject)
        {
          super(_thisObject);
        }
        
        public Object doCall(Object it)
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, Integer.valueOf(3), Integer.valueOf(20));
          arrayOfCallSite[1].callCurrent(this, "high");
          arrayOfCallSite[2].callCurrent(this, "UTF-8");
          arrayOfCallSite[3].callCurrent(this, Boolean.valueOf(true));
          arrayOfCallSite[4].callCurrent(this, Boolean.valueOf(true));
          arrayOfCallSite[5].callCurrent(this, Boolean.valueOf(true));
          arrayOfCallSite[6].callCurrent(this, Boolean.valueOf(true));
          arrayOfCallSite[7].callCurrent(this, Boolean.valueOf(true));
          return arrayOfCallSite[8].callCurrent(this, ScriptBytecodeAdapter.createMap(new Object[] { "unstableTotal", ScriptBytecodeAdapter.createMap(new Object[] { "all", Integer.valueOf(1000), "high", Integer.valueOf(1000), "normal", Integer.valueOf(1000), "low", Integer.valueOf(1000) }), "failedTotal", ScriptBytecodeAdapter.createMap(new Object[] { "all", Integer.valueOf(1000), "high", Integer.valueOf(1000), "normal", Integer.valueOf(1000), "low", Integer.valueOf(1000) }), "unstableNew", ScriptBytecodeAdapter.createMap(new Object[] { "all", Integer.valueOf(1000), "high", Integer.valueOf(1000), "normal", Integer.valueOf(1000), "low", Integer.valueOf(1000) }), "failedNew", ScriptBytecodeAdapter.createMap(new Object[] { "all", Integer.valueOf(1000), "high", Integer.valueOf(1000), "normal", Integer.valueOf(1000), "low", Integer.valueOf(1000) }) }));return null;
        }
        
        public Object doCall()
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return doCall(null);
          return null;
        }
      }
      
      public class _closure17
        extends Closure
        implements GeneratedClosure
      {
        public _closure17(Object _thisObject)
        {
          super(_thisObject);
        }
        
        public Object doCall(Object it)
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, Integer.valueOf(3), Integer.valueOf(20));
          arrayOfCallSite[1].callCurrent(this, "high");
          arrayOfCallSite[2].callCurrent(this, "UTF-8");
          arrayOfCallSite[3].callCurrent(this, Boolean.valueOf(true));
          arrayOfCallSite[4].callCurrent(this, Boolean.valueOf(true));
          arrayOfCallSite[5].callCurrent(this, Boolean.valueOf(true));
          arrayOfCallSite[6].callCurrent(this, Boolean.valueOf(true));
          arrayOfCallSite[7].callCurrent(this, Boolean.valueOf(true));
          return arrayOfCallSite[8].callCurrent(this, ScriptBytecodeAdapter.createMap(new Object[] { "unstableTotal", ScriptBytecodeAdapter.createMap(new Object[] { "all", Integer.valueOf(1000), "high", Integer.valueOf(1000), "normal", Integer.valueOf(1000), "low", Integer.valueOf(1000) }), "failedTotal", ScriptBytecodeAdapter.createMap(new Object[] { "all", Integer.valueOf(1000), "high", Integer.valueOf(1000), "normal", Integer.valueOf(1000), "low", Integer.valueOf(1000) }), "unstableNew", ScriptBytecodeAdapter.createMap(new Object[] { "all", Integer.valueOf(1000), "high", Integer.valueOf(1000), "normal", Integer.valueOf(1000), "low", Integer.valueOf(1000) }), "failedNew", ScriptBytecodeAdapter.createMap(new Object[] { "all", Integer.valueOf(1000), "high", Integer.valueOf(1000), "normal", Integer.valueOf(1000), "low", Integer.valueOf(1000) }) }));return null;
        }
        
        public Object doCall()
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return doCall(null);
          return null;
        }
      }
      
      public class _closure18
        extends Closure
        implements GeneratedClosure
      {
        public _closure18(Object _thisObject)
        {
          super(_thisObject);
        }
        
        public Object doCall(Object it)
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, "**/dbg1.*/report/jacoco/**.exec");
          arrayOfCallSite[1].callCurrent(this, "**/dbg1.*/classes");
          arrayOfCallSite[2].callCurrent(this, "**/src");
          arrayOfCallSite[3].callCurrent(this, "**/*.class");
          arrayOfCallSite[4].callCurrent(this, "**/test/**/*.class,*Test*.class,*Provider.class,*IT.class");
          arrayOfCallSite[5].callCurrent(this, "20");
          arrayOfCallSite[6].callCurrent(this, "20");
          arrayOfCallSite[7].callCurrent(this, "20");
          arrayOfCallSite[8].callCurrent(this, "20");
          arrayOfCallSite[9].callCurrent(this, "20");
          arrayOfCallSite[10].callCurrent(this, "20");
          arrayOfCallSite[11].callCurrent(this, "80");
          arrayOfCallSite[12].callCurrent(this, "80");
          arrayOfCallSite[13].callCurrent(this, "80");
          arrayOfCallSite[14].callCurrent(this, "80");
          arrayOfCallSite[15].callCurrent(this, "80");
          return arrayOfCallSite[16].callCurrent(this, "80");return null;
        }
        
        public Object doCall()
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return doCall(null);
          return null;
        }
      }
      
      public class _closure19
        extends Closure
        implements GeneratedClosure
      {
        public _closure19(Object _thisObject)
        {
          super(_thisObject);
        }
        
        public Object doCall(Object it)
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, Integer.valueOf(3), Integer.valueOf(20));
          arrayOfCallSite[1].callCurrent(this, "high");
          arrayOfCallSite[2].callCurrent(this, "UTF-8");
          arrayOfCallSite[3].callCurrent(this, Boolean.valueOf(true));
          arrayOfCallSite[4].callCurrent(this, Boolean.valueOf(true));
          arrayOfCallSite[5].callCurrent(this, Boolean.valueOf(true));
          arrayOfCallSite[6].callCurrent(this, Boolean.valueOf(true));
          arrayOfCallSite[7].callCurrent(this, Boolean.valueOf(true));
          return arrayOfCallSite[8].callCurrent(this, ScriptBytecodeAdapter.createMap(new Object[] { "unstableTotal", ScriptBytecodeAdapter.createMap(new Object[] { "all", Integer.valueOf(1000), "high", Integer.valueOf(1000), "normal", Integer.valueOf(1000), "low", Integer.valueOf(1000) }), "failedTotal", ScriptBytecodeAdapter.createMap(new Object[] { "all", Integer.valueOf(1000), "high", Integer.valueOf(1000), "normal", Integer.valueOf(1000), "low", Integer.valueOf(1000) }), "unstableNew", ScriptBytecodeAdapter.createMap(new Object[] { "all", Integer.valueOf(1000), "high", Integer.valueOf(1000), "normal", Integer.valueOf(1000), "low", Integer.valueOf(1000) }), "failedNew", ScriptBytecodeAdapter.createMap(new Object[] { "all", Integer.valueOf(1000), "high", Integer.valueOf(1000), "normal", Integer.valueOf(1000), "low", Integer.valueOf(1000) }) }));return null;
        }
        
        public Object doCall()
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return doCall(null);
          return null;
        }
      }
      
      public class _closure20
        extends Closure
        implements GeneratedClosure
      {
        public _closure20(Object _thisObject)
        {
          super(_thisObject);
        }
        
        public Object doCall(Object it)
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, Integer.valueOf(10), Integer.valueOf(999), Integer.valueOf(9999), "**/dbg1.*/report/checkstyle/checkstyle.xml");
          arrayOfCallSite[1].callCurrent(this, Integer.valueOf(10), Integer.valueOf(999), Integer.valueOf(9999), "**/dbg1.*/report/pmd/cpd.xml");
          arrayOfCallSite[2].callCurrent(this, Integer.valueOf(10), Integer.valueOf(999), Integer.valueOf(9999), "**/dbg1.*/report/findbugs/index.xml");
          return arrayOfCallSite[3].callCurrent(this, Integer.valueOf(10), Integer.valueOf(999), Integer.valueOf(9999), "**/dbg1.*/report/pmd/index.xml");return null;
        }
        
        public Object doCall()
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return doCall(null);
          return null;
        }
      }
      
      public class _closure21
        extends Closure
        implements GeneratedClosure
      {
        public _closure21(Object _thisObject)
        {
          super(_thisObject);
        }
        
        public Object doCall(Object it)
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, Boolean.valueOf(true));
          arrayOfCallSite[1].callCurrent(this, Boolean.valueOf(true));
          arrayOfCallSite[2].callCurrent(this, Boolean.valueOf(true));
          arrayOfCallSite[3].callCurrent(this, Boolean.valueOf(true));
          arrayOfCallSite[4].callCurrent(this, Boolean.valueOf(true));
          return arrayOfCallSite[5].callCurrent(this, Boolean.valueOf(true));return null;
        }
        
        public Object doCall()
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return doCall(null);
          return null;
        }
      }
      
      public Object doCall(Object it)
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, "**/dbg1.*/report/checkstyle/checkstyle.xml", new _closure16(getThisObject()));
        
        arrayOfCallSite[1].callCurrent(this, "**/dbg1.*/report/findbugs/index.xml", Boolean.valueOf(false), new _closure17(getThisObject()));
        
        arrayOfCallSite[2].callCurrent(this, new _closure18(getThisObject()));
        
        arrayOfCallSite[3].callCurrent(this, "**/dbg1.*/report/pmd/index.xml", new _closure19(getThisObject()));
        
        arrayOfCallSite[4].callCurrent(this, "**/dbg1.*/report/pmd/cpd.xml", Integer.valueOf(50), Integer.valueOf(25));
        arrayOfCallSite[5].callCurrent(this, ScriptBytecodeAdapter.createList(new Object[] { "Java Compiler (javac)" }));
        arrayOfCallSite[6].callCurrent(this, "**/*.java");
        arrayOfCallSite[7].callCurrent(this, new _closure20(getThisObject()));
        
        arrayOfCallSite[8].callCurrent(this, new _closure21(getThisObject()));
        
        return arrayOfCallSite[9].callCurrent(this, "**/dbg1.*/test/data/*.xml");return null;
      }
      
      public Object doCall()
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
        return null;
      }
    }
  }
  
  public static IvyJob antJob(DslFactory dslFactory)
  {
    CallSite[] arrayOfCallSite = $getCallSiteArray();String jobUrl = (String)ShortTypeHandling.castToString(arrayOfCallSite[16].callStatic(JobFactory.class, dslFactory));
    Reference jobName = new Reference((String)ShortTypeHandling.castToString(arrayOfCallSite[17].callStatic(JobFactory.class, dslFactory)));
    arrayOfCallSite[18].call(arrayOfCallSite[19].callGetProperty(dslFactory), new GStringImpl(new Object[] { jobUrl, (String)jobName.get() }, new String[] { "creating job: ", " - name: ", "" }));
    Object job = arrayOfCallSite[20].call(dslFactory, jobUrl, new _antJob_closure2(JobFactory.class, JobFactory.class, jobName));
    
    arrayOfCallSite[21].callStatic(JobFactory.class, job);
    return (IvyJob)ScriptBytecodeAdapter.castToType(job, IvyJob.class);return null;
  }
  
  public static MavenJob mavenJob(DslFactory dslFactory)
  {
    CallSite[] arrayOfCallSite = $getCallSiteArray();return (MavenJob)ScriptBytecodeAdapter.castToType(arrayOfCallSite[22].callStatic(JobFactory.class, dslFactory, arrayOfCallSite[23].callStatic(JobFactory.class, dslFactory)), MavenJob.class);return null;
  }
  
  public class _mavenJob_closure3
    extends Closure
    implements GeneratedClosure
  {
    public _mavenJob_closure3(Object _thisObject)
    {
      super(_thisObject);
    }
    
    public class _closure22
      extends Closure
      implements GeneratedClosure
    {
      public _closure22(Object _thisObject)
      {
        super(_thisObject);
      }
      
      public class _closure25
        extends Closure
        implements GeneratedClosure
      {
        public _closure25(Object _thisObject)
        {
          super(_thisObject);
        }
        
        public Object doCall(Object it)
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, "REL-BRANCH-");
          arrayOfCallSite[1].callCurrent(this, null);
          arrayOfCallSite[2].callCurrent(this, null);
          arrayOfCallSite[3].callCurrent(this, null);
          arrayOfCallSite[4].callCurrent(this, null);
          arrayOfCallSite[5].callCurrent(this, "GLOBAL");
          return arrayOfCallSite[6].callCurrent(this, Boolean.valueOf(true));return null;
        }
        
        public Object doCall()
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return doCall(null);
          return null;
        }
      }
      
      public Object doCall(Object it)
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, new _closure25(getThisObject()));
        
        return arrayOfCallSite[1].callCurrent(this, new _closure26(getThisObject()));return null;
      }
      
      public Object doCall()
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
        return null;
      }
      
      public class _closure26
        extends Closure
        implements GeneratedClosure
      {
        public _closure26(Object _thisObject)
        {
          super(_thisObject);
        }
        
        public class _closure27
          extends Closure
          implements GeneratedClosure
        {
          public _closure27(Object _thisObject)
          {
            super(_thisObject);
          }
          
          public class _closure29
            extends Closure
            implements GeneratedClosure
          {
            public _closure29(Object _thisObject)
            {
              super(_thisObject);
            }
            
            public Object doCall(Object it)
            {
              CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, arrayOfCallSite[1].callGetProperty(CiBuildConstants.class));
              arrayOfCallSite[2].callCurrent(this, null);
              return arrayOfCallSite[3].callCurrent(this, Boolean.valueOf(false));return null;
            }
            
            public Object doCall()
            {
              CallSite[] arrayOfCallSite = $getCallSiteArray();
              return doCall(null);
              return null;
            }
          }
          
          public class _closure30
            extends Closure
            implements GeneratedClosure
          {
            public _closure30(Object _thisObject)
            {
              super(_thisObject);
            }
            
            public Object doCall(Object it)
            {
              CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, arrayOfCallSite[1].callGetProperty(CiBuildConstants.class));
              arrayOfCallSite[2].callCurrent(this, null);
              return arrayOfCallSite[3].callCurrent(this, Boolean.valueOf(false));return null;
            }
            
            public Object doCall()
            {
              CallSite[] arrayOfCallSite = $getCallSiteArray();
              return doCall(null);
              return null;
            }
          }
          
          public class _closure31
            extends Closure
            implements GeneratedClosure
          {
            public _closure31(Object _thisObject)
            {
              super(_thisObject);
            }
            
            public Object doCall(Object it)
            {
              CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, arrayOfCallSite[1].callGetProperty(CiBuildConstants.class));
              arrayOfCallSite[2].callCurrent(this, null);
              return arrayOfCallSite[3].callCurrent(this, Boolean.valueOf(false));return null;
            }
            
            public Object doCall()
            {
              CallSite[] arrayOfCallSite = $getCallSiteArray();
              return doCall(null);
              return null;
            }
          }
          
          public class _closure32
            extends Closure
            implements GeneratedClosure
          {
            public _closure32(Object _thisObject)
            {
              super(_thisObject);
            }
            
            public Object doCall(Object it)
            {
              CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, arrayOfCallSite[1].callGetProperty(CiBuildConstants.class));
              arrayOfCallSite[2].callCurrent(this, null);
              return arrayOfCallSite[3].callCurrent(this, Boolean.valueOf(false));return null;
            }
            
            public Object doCall()
            {
              CallSite[] arrayOfCallSite = $getCallSiteArray();
              return doCall(null);
              return null;
            }
          }
          
          public Object doCall(Object it)
          {
            CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, arrayOfCallSite[1].callGetProperty(CiBuildConstants.class));
            arrayOfCallSite[2].callCurrent(this, arrayOfCallSite[3].callGetProperty(CiBuildConstants.class));
            arrayOfCallSite[4].callCurrent(this, new _closure29(getThisObject()));
            
            arrayOfCallSite[5].callCurrent(this, new _closure30(getThisObject()));
            
            arrayOfCallSite[6].callCurrent(this, new _closure31(getThisObject()));
            
            arrayOfCallSite[7].callCurrent(this, new _closure32(getThisObject()));
            
            arrayOfCallSite[8].callCurrent(this, null);
            return arrayOfCallSite[9].callCurrent(this, null);return null;
          }
          
          public Object doCall()
          {
            CallSite[] arrayOfCallSite = $getCallSiteArray();
            return doCall(null);
            return null;
          }
        }
        
        public Object doCall(Object it)
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, new _closure27(getThisObject()));
          
          return arrayOfCallSite[1].callCurrent(this, new _closure28(getThisObject()));return null;
        }
        
        public Object doCall()
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return doCall(null);
          return null;
        }
        
        public class _closure28
          extends Closure
          implements GeneratedClosure
        {
          public _closure28(Object _thisObject)
          {
            super(_thisObject);
          }
          
          public Object doCall(Object it)
          {
            CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, arrayOfCallSite[1].callGetProperty(CiBuildConstants.class));
            arrayOfCallSite[2].callCurrent(this, Boolean.valueOf(false));
            arrayOfCallSite[3].callCurrent(this, null);
            return arrayOfCallSite[4].callCurrent(this, null);return null;
          }
          
          public Object doCall()
          {
            CallSite[] arrayOfCallSite = $getCallSiteArray();
            return doCall(null);
            return null;
          }
        }
      }
    }
    
    public class _closure23
      extends Closure
      implements GeneratedClosure
    {
      public _closure23(Object _thisObject)
      {
        super(_thisObject);
      }
      
      public Object doCall(Object it)
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();return arrayOfCallSite[0].callCurrent(this, Boolean.valueOf(true));return null;
      }
      
      public Object doCall()
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
        return null;
      }
    }
    
    public Object doCall(Object it)
    {
      CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, new _closure22(getThisObject()));
      
      arrayOfCallSite[1].callCurrent(this, "clean install -U jacoco:prepare-agent jacoco:report-aggregate sonar:sonar -Dsonar.host.url=$SONAR_HOST_URL");
      arrayOfCallSite[2].callCurrent(this, arrayOfCallSite[3].callGetProperty(CiBuildConstants.class));
      arrayOfCallSite[4].callCurrent(this, "pom.xml");
      arrayOfCallSite[5].callCurrent(this);
      arrayOfCallSite[6].callCurrent(this);
      arrayOfCallSite[7].callCurrent(this, new _closure23(getThisObject()));
      return arrayOfCallSite[8].callCurrent(this, new _closure24(getThisObject()));return null;
    }
    
    public Object doCall()
    {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
      return null;
    }
    
    public class _closure24
      extends Closure
      implements GeneratedClosure
    {
      public _closure24(Object _thisObject)
      {
        super(_thisObject);
      }
      
      public class _closure33
        extends Closure
        implements GeneratedClosure
      {
        public _closure33(Object _thisObject)
        {
          super(_thisObject);
        }
        
        public class _closure36
          extends Closure
          implements GeneratedClosure
        {
          public _closure36(Object _thisObject)
          {
            super(_thisObject);
          }
          
          public class _closure39
            extends Closure
            implements GeneratedClosure
          {
            public _closure39(Object _thisObject)
            {
              super(_thisObject);
            }
            
            public Object doCall(Object it)
            {
              CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, arrayOfCallSite[1].callGetProperty(CiBuildConstants.class));
              arrayOfCallSite[2].callCurrent(this, null);
              return arrayOfCallSite[3].callCurrent(this, Boolean.valueOf(false));return null;
            }
            
            public Object doCall()
            {
              CallSite[] arrayOfCallSite = $getCallSiteArray();
              return doCall(null);
              return null;
            }
          }
          
          public class _closure40
            extends Closure
            implements GeneratedClosure
          {
            public _closure40(Object _thisObject)
            {
              super(_thisObject);
            }
            
            public Object doCall(Object it)
            {
              CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, arrayOfCallSite[1].callGetProperty(CiBuildConstants.class));
              arrayOfCallSite[2].callCurrent(this, null);
              return arrayOfCallSite[3].callCurrent(this, Boolean.valueOf(false));return null;
            }
            
            public Object doCall()
            {
              CallSite[] arrayOfCallSite = $getCallSiteArray();
              return doCall(null);
              return null;
            }
          }
          
          public Object doCall(Object it)
          {
            CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, arrayOfCallSite[1].callGetProperty(CiBuildConstants.class));
            arrayOfCallSite[2].callCurrent(this, arrayOfCallSite[3].callGetProperty(CiBuildConstants.class));
            arrayOfCallSite[4].callCurrent(this, new _closure39(getThisObject()));
            
            arrayOfCallSite[5].callCurrent(this, new _closure40(getThisObject()));
            
            arrayOfCallSite[6].callCurrent(this, null);
            arrayOfCallSite[7].callCurrent(this, null);
            arrayOfCallSite[8].callCurrent(this, null);
            return arrayOfCallSite[9].callCurrent(this, null);return null;
          }
          
          public Object doCall()
          {
            CallSite[] arrayOfCallSite = $getCallSiteArray();
            return doCall(null);
            return null;
          }
        }
        
        public class _closure37
          extends Closure
          implements GeneratedClosure
        {
          public _closure37(Object _thisObject)
          {
            super(_thisObject);
          }
          
          public Object doCall(Object it)
          {
            CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, null);
            arrayOfCallSite[1].callCurrent(this, null);
            arrayOfCallSite[2].callCurrent(this, null);
            return arrayOfCallSite[3].callCurrent(this, Boolean.valueOf(false));return null;
          }
          
          public Object doCall()
          {
            CallSite[] arrayOfCallSite = $getCallSiteArray();
            return doCall(null);
            return null;
          }
        }
        
        public class _closure38
          extends Closure
          implements GeneratedClosure
        {
          public _closure38(Object _thisObject)
          {
            super(_thisObject);
          }
          
          public Object doCall(Object it)
          {
            CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, null);
            return arrayOfCallSite[1].callCurrent(this, "*password*,*secret*,*key*");return null;
          }
          
          public Object doCall()
          {
            CallSite[] arrayOfCallSite = $getCallSiteArray();
            return doCall(null);
            return null;
          }
        }
        
        public Object doCall(Object it)
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, new _closure36(getThisObject()));
          
          arrayOfCallSite[1].callCurrent(this, Boolean.valueOf(true));
          arrayOfCallSite[2].callCurrent(this, null);
          arrayOfCallSite[3].callCurrent(this, new _closure37(getThisObject()));
          
          arrayOfCallSite[4].callCurrent(this, Boolean.valueOf(false));
          arrayOfCallSite[5].callCurrent(this, new _closure38(getThisObject()));
          
          arrayOfCallSite[6].callCurrent(this, Boolean.valueOf(true));
          arrayOfCallSite[7].callCurrent(this, Boolean.valueOf(true));
          arrayOfCallSite[8].callCurrent(this, Boolean.valueOf(false));
          arrayOfCallSite[9].callCurrent(this, null);
          arrayOfCallSite[10].callCurrent(this, Boolean.valueOf(false));
          arrayOfCallSite[11].callCurrent(this, null);
          arrayOfCallSite[12].callCurrent(this, Boolean.valueOf(false));
          arrayOfCallSite[13].callCurrent(this, Boolean.valueOf(false));
          arrayOfCallSite[14].callCurrent(this, Boolean.valueOf(false));
          arrayOfCallSite[15].callCurrent(this, Boolean.valueOf(true));
          arrayOfCallSite[16].callCurrent(this, null);
          arrayOfCallSite[17].callCurrent(this, Boolean.valueOf(false));
          arrayOfCallSite[18].callCurrent(this, Boolean.valueOf(false));
          arrayOfCallSite[19].callCurrent(this, null);
          arrayOfCallSite[20].callCurrent(this, Boolean.valueOf(false));
          arrayOfCallSite[21].callCurrent(this, Boolean.valueOf(false));
          arrayOfCallSite[22].callCurrent(this, null);
          arrayOfCallSite[23].callCurrent(this, Boolean.valueOf(false));
          arrayOfCallSite[24].callCurrent(this, Boolean.valueOf(false));
          arrayOfCallSite[25].callCurrent(this, null);
          arrayOfCallSite[26].callCurrent(this, null);
          arrayOfCallSite[27].callCurrent(this, null);
          arrayOfCallSite[28].callCurrent(this, null);
          arrayOfCallSite[29].callCurrent(this, Boolean.valueOf(false));
          arrayOfCallSite[30].callCurrent(this, Boolean.valueOf(true));
          arrayOfCallSite[31].callCurrent(this, Boolean.valueOf(true));
          return arrayOfCallSite[32].callCurrent(this, Boolean.valueOf(true));return null;
        }
        
        public Object doCall()
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return doCall(null);
          return null;
        }
      }
      
      public class _closure34
        extends Closure
        implements GeneratedClosure
      {
        public _closure34(Object _thisObject)
        {
          super(_thisObject);
        }
        
        public Object doCall(Object it)
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this);
          return arrayOfCallSite[1].callCurrent(this);return null;
        }
        
        public Object doCall()
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return doCall(null);
          return null;
        }
      }
      
      public Object doCall(Object it)
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, new _closure33(getThisObject()));
        
        arrayOfCallSite[1].callCurrent(this, "**/target/surefire-reports/*.xml", new _closure34(getThisObject()));
        
        return arrayOfCallSite[2].callCurrent(this, new _closure35(getThisObject()));return null;
      }
      
      public Object doCall()
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
        return null;
      }
      
      public class _closure35
        extends Closure
        implements GeneratedClosure
      {
        public _closure35(Object _thisObject)
        {
          super(_thisObject);
        }
        
        public Object doCall(Object it)
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, "20");
          arrayOfCallSite[1].callCurrent(this, "20");
          arrayOfCallSite[2].callCurrent(this, "20");
          arrayOfCallSite[3].callCurrent(this, "20");
          arrayOfCallSite[4].callCurrent(this, "20");
          arrayOfCallSite[5].callCurrent(this, "20");
          arrayOfCallSite[6].callCurrent(this, "80");
          arrayOfCallSite[7].callCurrent(this, "80");
          arrayOfCallSite[8].callCurrent(this, "80");
          arrayOfCallSite[9].callCurrent(this, "80");
          arrayOfCallSite[10].callCurrent(this, "80");
          return arrayOfCallSite[11].callCurrent(this, "80");return null;
        }
        
        public Object doCall()
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return doCall(null);
          return null;
        }
      }
    }
  }
  
  public static MavenJob mavenJob(DslFactory dslFactory, String jobUrl)
  {
    CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[24].call(arrayOfCallSite[25].callGetProperty(dslFactory), new GStringImpl(new Object[] { jobUrl }, new String[] { "creating job: ", "" }));
    MavenJob job = (MavenJob)ScriptBytecodeAdapter.castToType(arrayOfCallSite[26].call(dslFactory, jobUrl, new _mavenJob_closure3(JobFactory.class, JobFactory.class)), MavenJob.class);
    
    arrayOfCallSite[27].callStatic(JobFactory.class, job);
    return job;return null;
  }
  
  public static void fillSvnInfo(Job job, String svnUrl)
  {
    Reference svnUrl = new Reference(svnUrl);CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[28].call(job, new _fillSvnInfo_closure4(JobFactory.class, JobFactory.class, svnUrl));
  }
  
  public class _fillSvnInfo_closure4
    extends Closure
    implements GeneratedClosure
  {
    public _fillSvnInfo_closure4(Object _thisObject, Reference svnUrl)
    {
      super(_thisObject);
      Reference localReference = svnUrl;
      this.svnUrl = localReference;
    }
    
    public Object doCall(Object it)
    {
      CallSite[] arrayOfCallSite = $getCallSiteArray();return arrayOfCallSite[0].callCurrent(this, new _closure41(getThisObject(), this.svnUrl));return null;
    }
    
    public String getSvnUrl()
    {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (String)ShortTypeHandling.castToString(this.svnUrl.get());
      return null;
    }
    
    public Object doCall()
    {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
      return null;
    }
    
    public class _closure41
      extends Closure
      implements GeneratedClosure
    {
      public _closure41(Object _thisObject, Reference svnUrl)
      {
        super(_thisObject);
        Reference localReference = svnUrl;
        this.svnUrl = localReference;
      }
      
      public class _closure42
        extends Closure
        implements GeneratedClosure
      {
        public _closure42(Object _thisObject)
        {
          super(_thisObject);
        }
        
        public Object doCall(Object it)
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();return arrayOfCallSite[0].callCurrent(this, arrayOfCallSite[1].callGetProperty(CiBuildConstants.class));return null;
        }
        
        public Object doCall()
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return doCall(null);
          return null;
        }
      }
      
      public Object doCall(Object it)
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();return arrayOfCallSite[0].callCurrent(this, this.svnUrl.get(), new _closure42(getThisObject()));return null;
      }
      
      public String getSvnUrl()
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return (String)ShortTypeHandling.castToString(this.svnUrl.get());
        return null;
      }
      
      public Object doCall()
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
        return null;
      }
    }
  }
  
  public static void fillGitInfo(Job job, String gitRepoUrl, String gitBranch)
  {
    Reference gitRepoUrl = new Reference(gitRepoUrl);Reference gitBranch = new Reference(gitBranch);CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[29].call(job, new _fillGitInfo_closure5(JobFactory.class, JobFactory.class, gitRepoUrl, gitBranch));
  }
  
  public class _fillGitInfo_closure5
    extends Closure
    implements GeneratedClosure
  {
    public _fillGitInfo_closure5(Object _thisObject, Reference gitRepoUrl, Reference gitBranch)
    {
      super(_thisObject);
      Reference localReference1 = gitRepoUrl;
      this.gitRepoUrl = localReference1;
      Reference localReference2 = gitBranch;
      this.gitBranch = localReference2;
    }
    
    public class _closure43
      extends Closure
      implements GeneratedClosure
    {
      public _closure43(Object _thisObject, Reference gitRepoUrl, Reference gitBranch)
      {
        super(_thisObject);
        Reference localReference1 = gitRepoUrl;
        this.gitRepoUrl = localReference1;
        Reference localReference2 = gitBranch;
        this.gitBranch = localReference2;
      }
      
      public Object doCall(Object it)
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();return arrayOfCallSite[0].callCurrent(this, new _closure45(getThisObject(), this.gitRepoUrl, this.gitBranch));return null;
      }
      
      public String getGitRepoUrl()
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return (String)ShortTypeHandling.castToString(this.gitRepoUrl.get());
        return null;
      }
      
      public String getGitBranch()
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return (String)ShortTypeHandling.castToString(this.gitBranch.get());
        return null;
      }
      
      public Object doCall()
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
        return null;
      }
      
      public class _closure45
        extends Closure
        implements GeneratedClosure
      {
        public _closure45(Object _thisObject, Reference gitRepoUrl, Reference gitBranch)
        {
          super(_thisObject);
          Reference localReference1 = gitRepoUrl;
          this.gitRepoUrl = localReference1;
          Reference localReference2 = gitBranch;
          this.gitBranch = localReference2;
        }
        
        public class _closure46
          extends Closure
          implements GeneratedClosure
        {
          public _closure46(Object _thisObject, Reference gitRepoUrl)
          {
            super(_thisObject);
            Reference localReference = gitRepoUrl;
            this.gitRepoUrl = localReference;
          }
          
          public Object doCall(Object it)
          {
            CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, this.gitRepoUrl.get());
            return arrayOfCallSite[1].callCurrent(this, arrayOfCallSite[2].callGetProperty(CiBuildConstants.class));return null;
          }
          
          public String getGitRepoUrl()
          {
            CallSite[] arrayOfCallSite = $getCallSiteArray();
            return (String)ShortTypeHandling.castToString(this.gitRepoUrl.get());
            return null;
          }
          
          public Object doCall()
          {
            CallSite[] arrayOfCallSite = $getCallSiteArray();
            return doCall(null);
            return null;
          }
        }
        
        public class _closure47
          extends Closure
          implements GeneratedClosure
        {
          public _closure47(Object _thisObject)
          {
            super(_thisObject);
          }
          
          public Object doCall(Object it)
          {
            CallSite[] arrayOfCallSite = $getCallSiteArray();return arrayOfCallSite[0].callCurrent(this, arrayOfCallSite[1].callGetProperty(CiBuildConstants.class));return null;
          }
          
          public Object doCall()
          {
            CallSite[] arrayOfCallSite = $getCallSiteArray();
            return doCall(null);
            return null;
          }
        }
        
        public Object doCall(Object it)
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, new _closure46(getThisObject(), this.gitRepoUrl));
          
          arrayOfCallSite[1].callCurrent(this, this.gitBranch.get());
          arrayOfCallSite[2].callCurrent(this, new _closure47(getThisObject()));
          return arrayOfCallSite[3].callCurrent(this, new _closure48(getThisObject()));return null;
        }
        
        public String getGitRepoUrl()
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return (String)ShortTypeHandling.castToString(this.gitRepoUrl.get());
          return null;
        }
        
        public String getGitBranch()
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return (String)ShortTypeHandling.castToString(this.gitBranch.get());
          return null;
        }
        
        public Object doCall()
        {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return doCall(null);
          return null;
        }
        
        public class _closure48
          extends Closure
          implements GeneratedClosure
        {
          public _closure48(Object _thisObject)
          {
            super(_thisObject);
          }
          
          public Object doCall(Object it)
          {
            CallSite[] arrayOfCallSite = $getCallSiteArray();return arrayOfCallSite[0].callCurrent(this, new _closure49(getThisObject()));return null;
          }
          
          public Object doCall()
          {
            CallSite[] arrayOfCallSite = $getCallSiteArray();
            return doCall(null);
            return null;
          }
          
          public class _closure49
            extends Closure
            implements GeneratedClosure
          {
            public _closure49(Object _thisObject)
            {
              super(_thisObject);
            }
            
            public Object doCall(Object it)
            {
              CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this);
              return arrayOfCallSite[1].callCurrent(this);return null;
            }
            
            public Object doCall()
            {
              CallSite[] arrayOfCallSite = $getCallSiteArray();
              return doCall(null);
              return null;
            }
          }
        }
      }
    }
    
    public class _closure44
      extends Closure
      implements GeneratedClosure
    {
      public _closure44(Object _thisObject)
      {
        super(_thisObject);
      }
      
      public Object doCall(Object it)
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();return arrayOfCallSite[0].callCurrent(this);return null;
      }
      
      public Object doCall()
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
        return null;
      }
    }
    
    public Object doCall(Object it)
    {
      CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, new _closure43(getThisObject(), this.gitRepoUrl, this.gitBranch));
      
      return arrayOfCallSite[1].callCurrent(this, new _closure44(getThisObject()));return null;
    }
    
    public String getGitRepoUrl()
    {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (String)ShortTypeHandling.castToString(this.gitRepoUrl.get());
      return null;
    }
    
    public String getGitBranch()
    {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (String)ShortTypeHandling.castToString(this.gitBranch.get());
      return null;
    }
    
    public Object doCall()
    {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
      return null;
    }
  }
  
  public static void addMavenReleaseCandidateSteps(MavenJob job)
  {
    CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[30].call(job, "UNSTABLE", new _addMavenReleaseCandidateSteps_closure6(JobFactory.class, JobFactory.class));
  }
  
  public class _addMavenReleaseCandidateSteps_closure6
    extends Closure
    implements GeneratedClosure
  {
    public _addMavenReleaseCandidateSteps_closure6(Object _thisObject)
    {
      super(_thisObject);
    }
    
    public Object doCall(Object it)
    {
      CallSite[] arrayOfCallSite = $getCallSiteArray();return arrayOfCallSite[0].callCurrent(this, new _closure50(getThisObject()));return null;
    }
    
    public Object doCall()
    {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
      return null;
    }
    
    public class _closure50
      extends Closure
      implements GeneratedClosure
    {
      public _closure50(Object _thisObject)
      {
        super(_thisObject);
      }
      
      public Object doCall(Object it)
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[0].callCurrent(this, "copy:copy@copy-rc -Drc.skip=false -U");
        return arrayOfCallSite[1].callCurrent(this, arrayOfCallSite[2].callGetProperty(CiBuildConstants.class));return null;
      }
      
      public Object doCall()
      {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
        return null;
      }
    }
  }
  
  public static void addMailer(Job job, String mailRecipients, boolean dontNotifyEveryUnstableBuild, boolean sendToIndividuals)
  {
    Reference mailRecipients = new Reference(mailRecipients);Reference dontNotifyEveryUnstableBuild = new Reference(Boolean.valueOf(dontNotifyEveryUnstableBuild));Reference sendToIndividuals = new Reference(Boolean.valueOf(sendToIndividuals));CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[31].call(job, new _addMailer_closure7(JobFactory.class, JobFactory.class, dontNotifyEveryUnstableBuild, mailRecipients, sendToIndividuals));
  }
  
  public class _addMailer_closure7
    extends Closure
    implements GeneratedClosure
  {
    public _addMailer_closure7(Object _thisObject, Reference dontNotifyEveryUnstableBuild, Reference mailRecipients, Reference sendToIndividuals)
    {
      super(_thisObject);
      Reference localReference1 = dontNotifyEveryUnstableBuild;
      this.dontNotifyEveryUnstableBuild = localReference1;
      Reference localReference2 = mailRecipients;
      this.mailRecipients = localReference2;
      Reference localReference3 = sendToIndividuals;
      this.sendToIndividuals = localReference3;
    }
    
    public Object doCall(Object it)
    {
      CallSite[] arrayOfCallSite = $getCallSiteArray();return arrayOfCallSite[0].callCurrent(this, this.mailRecipients.get(), this.dontNotifyEveryUnstableBuild.get(), this.sendToIndividuals.get());return null;
    }
    
    public boolean getDontNotifyEveryUnstableBuild()
    {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return DefaultTypeTransformation.booleanUnbox(this.dontNotifyEveryUnstableBuild.get());
      return DefaultTypeTransformation.booleanUnbox(Integer.valueOf(0));
    }
    
    public String getMailRecipients()
    {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (String)ShortTypeHandling.castToString(this.mailRecipients.get());
      return null;
    }
    
    public boolean getSendToIndividuals()
    {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return DefaultTypeTransformation.booleanUnbox(this.sendToIndividuals.get());
      return DefaultTypeTransformation.booleanUnbox(Integer.valueOf(0));
    }
    
    public Object doCall()
    {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
      return null;
    }
  }
  
  public class _mavenSkipTests_closure8
    extends Closure
    implements GeneratedClosure
  {
    public _mavenSkipTests_closure8(Object _thisObject)
    {
      super(_thisObject);
    }
    
    public Object doCall(Object it)
    {
      CallSite[] arrayOfCallSite = $getCallSiteArray();return arrayOfCallSite[0].callCurrent(this, "-DskipTests");return null;
    }
    
    public Object doCall()
    {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
      return null;
    }
  }
  
  public static void mavenSkipTests(MavenJob job)
  {
    CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[32].call(job, new _mavenSkipTests_closure8(JobFactory.class, JobFactory.class));
  }
  
  public static void fillGitInfo(Job job, String gitRepoUrl)
  {
    Reference gitRepoUrl = new Reference(gitRepoUrl);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    fillGitInfo(job, (String)gitRepoUrl.get(), (String)"master");
    null;
  }
  
  public static void addMailer(Job job, String mailRecipients, boolean dontNotifyEveryUnstableBuild)
  {
    Reference mailRecipients = new Reference(mailRecipients);
    Reference dontNotifyEveryUnstableBuild = new Reference(Boolean.valueOf(dontNotifyEveryUnstableBuild));
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    addMailer(job, (String)mailRecipients.get(), DefaultTypeTransformation.booleanUnbox(dontNotifyEveryUnstableBuild.get()), true);
    null;
  }
  
  public static void addMailer(Job job, String mailRecipients)
  {
    Reference mailRecipients = new Reference(mailRecipients);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    addMailer(job, (String)mailRecipients.get(), true, true);
    null;
  }
}
