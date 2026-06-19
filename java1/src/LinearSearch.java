import java.util.Scanner;

public class LinearSearch {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);



        System.out.println("Enter Size of Array");
        int s = sc.nextInt();

        int[] arr= new int[s];

        System.out.println("Enter Target to search");
        int target = sc.nextInt();

        System.out.println("Enter Elements to enter:");
        for(int i = 0; i < arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i =0; i< arr.length;i++){
            if(arr[i] == target){
                System.out.println("Target Found at :"+ i);
                return;
            }

        }
        System.out.println("Element not found");
    }
}
