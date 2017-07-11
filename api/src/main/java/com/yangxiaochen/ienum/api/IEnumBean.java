package com.yangxiaochen.ienum.api;

/**
 * 枚举值的容器
 * @author yangxiaochen
 * @date 2017/7/11 14:47
 */
public class IEnumBean<V> implements IEnum<V> {

    private V value;
    private String desc;

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
