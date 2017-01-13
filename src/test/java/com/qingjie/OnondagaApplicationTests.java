package com.qingjie;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qingjie.service.CarProperties;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OnondagaApplicationTests {
	private Logger logger = Logger.getLogger(getClass());

	@Autowired
	private CarProperties carProperties;

	@Test
	public void test1() throws Exception {
		
		logger.info("=====info====");
		logger.debug("====debug====");
		logger.error("====error====");
		
		Assert.assertEquals("name1", carProperties.getName());
		Assert.assertEquals("title1", carProperties.getTitle());
		Assert.assertEquals("name1 - title1", carProperties.getDesc());

		logger.info("current env: " + carProperties.getCurrent_env());
		logger.info("Random string: " + carProperties.getValue());
		logger.info("Random int: " + carProperties.getNumber());
		logger.info("Random long: " + carProperties.getBignumber());
		logger.info("Random number in 10: " + carProperties.getTest1());
		logger.info("Random number from 10 to 20:" + carProperties.getTest2());

	}

}
