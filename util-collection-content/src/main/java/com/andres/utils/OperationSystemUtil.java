package com.andres.utils;

import com.andres.utils.constants.OperationSystemConstants;

/**
 * 操作系统工具
 * @author hjs
 */
public class OperationSystemUtil {
    private OperationSystemUtil(){}

    /**
     * 是否为Mac
     * @return boolean
     */
    public static boolean isMac(){
        String os = System.getProperty("os.name");
        return OperationSystemConstants.MAC_OS_X.equals(os);
    }

    /**
     * 是否为Windows
     * @return boolean 是否为windows
     */
    public static boolean isWindows(){
        String os = System.getProperty("os.name");
        return os.contains(OperationSystemConstants.WINDOWS);
    }
}
