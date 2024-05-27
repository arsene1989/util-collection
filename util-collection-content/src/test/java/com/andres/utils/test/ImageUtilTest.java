package com.andres.utils.test;

import com.andres.utils.ImageUtil;
import org.junit.Test;

/**
 * @author hjs
 */
public class ImageUtilTest {

    @Test
    public void testImageConvertGif(){
        String imagePath = "D:\\HuaweiMoveData\\Users\\HUAWEI\\Desktop\\微信图片_20240527092841.jpg";
        ImageUtil.convertImageToGif(imagePath);
    }
}
