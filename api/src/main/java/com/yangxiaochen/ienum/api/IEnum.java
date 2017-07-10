package com.yangxiaochen.ienum.api;

/**
 * @author yangxiaochen
 * @date 2017/7/10 15:33
 */
public interface IEnum<V, D> {

    V getValue();

    D getDesc();
}
