package OOps;

public class Main {


    public static void main(String[] args) {
        Student abhishek = new Student();
        Student samu = new Student();
//        abhishek.rollno = 1;
//        abhishek.name = "Abhi";
//        abhishek.marks = 99;
        System.out.println(samu.rollno);
        System.out.println(samu.name);
        System.out.println(samu.marks);

        System.out.println(abhishek.rollno);
        System.out.println(abhishek.name);
        System.out.println(abhishek.marks);
    }
}

    class Student{
        int rollno;
        String name;
        float marks;

        Student(){
            this.rollno = 13;
            this.name = "Abhishek";
            this.marks = 99;
        }
    }

