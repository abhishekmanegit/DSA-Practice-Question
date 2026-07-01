package DSAByHarsh.Day5;

public class RevStr {
    public static void main(String[] args) {

         String str = "aba";
         String str2 = str;
        char c[] = str.toCharArray();
        int i = 0;
        int j = c.length- 1;


        while (i < j) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }

        if(str2.equals(c)){
            System.out.println("Palindrome");
        }
        System.out.println(c);


    }
}


