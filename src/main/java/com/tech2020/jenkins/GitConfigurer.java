package com.tech2020.jenkins;

import java.util.List;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import java.util.regex.Matcher;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.callsite.CallSite;
import groovy.lang.MetaClass;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

public abstract class GitConfigurer extends ScmConfigurer {

	protected final String projectOrUser;

	protected final String repo;

	protected final String browseUrl;

	protected List<String> branches;

	public GitConfigurer(final String url) {

		final CallSite[] $getCallSiteArray = $getCallSiteArray();

		super((String) ShortTypeHandling.castToString($getCallSiteArray[0].callSafe(url)));

		final List<E> createList = ScriptBytecodeAdapter.createList(new Object[0]);

		this.branches = createList;

		Matcher m = (Matcher) ScriptBytecodeAdapter.castToType(
				ScriptBytecodeAdapter.findRegex(url, $getCallSiteArray[1].callGetProperty(CiBuildConstants.class)),
				Matcher.class);

		if (DefaultTypeTransformation.booleanUnbox($getCallSiteArray[2].call(m))) {

			final Object call = $getCallSiteArray[3].call(m, "project");

			this.projectOrUser = (String) ShortTypeHandling.castToString(call);

			final Object call2 = $getCallSiteArray[4].call(m, "repo");

			this.repo = (String) ShortTypeHandling.castToString(call2);

			final Object o = new GStringImpl(new Object[] {
					$getCallSiteArray[5].callGetProperty(CiBuildConstants.class), this.projectOrUser, this.repo },
					new String[] { "", "/projects/", "/repos/", "" });

			this.browseUrl = (String) ShortTypeHandling.castToString(o);

			return;

		}

		final Object findRegex = ScriptBytecodeAdapter.findRegex(url,
				$getCallSiteArray[6].callGetProperty(CiBuildConstants.class));

		m = (Matcher) ScriptBytecodeAdapter.castToType(findRegex, Matcher.class);

		if (DefaultTypeTransformation.booleanUnbox($getCallSiteArray[7].call(m))) {

			final Object call3 = $getCallSiteArray[8].call(m, "user");

			this.projectOrUser = (String) ShortTypeHandling.castToString(call3);

			final Object call4 = $getCallSiteArray[9].call(m, "repo");

			this.repo = (String) ShortTypeHandling.castToString(call4);

			final Object o2 = new GStringImpl(new Object[] {
					$getCallSiteArray[10].callGetProperty(CiBuildConstants.class), this.projectOrUser, this.repo },
					new String[] { "", "/users/", "/repos/", "" });

			this.browseUrl = (String) ShortTypeHandling.castToString(o2);

			return;

		}

		throw (Throwable) $getCallSiteArray[11].callConstructor(IllegalArgumentException.class,
				new GStringImpl(new Object[] { url }, new String[] { "Unrecognized git repo format: ", "" }));

	}

	public final StashConfigurer branches(final String... branches) {

		final CallSite[] $getCallSiteArray = $getCallSiteArray();

		this.branches = (List<E>) ScriptBytecodeAdapter.castToType(branches, List.class);

		return (StashConfigurer) ScriptBytecodeAdapter.castToType(this, StashConfigurer.class);

	}

	public final StashConfigurer branch(final String branch) {

		final CallSite[] $getCallSiteArray = $getCallSiteArray();

		final Object createList = ScriptBytecodeAdapter.createList(new Object[] { branch });

		this.branches = (List<E>) ScriptBytecodeAdapter.castToType(createList, List.class);

		return (StashConfigurer) ScriptBytecodeAdapter.castToType(this, StashConfigurer.class);

	}

}