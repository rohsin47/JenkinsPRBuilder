package com.tech2020.jenkins;

import javaposse.jobdsl.dsl.Job;

public abstract interface Configurer<J extends Job> {
	public abstract void configure(J paramJ);
}