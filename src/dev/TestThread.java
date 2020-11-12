package dev;

import java.util.Timer;
import java.util.TimerTask;

public class TestThread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            int i = 0;

            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("dingshi" + ++i);
                }
            }
        }).start();
    }
}

class TimeTask {
    public static void main(String[] args) {
        int i = 0;
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("dingshi2" + ++i);
            }
        };
        Timer timer   = new Timer();
        long day = 0;
        long mili = 1000;
        timer.schedule(timerTask, day, mili);
    }

}

