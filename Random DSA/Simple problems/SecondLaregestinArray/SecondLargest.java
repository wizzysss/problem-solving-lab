// problem: Second Largest Element in an Array (NO sorting)

// Task:
// Given an array of integers, find the second largest number.


public class SecondLargest{


    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        int[] number ={1,1,1,1};
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

        if (secondLargest==Integer.MIN_VALUE) {
            System.out.println("Ther is no second largest");
        }
        else{
            System.out.println("Second largest is "+secondLargest);
        }

    }
    
}