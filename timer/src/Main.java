import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Thread timer = new Thread(new Timer());
//        timer.start();
//        timer.sleep(5000);
//        Timer.stopThread(timer);
//        Timer.startThread(timer);
//        timer.sleep(5000);
//        Timer.restartThread(timer);
            try(Scanner sc = new Scanner(System.in)){
                System.out.println("Insert an operation: ");
                String operation = sc.nextLine();
                switch(operation){
                    case "start": Timer.startThread(timer);
                    case "stop": Timer.stopThread(timer);
                    case "restart": Timer.restartThread(timer);
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
    }
}

