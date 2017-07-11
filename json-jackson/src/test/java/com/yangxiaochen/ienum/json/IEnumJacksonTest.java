package com.yangxiaochen.ienum.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.yangxiaochen.ienum.api.IEnum;
import com.yangxiaochen.inum.json.jackson.IEnumSerializer;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * @author yangxiaochen
 * @date 2017/7/10 18:23
 */
public class IEnumJacksonTest {

    @JsonSerialize(using = IEnumSerializer.class)
    enum UserStatus implements IEnum<Integer>

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


    public static class User {
        UserStatus status;

        public UserStatus getStatus() {
            return status;
        }

        public void setStatus(UserStatus status) {
            this.status = status;
        }
    }



    @Test
    public void test() throws IOException {
        ObjectMapper om = new ObjectMapper();
        Assert.assertEquals("{\"value\":\"1\",\"desc\":\"正常\"}", om.writeValueAsString(UserStatus.NORMAL));
    }
}
