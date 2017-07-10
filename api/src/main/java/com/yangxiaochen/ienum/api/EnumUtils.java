package com.yangxiaochen.ienum.api;

/**
 * @author yangxiaochen
 * @date 2017/6/28 11:29
 */
public abstract class EnumUtils {

    public static <E, V> E forValue(V value, Class<? extends IEnum> type) {
        if (!type.isEnum()) {
            throw new IllegalArgumentException("Type: " + type + " must be a enum");
        }
        for (IEnum iEnum : type.getEnumConstants()) {
            if (iEnum.getValue().equals(value)) {
                return (E) iEnum;
            }
        }
        return null;
    }
}
