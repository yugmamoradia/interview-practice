
public class IsNumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12021));
    }
        public static boolean isPalindrome(int input) {

            if(input<0){
                return false;
            }
            int modResult;
            int j,k;
            int len = Integer.toString(input).length();
            int arr[] = new int[len];
            int i = 0;
            int mid = arr.length/2;

            while(input!=0){
                modResult = input % 10;
                input= input/10;
                arr[i] = modResult;
                i++;
            }

            if(len%2==0){
                for(j=0,k=len-1;j<mid && k>=mid; j++,k--) {
                    if (arr[j] != arr[k])
                        return false;
                }
                return true;
            }
            else if(len%2 == 1){
                for(j=0,k=len-1;j<mid && k>mid; j++,k--) {
                    if (arr[j] != arr[k])
                        return false;
                }
                return true;
            }
            return false;
        }
}
