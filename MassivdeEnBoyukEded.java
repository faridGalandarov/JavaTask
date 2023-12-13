public class MassivdeEnBoyukEded {
    public static void main(String[] args) {
        int [] nums = {2, 3, 12, 6, 37};
                int maxNumber = nums[0];

        for (int i = 1; i < nums.length ; i++) {
            if (nums[i] > maxNumber) {
                maxNumber = nums[i];
            }
        }
        System.out.println(maxNumber);
    }
}
