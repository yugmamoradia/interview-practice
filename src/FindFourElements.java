import java.util.HashMap;

public class FindFourElements {

    class pair{  //Creating a class of Type Pair which will hold the values of two vaiables i.e. a & b || c & d
        int first, second;
        pair(int f, int s){
            first = f;
            second = s;
        }
    }
    public boolean findPairs(int[] arr){
        HashMap<Integer, pair> map = new HashMap<>(); //Creating the HashMap to hold the sum as KEY and VALUES
        int n = arr.length;                           //as two variables of type 'pair' that equate to sum
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int sum = arr[i] + arr[j];          //Doing sum of arr[i] & arr[j];
                if(!map.containsKey(sum)){          //Checking if the KEY(sum) exists in Map, if not put the key
                    map.put(sum, new pair(arr[i],arr[j]));    //and respective pair of elements
                }
                else{
                    pair p = map.get(sum);          //else get the values to key in object of pair.
                    System.out.println("("+arr[i]+","+arr[j]+")"+"("+p.first+","+p.second+")"); //Print the elements from arr and pair
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,-5,-2,1,4,6};
        FindFourElements find = new FindFourElements();
        find.findPairs(arr);
    }
}
