package Practice;

public class RevSrring {

    public static void revString(String s){

        char[] chars = s.toCharArray();
        int l =0;
        int r = s.length()-1;

        while(l < r){
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;

        }
        System.out.println(new String(chars));

    }
    public static void main(String[] args) {
        String str = "Abhishek";
        revString(str);


    }
}
