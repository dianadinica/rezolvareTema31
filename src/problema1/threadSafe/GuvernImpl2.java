package problema1.threadSafe;

public class GuvernImpl2 {
    private static volatile GuvernImpl2 instance;
    public static int nrOfInstances;

    private GuvernImpl2() {
        System.out.println("Din constructorul default GuvernImpl2()");
        nrOfInstances++;
    }

    public static synchronized GuvernImpl2 getInstance() {
        if (instance == null) {
            instance = new GuvernImpl2();
        }

        return instance;
    }
}
