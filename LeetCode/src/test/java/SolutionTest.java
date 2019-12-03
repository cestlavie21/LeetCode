import leetcode.Solution;
import leetcode.domain.ListNode;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.Arrays;

public class SolutionTest {
    private final static Solution solution = new Solution();

    @Test
    public void twoSumTest() {

        int[] nums = {2, 7, 11, 15};

        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }

    @Test
    public void addTwoNumbersTest() {
        ListNode num3 = new ListNode(3);
        ListNode num2 = new ListNode(2);
        ListNode num4 = new ListNode(4);
        num3.setNext(null);
        num2.setNext(num4);
        num4.setNext(num3);

        ListNode num7 = new ListNode(5);
        ListNode num0 = new ListNode(6);
        ListNode num8 = new ListNode(4);
        num8.setNext(null);
        num0.setNext(num8);
        num7.setNext(num0);

        ListNode node = solution.addTwoNumbers(num2, num7);
        System.out.println(node);
    }

    @Test
    public void changeNumToNode() {
        int num = 807;
        int result = num / 10000;
        System.out.println(result);
    }

    @Test
    public void test1() {
        System.out.println(4 | 2);
        //   0100
        //   0010
    }

    @Test
    public void addTwoNumbersTest1() {
        ListNode num3 = new ListNode(0);
        ListNode num7 = new ListNode(1);
        ListNode node = solution.addTwoNumbers(num3, num7);
        System.out.println(node);
    }

    @Test
    public void addTwoNumbersTest2() {
        int[]  array1 = {};
        int[]  array2 = {};
        ListNode num3 = new ListNode(9);
        ListNode num2 = new ListNode(8);
        ListNode num4 = new ListNode(9);
        num3.setNext(null);
        num2.setNext(num4);
        num4.setNext(num3);
        ListNode num8 = new ListNode(2);
        num8.setNext(null);
        ListNode node = solution.addTwoNumbers(num2, num8);
        System.out.println(node);
    }
}
