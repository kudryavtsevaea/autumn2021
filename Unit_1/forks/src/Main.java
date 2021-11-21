import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {

        Semaphore sem = new Semaphore(5);

        List<Thread> philosophers = new ArrayList<>();
        philosophers.add(new Thread(new Philosopher("������", 5, sem)));
        philosophers.add(new Thread(new Philosopher("��������", 20, sem)));
        philosophers.add(new Thread(new Philosopher("��������", 11, sem)));
        philosophers.add(new Thread(new Philosopher("��������", 4, sem)));
        philosophers.add(new Thread(new Philosopher("�����������", 100, sem)));
        philosophers.add(new Thread(new Philosopher("�����", 9, sem)));
        philosophers.add(new Thread(new Philosopher("������", 10, sem)));
        philosophers.add(new Thread(new Philosopher("���������", 15, sem)));
        philosophers.add(new Thread(new Philosopher("��������", 60, sem)));
        philosophers.add(new Thread(new Philosopher("����������", 23, sem)));

        for (Thread p : philosophers) {
            p.start();
        }

    }
}