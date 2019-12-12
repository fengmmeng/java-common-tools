package com.zeroten.common.util;

public class CheckUtils {


    /**
     *  String...strings 为可变参数，你可以认为它是String[] strings。如果strings中有
     *  任意一个空字符串，则返回false，否则返回true
     */

    public static boolean isAnyEmpty(String... strings){
        if(strings != null && strings.length > 0){
            for(String str : strings){
                if(str == null){
                    continue;
                }else if(str.length() == 0){
                    return false;
                }
            }
        }
        return true;
    }


    /**
     *判断引用类型数组是否为空，为空或null则返回true，否则返回false。
     */
    public static boolean isEmpty(Object[] arr){
        if( arr == null || arr.length ==0){
            return true;
        }
        return false;
    }

    /**
     *  判断str1字符串是否相等，相等返回true，否则返回false。当其中一个是null时返回false。
     */
    public static boolean equals(String str1,String str2) {
//        if (str1 == null || str2 == null) {
//            return false;
//        } else if (str1 == str2) {
//            return true;
//        }
//        return false;
        if(str1 == str2){
            return true;
        }
        return false;

    }


    /**
     * 判断n1和n2的值是否相等，相等返回true，否则返回false。当其中一个是null时返回false。
     */
    public static boolean equals(Integer n1,Integer n2){
        if(n1 == null || n2 == null){
            return false;
        }else if(n1.byteValue() == n2.byteValue()){
            return true;
        }
        return false;
    }
}
