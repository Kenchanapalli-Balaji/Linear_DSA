// leetcode - 148
// https://youtu.be/8ocB7a_c-Cc
/*
Given the head of a linked list, return the list after sorting it in ascending order.
Example 1 : 
Input: head = [4,2,1,3]
Output: [1,2,3,4]
 */
package Single_Linked_List;

public class Sort_Single_Linked_List {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public Node sort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = findMiddle(head);
        Node right = middle.next;
        middle.next = null;
        Node left = head;

        left = sort(left);
        right = sort(right);

        return merge(left, right);
    }

    public Node merge(Node left, Node right) {
        Node dummy = new Node(0);
        Node temp = dummy;

        while (left != null && right != null) {
            if (left.data < right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        if (left != null) {
            temp.next = left;
        } else {
            temp.next = right;
        }

        return dummy.next;
    }

    public static Node findMiddle(Node head) {
        if (head == null || head.next == null)
            return head;

        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next; // Corrected
        }
        return slow;
    }

    public void add(int ele) {
        Node node = new Node(ele);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public String toString() {
        StringBuilder st = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            st.append(temp.data);
            if (temp.next != null) {
                st.append("->");
            }
            temp = temp.next;
        }
        return st.toString();
    }

    public static void main(String[] args) {
        Sort_Single_Linked_List sl = new Sort_Single_Linked_List();
        sl.add(5); sl.add(4); sl.add(3); sl.add(2); sl.add(1);
        System.out.println("Before sort: " + sl);
        sl.head = sl.sort(sl.head); // Updated
        System.out.println("After sort: " + sl);
    }
}