package com.web.logjc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonLoggerFactory {

	public static final Logger APP_LOGGER = LoggerFactory.getLogger("app-logger");
	
	public static final Logger SUB_APP_LOGGER = LoggerFactory.getLogger("sub-app-logger");
}
