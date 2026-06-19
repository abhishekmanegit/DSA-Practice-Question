import java.util.Scanner;

public class LargestArr {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter Size of Array");
        int s = sc.nextInt();

        int[] arr= new int[s];
        int max = arr[0];

        System.out.println("Enter Elements to enter:");
        for(int i = 0; i < arr.length;i++){
             arr[i] = sc.nextInt();
        }

        for(int num : arr){
            if(arr[num] > max ){
                max = arr[num];
            }


        }

        System.out.println("Largest is : "+max);
    }
}
