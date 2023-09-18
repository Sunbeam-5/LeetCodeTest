package easy.remove_element;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int len = solution.removeElement(nums, val);

        System.out.println("新长度：" + len);
        System.out.print("移除后的数组：");
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
