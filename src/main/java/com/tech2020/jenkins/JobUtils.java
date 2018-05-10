package com.tech2020.jenkins;

import groovy.lang.GroovyObject;
import java.util.regex.Pattern;
import org.codehaus.groovy.reflection.ClassInfo;
import groovy.lang.MetaClass;
import org.codehaus.groovy.runtime.callsite.CallSite;
import java.io.File;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import javaposse.jobdsl.dsl.DslFactory;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

public class JobUtils implements GroovyObject {

	private static final Pattern JOBS_PREFIX;

	public JobUtils() {
		super();
		CallSite[] $getCallSiteArray = $getCallSiteArray();
		MetaClass $getStaticMetaClass = this.$getStaticMetaClass();
		this.metaClass = $getStaticMetaClass;
	}

	public static String getRelativePath(String path, final String seedJobName) {
		final CallSite[] $getCallSiteArray = $getCallSiteArray();
		final String jobsFolderPrefix = (String) ShortTypeHandling
				.castToString(
						$getCallSiteArray[0].call(
								$getCallSiteArray[1].call(
										$getCallSiteArray[2]
												.call($getCallSiteArray[3].call(
														$getCallSiteArray[4].call($getCallSiteArray[5]
																.callConstructor(StringBuilder.class), seedJobName),
														$getCallSiteArray[6].callGetProperty(File.class)), "jobs"),
										$getCallSiteArray[7].callGetProperty(File.class))));
		if (DefaultTypeTransformation.booleanUnbox($getCallSiteArray[8].call(path, jobsFolderPrefix))) {
			final Object call = $getCallSiteArray[9].call(
					$getCallSiteArray[10].call(JobUtils.JOBS_PREFIX, 
					$getCallSiteArray[11].call(path, $getCallSiteArray[12].call(path, jobsFolderPrefix))),
					$getCallSiteArray[13].callGetProperty(CiBuildConstants.class));
			path = (String) ShortTypeHandling.castToString(call);
		}
		return (String) ShortTypeHandling.castToString($getCallSiteArray[14].call($getCallSiteArray[15]
				.call($getCallSiteArray[16].call(Pattern.class, $getCallSiteArray[17].callGetProperty(File.class),
						$getCallSiteArray[18].callGetProperty(Pattern.class)), path), "/"));
	}

	public static String getRelativePath(final DslFactory dslFactory) {
		final CallSite[] $getCallSiteArray = $getCallSiteArray();
		final String path = (String) ShortTypeHandling.castToString($getCallSiteArray[19].callGetProperty(dslFactory));
		final String pathWithoutGroovyExtension = (String) ShortTypeHandling
				.castToString($getCallSiteArray[20].call(path, Integer.valueOf(0),
						$getCallSiteArray[21].call($getCallSiteArray[22].call(path), Integer.valueOf(7))));
		return (String) ShortTypeHandling
				.castToString($getCallSiteArray[23].callStatic(JobUtils.class, pathWithoutGroovyExtension,
						$getCallSiteArray[24].callGetProperty($getCallSiteArray[25].callGetProperty(dslFactory))));
	}

	static {
		final Object call = $getCallSiteArray()[26].call(Pattern.class,
				$getCallSiteArray()[27].call($getCallSiteArray()[28].callGetProperty(File.class), "jobs"),
				$getCallSiteArray()[29].callGetProperty(Pattern.class));
		JOBS_PREFIX = (Pattern) ScriptBytecodeAdapter.castToType(call, Pattern.class);
	}

}