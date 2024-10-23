package com.andres.utils.test;

import com.andres.utils.FileUtil;
import org.junit.Test;

/**
 * @author hjs
 */
public class FileUtilsTest {

    @Test
    public void testRename(){
        String path = "E:\\Newland\\流程引擎\\流程引擎批量操作存储过程\\act_hi_actinst\\2023";
        String bigBangPath = "C:\\Users\\HUAWEI\\Downloads\\514915-流程引擎服务taskCount存在大量超过5秒的请求-流程引擎";
        String keyword = "增加拦截器以过滤生产环境个性化审批业务调用流程引擎的慢SQL语句";
        String replacement = "流程引擎服务taskCount存在大量超过5秒的请求";
        FileUtil.batchRename(bigBangPath, keyword, replacement);
    }
}
