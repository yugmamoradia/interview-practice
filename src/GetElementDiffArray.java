import java.util.PriorityQueue;
import java.util.Queue;

public class GetElementDiffArray {

    public static Queue<Integer> queue =  new PriorityQueue<>();

    static int[] arr1 = {1,2,3,0};
    static int[] arr2 = {4,5};
    static int[] arr3 = {7,8,9};

    public static void main(String[] args) {
        int i1 = 0; // start value of this index is 3
        int i2 = 0; // 1
        int i3 = 0; // 2

        while(i1 <arr1.length || i2 <arr2.length || i3 <arr3.length){
            if(i3<arr3.length){
                queue.add(arr3[i3++]);
            }
            if(i2<arr2.length){
                queue.add(arr2[i2++]);
            }
            if(i1<arr1.length){
                queue.add(arr1[i1++]);
            }
        }

        System.out.println(getElement());
        System.out.println("hello");
        System.out.println(getElement());
        System.out.println(getElement());
        System.out.println(getElement());
        System.out.println(getElement());
        System.out.println(getElement());
        System.out.println(getElement());
        System.out.println(getElement());
    }

    public static int getElement(){
        return queue.poll();
    }

}
