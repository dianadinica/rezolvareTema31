package problema1.lazyInitialization;

public class Main {
    public static void main(String[] args) {
        Guvern guvern1 = Guvern.getInstance();
        Guvern guvern2 = Guvern.getInstance();
        Guvern guvern3 = Guvern.getInstance();

        System.out.println(guvern1 == guvern2); // true
        System.out.println(guvern2 == guvern3); // true

        System.out.println(Guvern.nrOfInstances); // 1
    }
}
