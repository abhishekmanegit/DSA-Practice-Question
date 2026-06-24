package DSAByHarsh.Day3;

public class IsExist {

    public static void main(String[] args) {
        int target = -1;
        int[] arr = {1, 2,-1,5,8};
        for(int i = 0;i<arr.length;i++){
            if(arr[i]  == target){
                System.out.println(" Value Exist at INDEX:"+i);
            }
        }
    }
}
