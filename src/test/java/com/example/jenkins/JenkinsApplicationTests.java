package com.example.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.interceptor.LoggingCacheErrorHandler;

import ch.qos.logback.classic.Logger;

@SpringBootTest
class JenkinsApplicationTests {
  private static Logger logger = (Logger) LoggerFactory.getLogger(JenkinsApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("test case is executed");
		logger.info("test case is executed second *************************************");
		assertEquals(true, true);
	}

}
