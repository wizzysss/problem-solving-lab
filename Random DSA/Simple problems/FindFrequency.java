import java.util.HashMap;

public class FindFrequency {
    
    public static void main(String[] args) {
        int[] arr ={2,3,4,2,7,5};

        HashMap<Integer,Integer> frequency = new HashMap<>();
        for(int x:arr){
 frequency.put(x,(frequency.getOrDefault(frequency, 0))+1);

        }
       System.out.println(frequency);
    }
}
