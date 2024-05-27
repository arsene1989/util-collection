package com.andres.utils.test;

import com.andres.utils.OperationSystemUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author hjs
 */
public class OperationSystemTest {

    @Test
    public void testMacOS(){
        Assert.assertTrue(OperationSystemUtil.isMac());
    }

    @Test
    public void testWindowsOS(){
        Assert.assertTrue(OperationSystemUtil.isWindows());
    }
}
