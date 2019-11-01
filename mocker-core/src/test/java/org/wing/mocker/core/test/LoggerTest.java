package org.wing.mocker.core.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTest {
    Logger LOGGER= LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void test1() throws InterruptedException {
        LOGGER.info("hello syslog");
        Thread.sleep(100000);
    }
}
