package com.yangxiaochen.inum.json.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.yangxiaochen.ienum.api.IEnum;

import java.io.IOException;

/**
 * @author yangxiaochen
 * @date 2017/7/10 18:16
 */
public class IEnumD extends JsonDeserializer<IEnum> implements ResolvableDeserializer {


    @Override
    public IEnum deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return null;
    }

    @Override
    public void resolve(DeserializationContext ctxt) throws JsonMappingException {
        System.out.println(ctxt.getConfig());
    }
}
