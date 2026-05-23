
import java.util.HashMap;

public class hashmapbasics {
    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 3, 7, 5};
        HashMap <Integer,Boolean> map = new HashMap<>();
        int neww= 0;
        for(int x : arr){
            if (map.containsKey(x)){
                neww = x;
                break;
            }else{
                map.put(x,true);
            }

        }
        System.out.print("the duplicate number was: " + neww);

    }
}
