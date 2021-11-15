class Timer extends Thread {

    private static int seconds = 1;

    public static void stopThread(Thread timer) {
        if (!timer.isInterrupted()){
            timer.interrupt();
        }
        System.out.println("Stop");
    }

    public static void startThread(Thread timer){
        if(timer.isInterrupted()){
            timer.run();
        }
        System.out.println("Start");
    }

    public static void restartThread(Thread timer){
        if (!timer.isInterrupted()) {
            timer.interrupt();
        }
        seconds = 1;
        timer.run();
        System.out.println("Restart");
    }

    @Override
    public void run() {
        try{
            int i = 0;
            while(i < 60) {
                if (!isInterrupted()){
                    System.out.println(seconds);
                    seconds++;
                    sleep(1000);
                    i++;
                }
                else{
                    throw new InterruptedException();
                }
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}