package problema1.threadSafe;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int nrOfThreads = 500_000;

        Thread[] threads = new Thread[nrOfThreads];
        Runnable task = () -> {
            GuvernImpl1 guvern = GuvernImpl1.getInstance();
        };
        long start = System.currentTimeMillis();
        for (int i = 0; i < nrOfThreads; i++) {
            threads[i] = new Thread(task);
        }
        for (int i = 0; i < nrOfThreads; i++) {
            threads[i].start();
        }
        for (int i = 0; i < nrOfThreads; i++) {
            threads[i].join();
        }
        long end = System.currentTimeMillis();
        System.out.println(GuvernImpl1.nrOfInstances);
        System.out.println("Time Singleton Thread safe with double checking: " + (end - start));

        task = () -> {
            GuvernImpl2 guvern = GuvernImpl2.getInstance();
        };
        start = System.currentTimeMillis();
        for (int i = 0; i < nrOfThreads; i++) {
            threads[i] = new Thread(task);
        }
        for (int i = 0; i < nrOfThreads; i++) {
            threads[i].start();
        }
        for (int i = 0; i < nrOfThreads; i++) {
            threads[i].join();
        }
        end = System.currentTimeMillis();
        System.out.println(GuvernImpl1.nrOfInstances);
        System.out.println("Time Singleton Thread safe synchronized method: " + (end - start));
    }
}
