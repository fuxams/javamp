import java.util.Scanner;

interface MonitorTime {
    void setBuzzerTime(int time);
}

public class Buzzer extends Thread implements MonitorTime {
    @Override
    public void setBuzzerTime(int time) {
        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    Buzzer(int no) {
        System.out.println(no + " Buzzer started...");
        this.start();
    }

    static void methodsblowBuzzer(int n, int time) {
        System.out.println("Buzzer started...");
        for (int i = 1; i <= n; ++i) {
            Buzzer buzz = new Buzzer(i);
            buzz.setBuzzerTime(time);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of times buzzer should be repeated : ");
        int n = in.nextInt();
        System.out.print("Set Buzzer time delay in seconds : ");
        int time = in.nextInt();
        methodsblowBuzzer(n, time);
    }
}

