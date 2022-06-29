package problema1.threadSafe;

public class GuvernImpl1 {
    private static volatile GuvernImpl1 instance;
    public static int nrOfInstances;

    private GuvernImpl1() {
        System.out.println("Din constructorul default GuvernImpl1()");
        nrOfInstances++;
    }

    public static GuvernImpl1 getInstance() {
        if (instance == null) {
            synchronized (GuvernImpl1.class) {
                if (instance == null) {
                    instance = new GuvernImpl1();
                }
            }
        }

        return instance;
    }
}
