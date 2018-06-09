
public class IsRotationString {
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        String concatString = s1 + s1;

        System.out.println(isSubstring(concatString, s2));

    }

    // Given to assume that this function exists
    public static boolean isSubstring(String str1, String str2){
        return str1.toLowerCase().contains(str2.toLowerCase());
    }
}

