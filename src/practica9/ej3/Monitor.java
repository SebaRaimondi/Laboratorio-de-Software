package practica9.ej3;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Monitor {
    private JTextField[] fields;

    private static Monitor instance;

    public static Monitor getInstance() {
        return instance;
    }

    public Monitor(JTextField[] fields) {
        this.fields = fields;
        this.instance = this;
    }

    public synchronized void run(String s, int n) {
        fields[n].setText(s);
        try {
            TimeUnit.MILLISECONDS.sleep(25);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
