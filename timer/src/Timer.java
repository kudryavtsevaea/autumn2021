class Timer extends Thread {
    private static int seconds = 0;

    public static int getSeconds() {
        return seconds;
    }

    public static void setSeconds(int seconds) {
        Timer.seconds = seconds;
    }

    @Override
    public void run() {
            Thread current = Thread.currentThread();
            while (!current.isInterrupted()) {
                try {
                    Thread.sleep(1000);
                    System.out.println(seconds + " ");
                    seconds ++;
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
}