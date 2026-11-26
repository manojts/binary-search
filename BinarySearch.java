
public class BinarySearch {

    public static void main(String[] args) {

        int[] nums;
        nums = new int[] { 2, 5, 8, 12, 16, 26, 38, 56, 72, 91 };
        int target = 26;

        int result = binarySearch(nums, target);

        System.out.println("Target: " + target);
        System.out.println("Index: " + result);

        nums = new int[] { 1, 2, 2, 2, 3, 4, 5, 5, 6 };
        target = 2;

        result = firstOccurrence(nums, target);

        System.out.println("First Occurrence Index: " + result);

        nums = new int[] { 1, 2, 2, 2, 3, 4, 5, 5, 6 };
        target = 2;

        result = lastOccurrence(nums, target);

        System.out.println("Last Occurrence Index: " + result);

        nums = new int[] { 1, 2, 2, 2, 3, 4, 5, 5, 6, 10 };
        target = 8;

        result = firstGreaterElement(nums, target);

        System.out.println("First Greater Element than target - Index: " + result);

        nums = new int[] { 1, 2, 2, 2, 3, 4, 5, 5, 6, 10 };
        target = 8;

        result = firstGreaterThanEqualElement(nums, target);

        System.out.println("First Greater Than or Equal Element than target - Index: " + result);
    }

    public static int binarySearch(int[] nums, int target) {

        // TODO: Implement Binary Search here
        int l = 0;
        int r = nums.length - 1;
        int mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1;
    }

    public static int firstOccurrence(int[] nums, int target) {

        // TODO: Implement Binary Search

        int l = 0;
        int r = nums.length - 1;
        int mid = 0;
        int result = -1;
        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] == target) {
                result = mid;
                r = mid - 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return result;
    }

    public static int lastOccurrence(int[] nums, int target) {

        // TODO: Implement Binary Search

        int l = 0;
        int r = nums.length - 1;
        int mid = 0;
        while (l < r) {
            mid = (l + r) / 2;
            if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }

    public static int firstGreaterElement(int[] nums, int target) {

        // TODO: Implement Binary Search

        int l = 0;
        int r = nums.length - 1;
        int mid = 0;
        while (l < r) {
            mid = (l + r) / 2;
            if (nums[mid] > target) {
                r = mid;
            } else {
                l = mid + 1;
            }

        }

        return l;
    }

    public static int firstGreaterThanEqualElement(int[] nums, int target) {

        // TODO: Implement Binary Search

        int l = 0;
        int r = nums.length - 1;
        int mid = 0;
        while (l < r) {
            mid = (l + r) / 2;
            if (nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
