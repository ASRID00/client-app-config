package com.abi.test.config.clientapp.clientappconfig;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	private final TestPojo pojo;
	
	public  TestController(TestPojo pojo){
		this.pojo = pojo;
	}
	
	@RequestMapping("/test")
	public String test() {
		return String.format("Today's special is: %s", pojo.getFromConfigServer());
	}

}
