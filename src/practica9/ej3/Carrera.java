package practica9.ej3;

import javax.swing.*;
import java.util.concurrent.Executor;

public class Carrera {
    private JPanel mainPanel;
    private static int nThreads = 11;
    JTextField[] fields;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Carrera");
        Carrera carrera = new Carrera();
        frame.setContentPane(carrera.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        Monitor monitor = new Monitor(carrera.fields);
        for (int i = 0; i < nThreads; i++) {
            carrera.fields[i].setText(String.valueOf(i + 1) + ".");
            new Thread(new Corredor(i)).start();
        }
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));

        fields = new JTextField[nThreads];
        for (int i = 0; i < nThreads; i++) {
            fields[i] = new JTextField();
            mainPanel.add(fields[i]);
        }
    }
}
