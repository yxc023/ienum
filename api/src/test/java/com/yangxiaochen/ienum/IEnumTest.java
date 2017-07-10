package com.yangxiaochen.ienum;

import com.yangxiaochen.ienum.api.EnumUtils;
import com.yangxiaochen.ienum.api.IEnum;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author yangxiaochen
 * @date 2017/7/10 15:36
 */
public class IEnumTest {


    enum UserStatus implements IEnum<Integer, String>

    {
        NORMAL(1, "正常");


        public final Integer value;
        public final String desc;

        UserStatus(Integer value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        @Override
        public Integer getValue() {
            return value;
        }

        @Override
        public String getDesc() {
            return desc;
        }
    }

    @Test
    public void utilsTest() {
        UserStatus userStatus = EnumUtils.forValue(1, UserStatus.class);
        Assert.assertEquals(UserStatus.NORMAL, userStatus);
    }
}
