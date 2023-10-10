import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,3,5,6,7,9,10,13,17,21,24,25,27,28,29,30);
        int pos = methodBinarySearch(l, 7);
        System.out.println(pos);
    }
    
    public static int methodBinarySearch(List<Integer> list, int item){
        int base = 0;
        int hight = list.size() - 1;
        while(base <= hight) {
            int middle = (base + hight)/2;
            int guess = list.get(middle);
            if(guess == item){
                return middle;
            } 
            if(guess > item) {
                hight = middle - 1;
            } else  {
                base = middle + 1;
            }
        }
         return 0;

    }
}
