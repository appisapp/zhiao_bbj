package com.zhiao.blzc.modules.sys.listener;

import com.zhiao.blzc.modules.sys.service.SystemService;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;

public class WebContextListener extends org.springframework.web.context.ContextLoaderListener {
	
	@Override
	public WebApplicationContext initWebApplicationContext(ServletContext servletContext) {
		if (!SystemService.printKeyLoadMessage()){
			return null;
		}
		return super.initWebApplicationContext(servletContext);
	}
}
