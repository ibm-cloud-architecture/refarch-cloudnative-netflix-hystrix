package com.ibm.microservices.refapp.hystrix;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//The commented line below come from the RESILIENCY branch.
//@SpringBootTest( properties = { "spring.cloud.discovery.enabled:false" } )
public class HystrixDashboardApplicationTests {

	@Test
	public void contextLoads() {
	}

}
