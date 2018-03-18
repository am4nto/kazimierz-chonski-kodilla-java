package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testLog() {
        Logger.getInstance().log("Log testowy");
        Assert.assertEquals("Log testowy", Logger.getInstance().getLastLog());
    }
}
