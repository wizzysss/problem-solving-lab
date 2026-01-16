// problem: Second Largest Element in an Array (NO sorting)

// Task:
// Given an array of integers, find the second largest number.
import java.util.Arrays;


public class SecondLargest{


    public int sortarraymethod(int[] arr){

        int[] sortedarr =arr.clone();
        Arrays.sort(sortedarr);
        int seclar =sortedarr[sortedarr.length-2];
        return seclar;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        int[] number ={1,5,3,1};
        int largest =Integer.MIN_VALUE;
        int secondLargest =Integer.MIN_VALUE;

        for(int num:number){
            if (num>largest) {
                secondLargest = largest;
                largest=num;
            }
            else if(num>secondLargest && num!=largest){
                secondLargest=num;
            }
        }

        //straight away way

        // if (secondLargest==Integer.MIN_VALUE) {
        //     System.out.println("Ther is no second largest");
        // }
        // else{
        //     System.out.println("Second largest is "+secondLargest);
        // }

        //method with sorted way
        SecondLargest sl = new SecondLargest();
        secondLargest = sl.sortarraymethod(number);

        System.out.println("Second largest is "+secondLargest);

    }
    
}