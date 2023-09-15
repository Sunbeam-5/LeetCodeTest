package easy.AddTwoNumbers;

public class Main {
    public static void main(String[] args) {
        // 创建示例链表
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // 创建 Solution 类的实例
        Solution solution = new Solution();

        // 调用 addTwoNumbers 方法计算链表的和
        ListNode result = solution.addTwoNumbers(l1, l2);

        // 打印结果链表的值
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}