package com.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;


@Component
public class JerseyConfig extends ResourceConfig {
	/**
	 * In constructor we can define Jersey Resources & Other Components
	 */
	public JerseyConfig() {
		 packages("com");
	}
}