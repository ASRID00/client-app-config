package com.abi.test.config.clientapp.clientappconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class TestPojo {
	
	@Value("${client-app-config.wowfeature:none}")
	private String fromConfigServer;
	private String fromCurrentAppYml = "From local";
	
	
	public String getFromConfigServer() {
		return fromConfigServer;
	}
	public String getFromCurrentAppYml() {
		return fromCurrentAppYml;
	}
	

}
