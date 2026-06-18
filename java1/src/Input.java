import java.util.Arrays;
import java.util.Scanner;

public class Input {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
      //  arr[0]= 2;
        //arr[1]=45;
        //arr[2]= 78;
        //arr[3]= 90;
        //arr[4]= 98;

//        for( int i =0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }

//        for( int i =0;i<arr.length;i++){
//
//        System.out.println(arr[i]);
//        }

//        for(int num: arr){
//            System.out.println(num +" ");
//        }



        String[] str = new String[4];

        for(int i =0;i< str.length;i++){
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
