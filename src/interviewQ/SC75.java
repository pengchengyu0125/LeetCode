package interviewQ;

public class SC75 {
    public void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }
    public void quickSort(int[] src, int begin, int end) {
        if (begin < end) {
            int key = src[begin];
            int i = begin;
            int j = end;
            while (i < j) {
                while (i < j && src[j] > key) {
                    j--;
                }
                if (i < j) {
                    src[i] = src[j];
                    i++;
                }
                while (i < j && src[i] < key) {
                    i++;
                }
                if (i < j) {
                    src[j] = src[i];
                    j--;
                }
            }
            src[i] = key;
            quickSort(src, begin, i - 1);
            quickSort(src, i + 1, end);
        }
    }

    public static void main(String[] args) {
        int nums[] = {2, 0, 2, 1, 1, 0};
        SC75 sc75 = new SC75();
        sc75.sortColors(nums);
        System.out.println(nums.toString());
    }
}
