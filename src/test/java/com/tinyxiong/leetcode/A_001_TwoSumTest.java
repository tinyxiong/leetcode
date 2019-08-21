package com.tinyxiong.leetcode;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Collections;

public class A_001_TwoSumTest {

    private static A_001_TwoSum service;

    private static int[] sums;

    @BeforeClass
    public static void setup() {
        sums = new int[]{2, 7, 11, 13};
        service = new A_001_TwoSum();
    }

    @Test
    public void twoSum() {
        int target = 9;
        int[] ints = service.twoSum(sums, target);
        System.out.println(Collections.singletonList(ints));

        Assert.assertEquals(0, ints[0]);
        Assert.assertEquals(1, ints[1]);
    }

    @Test
    public void twoSum2() {
        int target = 24;
        int[] ints = service.twoSum2(sums, target);
        System.out.println(Collections.singletonList(ints));

        Assert.assertEquals(2, ints[0]);
        Assert.assertEquals(3, ints[1]);
    }
}