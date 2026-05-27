import java.util.Arrays;

public class Tripletsumsmaller {

        int countTriplets(int sum, int arr[]) {

            Arrays.sort(arr);
            int count = 0;
            int msum = 0;
            for(int fixed = 0 ;fixed < arr.length-2; fixed++){
                int start = fixed+1;
                int end = arr.length-1;
                while(end>start){
                    msum = arr[fixed]+arr[start]+arr[end];
                    if(msum==sum){
                        end--;
                    }else if(msum>sum){
                        end--;
                    }
                    else{
                        count+=(end-start);
                        start++;
                    }
                }
            }
            return count;
        }

}
