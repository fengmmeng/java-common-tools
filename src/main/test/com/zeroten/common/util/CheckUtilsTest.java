package com.zeroten.common.util;
import org.junit.Assert;
import org.junit.Test;

public class CheckUtilsTest {
    @Test
    public void testIsAnyEmpty(){
        Assert.assertFalse(CheckUtils.isAnyEmpty(new String[]{"1", "2"," ",null,"","3"}));
        Assert.assertTrue(CheckUtils.isAnyEmpty(new String[]{}));
        Assert.assertTrue(CheckUtils.isAnyEmpty(null));
    }

    @Test
    public void testIsEmpty(){
        Assert.assertFalse(CheckUtils.isEmpty(new Integer[]{1,2,3}));
        Assert.assertFalse(CheckUtils.isEmpty(new Integer[]{1,2,3,null}));
        Assert.assertTrue(CheckUtils.isEmpty(new Integer[]{}));
        Assert.assertTrue(CheckUtils.isEmpty(null));
    }

    @Test
    public void testStringEquals(){
        Assert.assertTrue(CheckUtils.equals("str1","str1"));
        Assert.assertFalse(CheckUtils.equals("str1",new String("str1")));
        Assert.assertFalse(CheckUtils.equals("str1","str2"));
        Assert.assertFalse(CheckUtils.equals("str1",null));

    }

    @Test
    public void testIntegerEquals(){
        Assert.assertTrue(CheckUtils.equals(1,1));
        Assert.assertFalse(CheckUtils.equals(1,2));
        Assert.assertTrue(CheckUtils.equals(1,new Integer(1)));
        Assert.assertFalse(CheckUtils.equals(1,null));

    }

}
