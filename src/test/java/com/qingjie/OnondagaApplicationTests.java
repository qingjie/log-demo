package com.qingjie;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qingjie.service.CarProperties;

import ch.qos.logback.classic.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OnondagaApplicationTests {

	private static final Log log = LogFactory.getLog(OnondagaApplicationTests.class);

	@Autowired
	private CarProperties carProperties;

	@Test
	public void test1() throws Exception {
		Assert.assertEquals("name1", carProperties.getName());
		Assert.assertEquals("title1", carProperties.getTitle());
		Assert.assertEquals("name1 - title1", carProperties.getDesc());
		
		log.info("current env: " + carProperties.getCurrent_env());
		log.info("Random string: " + carProperties.getValue());
		log.info("Random int: " + carProperties.getNumber());
		log.info("Random long: " + carProperties.getBignumber());
		log.info("Random number in 10: " + carProperties.getTest1());
		log.info("Random number from 10 to 20:" + carProperties.getTest2());

	}

}
