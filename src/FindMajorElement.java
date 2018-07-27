/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 You may assume that the array is non-empty and the majority element always exist in the array.
 Input: [2,2,1,1,1,2,2]
 Output: 2
 */
public class FindMajorElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,5,2,5,3,5,3,2,2,2};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        int count = 0;
        Integer majorElement = null;
        for(int num : nums){
            if(count == 0){
                majorElement = num;
            }
            count += (num == majorElement) ? 1 : -1;
        }
        return majorElement;
    }
}
