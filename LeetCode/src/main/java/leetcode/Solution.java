package leetcode;

import leetcode.domain.ListNode;
import org.w3c.dom.NodeList;

import java.util.*;

public class Solution {
    /**
     * 1.两数之和
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    /**
     * 2.两数相加
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1Num = getNum(l1);
        int l2Num = getNum(l2);
        int result = l1Num + l2Num;
        int k = 1;
        int cnt = 0;
        ListNode resultNode = new ListNode();
        if (result == 0) {
            resultNode = new ListNode(0);
        }
        while (result / k > 0) {
            int num = (result / k) % 10;
            if (cnt == 0) {
                resultNode.setVal(num);
            } else {
                if (cnt == 1) {
                    resultNode.setNext(new ListNode(num));
                } else {
                    ListNode nextNode = resultNode.getNext();
                    while (nextNode.getNext()!=null){
                        nextNode = nextNode.getNext();
                    }
                    nextNode.setNext(new ListNode(num));
                }
            }
            k = k * 10;
            cnt++;
        }
        return resultNode;
    }

    private int getNum(ListNode nodeList) {
        List<Integer> numList = new ArrayList();
        int result = 0;
        ListNode node = nodeList;
        while (node.getNext() != null) {
            numList.add(node.getVal());
            node = node.getNext();
        }
        numList.add(node.getVal());
        for (int i = 0; i < numList.size(); i++) {
            int basic = 1;
            for (int j = 0; j < i; j++) {
                basic = basic * 10;
            }
            int current = numList.get(i) * basic;
            result = result + current;
        }
        return result;
    }

    public ListNode changeNumToNode(int num) {
        int k = 1;
        //807
        //7->0->8
        List<ListNode> nodeList = new ArrayList<ListNode>();
        while (num / k >= 0) {
            ListNode node = new ListNode(num / k % 10);

            nodeList.add(node);
            k = k * 10;
        }

        return null;
    }
}
