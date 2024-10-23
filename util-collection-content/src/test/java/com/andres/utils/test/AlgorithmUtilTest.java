package com.andres.utils.test;

import com.andres.utils.algorithm.AlgorithmUtil;
import org.junit.Test;

/**
 * @author hjs
 */
public class AlgorithmUtilTest {

    @Test
    public void testSortedWord(){
        String line = "  asasca  asasc   asdasd asdasdasd  ddadcdcdc   a1222  asascac  qweqwe     qweweqwe";
        AlgorithmUtil.sortSentence(line);
    }
}
