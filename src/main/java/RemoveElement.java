public class RemoveElement {
    public static void main(String[] args) {
        int val = 10;
        int[] nums = {-1, 0, 2, 10, 4, 10};
        System.out.println(removeElement(nums, val));
    }
    public static int removeElement(int[] nums, int val) {
        int in = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[in] = nums[i];
                in++;
            }
        }
        return in;
    }
}
