import java.util.HashMap;

public class AnagramStrings {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
        System.out.println(isAnagram(s1, s2));

    }
    public static boolean isAnagram(String s1, String s2) {
        if (s1 != null || s2 != null || s1 != "" || s2 != "") {

            if (s1.length() != s2.length())
                return false;
            HashMap<Character,Integer> myMap = new HashMap<>();

            char[] string1Letters = s1.toCharArray();
            char[] string2Letters = s2.toCharArray();

            for (int i = 0; i < s1.length(); i++) {
                if (!myMap.containsKey(string1Letters[i])) {
                    myMap.put(string1Letters[i],1);
                }
                else{
                    Integer count = myMap.get(string1Letters[i]);
                    myMap.put(string1Letters[i], count+1) ;

                }
            }

            for(int i=0; i<string2Letters.length; i++){
                if(!myMap.containsKey(string2Letters[i])){
                    return false;
                }
                else{
                    Integer count = myMap.get(string2Letters[i]);
                    myMap.put(string2Letters[i], count-1) ;
                }
            }
            Integer zero = 0;
            for(Integer result : myMap.values()){
                if(zero.equals(result)){
                    return true;
                }
            }

        }
        return false;
    }
}