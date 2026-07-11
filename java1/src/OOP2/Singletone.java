package OOP2;

public class Singletone {

    private static Singletone instance;

    public static Singletone getInstance(){

        if(instance == null){
            instance = new Singletone();
        }
        return instance;
    }
}
