import java.util.List;

public class MissingNumInArray {

    public static void main(String[] args) {
        int[] input = {3,0,1};
        System.out.println(getMissingNum(input));
    }
    public static int getMissingNum(int[] nums){
        int len = nums.length;
        if(len<1){
            throw new IllegalArgumentException("Array is empty");
        }
        int sum = ((len)*(len+1))/2;
        for(int i = 0; i < len; i++){
            sum -= nums[i];
        }
        return sum;
    }
}
