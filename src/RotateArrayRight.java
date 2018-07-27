
public class RotateArrayRight {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int result[] = rotate(arr, 4);
        String test = "b   a";
        String [] t = test.split(" ");
        System.out.println(t[0]);
        System.out.println(t[1]);
        for(int i= 0; i<result.length; i++) {
            System.out.print(result[i]+ " ");
        }
    }
    public static int[] rotate(int[] nums, int k) {
        if(k > nums.length)
            k=k%nums.length;
        int[] result = new int[nums.length];
        for(int i = 0; i < k; i++){
            result[i] = nums[nums.length-k+i];
        }
        int j = 0;
        for(int i=k; i < nums.length; i++){
            result[i] = nums[j];
            j++;
        }

        return result;
    }
}
