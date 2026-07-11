package Recursion;

public class StringP {
    public void StringPermute(String str){
        char[] arr = str.toCharArray();
        permute(arr,0);
    }

    private void permute(char[] arr,int idx){
        if(idx == arr.length){
            System.out.println(new String(arr));
            return;
        }

        for(int i =idx;i< arr.length;i++){
            swap(arr,idx,i);
            permute(arr,idx+1);
            swap(arr,idx,i);
        }
    }

    public void swap(char[] arr ,int i,int j ){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        StringP st = new StringP();
        st.StringPermute("AB");
    }
}
