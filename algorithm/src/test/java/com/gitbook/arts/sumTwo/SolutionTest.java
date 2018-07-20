package com.gitbook.arts.sumTwo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

/**
 * Created by Phony on 2018/7/20.
 */
public class SolutionTest {
    private Solution solution;
    private Solution2 solution2;
    private Solution3 solution3;

    @Before
    public void preparation() {
        this.solution = new Solution();
        this.solution2 = new Solution2();
        this.solution3 = new Solution3();
    }

    @Test
    public void test_normalCase() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[] {0, 1};
        int[] actually = solution.twoSum(nums, target);
        Assert.assertArrayEquals(expected, actually);
    }

    @Test
    public void test_normalCase2() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[] {0, 1};
        int[] actually = solution2.twoSum(nums, target);
        Assert.assertArrayEquals(expected, actually);
    }

    @Test
    public void test_normalCase3() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[] {0, 1};
        int[] actually = solution3.twoSum(nums, target);
        Assert.assertArrayEquals(expected, actually);
    }
}
