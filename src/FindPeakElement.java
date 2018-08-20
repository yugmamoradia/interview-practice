public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        System.out.println(findPeakElement(arr));
    }
    public static int findPeakElement(int[] nums) {
        return helperPeak(nums, 0, nums.length-1);
    }
    public static int helperPeak(int[] arr, int low, int high){
        if(arr.length == 1)
            return arr[0];

        int mid = (low + high)/2;
        if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
            return arr[mid];
        }
        else if(arr[mid] < arr[mid-1]){
            return helperPeak(arr, low, mid-1);
        }
        else if(arr[mid] > arr[mid-1]){
            return helperPeak(arr, mid+1, high);
        }
        return -1;
    }
}
