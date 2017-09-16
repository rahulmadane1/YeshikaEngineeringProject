package com.cg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.boot.DemoSpringNewApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoSpringNewApplication.class)
@WebAppConfiguration
public class DemoSpringNewApplicationTests {

	@Test
	public void contextLoads() {
	}

}
