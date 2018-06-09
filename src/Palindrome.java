
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("level"));

    }
    public static boolean isPalindrome(String str){

        if(str.length()!= 0|| str != null){
            char[] strArray = str.toCharArray();

            int i,j;
            int mid = str.length()/2;

            if(str.length()%2==1){
                for(i=0,j=(str.length())-1; i<mid && j>mid; i++, j--){
                    if(strArray[i]!=strArray[j])
                        return false;
                }
                return true;
            }

            else if(str.length()%2==0){
                for(i=0,j=(str.length())-1; i<mid && j>=mid; i++, j--){
                    if(strArray[i]!=strArray[j])
                        return false;
                }
                return true;
            }
        }
        return false;
    }
}
