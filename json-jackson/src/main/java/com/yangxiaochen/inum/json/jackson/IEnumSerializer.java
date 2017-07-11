package com.yangxiaochen.inum.json.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.yangxiaochen.ienum.api.IEnum;

import java.io.IOException;

/**
 * @author yangxiaochen
 * @date 2017/7/10 15:54
 */
public class IEnumSerializer extends JsonSerializer<IEnum> {


    public static class IEnumBean {

        private String value;

        private String desc;


        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public static IEnumBean from(IEnum e) {
            IEnumBean bean = new IEnumBean();
            bean.setValue(e.getValue().toString());
            bean.setDesc(e.getDesc().toString());
            return bean;
        }
    }

    @Override
    public void serialize(IEnum value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
        gen.writeObject(IEnumBean.from(value));
    }
}
