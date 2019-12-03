package leetcode.domain;

import lombok.Data;

/**
 * @author kevin
 */

@Data
public class ListNode {

    private int val;
    private ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode() {
    }

}
