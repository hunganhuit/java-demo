package thread;

public class HelloThread extends Thread {

    @Override
    public void run() {
        int index = 1;
        while(!this.isInterrupted()){
            for (int i = 0; i < 10; i++) {
                System.out.println("-Thread running " + index++);

                try {
                    Thread.sleep(1000);
             
                } catch (InterruptedException e) {
                    System.out.println("kkkkkkk");
                    this.interrupt();
                   
                }
            }
        }
        
        System.out.println("  - ==> HelloThread stopped");
    }
}
