
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }
        public static int reverse(int input) {
            int modResult;
            int reverse = 0;
            boolean isNegative = false;
            if(input<0){
                isNegative = true;
                input = input * -1;
            }
            if(input<=Integer.MAX_VALUE){
                while(input!=0){
                    modResult = input%10;
                    if(reverse * 10L >Integer.MAX_VALUE || reverse * 10L < Integer.MIN_VALUE)
                        return 0;
                    reverse = reverse * 10 + modResult;
                    input = input/10;
                }
                if(isNegative){
                    return reverse * -1;
                } else
                return reverse;
            }
            else
                return 0;
        }
}
