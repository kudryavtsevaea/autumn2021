import java.util.Scanner;

class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert an operation: ");
        Thread timer = new Thread(new Timer());

        while (true) {
            String operation = sc.nextLine();
            if (operation.equals("s") || operation.equals("q") || operation.equals("r") || operation.equals("x")) {
                if (operation.equals("s")) {
                    if (!timer.isInterrupted()) {
                        timer = new Thread(new Timer());
                    }
                    timer.start();
                    System.out.println("start");
                } else if (operation.equals("q")) {
                    if (timer.isAlive()){
                        timer.interrupt();
                    }
                    System.out.println("stop");
                } else if (operation.equals("r")){
                    Timer.setSeconds(0);
                    if (timer.isInterrupted()) {
                        timer.start();
                    }
                    System.out.println("restart");
                }
                else
                {
                    System.exit(0);
                }

            }
        }
    }
}
