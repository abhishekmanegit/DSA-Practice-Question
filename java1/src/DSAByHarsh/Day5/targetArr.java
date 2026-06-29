//package DSAByHarsh.Day5;
//
//import java.lang.annotation.Target;
//
//public class targetArr {
//
//
//        public static boolean Traget(int arr[][],int target,int r,int l,int n){
//        while(l < r){
//            int mid = l + (l+r)/2;
//
//            int row = mid/n;
//            int col = mid% n;
//
//            if(arr[row][col] == target ) return true;
//
//            else if(arr[row][col] > target) {
//                mid = mid-1;
//            }
//            else {
//                mid = mid +1;
//            }
//
//
//                }
//            return false;
//            }
//
//    public static void main(String[] args) {
//        int[][] arr = {{2,3,1},{4,5,6},{7,8,9}};
//        int l = arr.length;
//        int n = arr[0].length-1;
//        int r = l*n-1;
//        int target = 5;
//        System.out.println(Target(arr,target,r,l,n));
//
//
//            }
//            }




