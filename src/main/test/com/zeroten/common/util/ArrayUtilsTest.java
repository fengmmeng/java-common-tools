package com.zeroten.common.util;

import org.junit.Test;

import java.util.Arrays;

public class ArrayUtilsTest {
    @Test
    public void sortTest() {
        System.out.println(Arrays.toString(ArrayUtils.sort(new int[]{21,4,66,3,7,9})));
    }
}
