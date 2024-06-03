
public class App03 {
    public static void main(String[] args) throws Exception {

    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k % n == 0)
            return;
        k = k % n;
        int[] temp = new int[n];

        for (int i = n - k; i < n; i++) {
            temp[i - (n - k)] = nums[i];
        }

        for (int i = 0; i < n - k; i++) {
            temp[i + k] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }

}
