package codebind;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    private int rows = 13;
    private int cols = 27;

    private JTable last_target;
    private String last_note;

    private JButton button_msg;
    private JPanel panelMain;
    private JTextField selected_partition;
    private JButton play_button;
    private JButton clear_button;
    private JButton back_button;
    private JButton play_read_button;
    private JTextField read_partition;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JPanel pentagram_panel;
    private JPanel pentagram_panel_img;
    private JTable pentagram_table;
    private String current_note = "R";
    private String[] song = new String[cols];

    public App() {
        // Assign note to buttons
        button1.setActionCommand("R");
        button2.setActionCommand("B");
        button3.setActionCommand("N");
        button4.setActionCommand("C");
        button5.setActionCommand("SC");
        button6.setActionCommand("F");
        button7.setActionCommand("SF");

        // Button press action listener
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                current_note = e.getActionCommand();
            }
        };
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        button4.addActionListener(listener);
        button5.addActionListener(listener);
        button6.addActionListener(listener);
        button7.addActionListener(listener);

        pentagram_table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                // Consigo tabla, fila y columna
                JTable target = (JTable)e.getSource();
                int row = target.getSelectedRow();
                int column = target.getSelectedColumn();
                setCellValue(target, column, row);
            }
        });
        clear_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < cols; i++) {
                    clearColumn(pentagram_table, i);
                    song[i] = null;
                    selected_partition.setText("");
                }
            }
        });
        back_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (last_target == null) return;
                String x = current_note;
                current_note = last_note;
                setCellValue(last_target, last_target.getSelectedColumn(), last_target.getSelectedRow());
                current_note = x;
            }
        });
    }

    private String translateToDuration(String in) {
        String out = "";
        switch (in) {
            case "R": out = "w";
                break;
            case "B": out = "h";
                break;
            case "N": out = "q";
                break;
            case "C": out = "i";
                break;
            case "SC": out = "s";
                break;
            case "F": out = "t";
                break;
            case "SF": out = "x";
                break;
        }
        return out;
    }

    private String translateNote(int in) {
        String out = "";
        switch (in) {
            case 1: out = "C";
                break;
            case 2: out = "D";
                break;
            case 3: out = "E";
                break;
            case 4: out = "F";
                break;
            case 5: out = "G";
                break;
            case 6: out = "A";
                break;
            case 0: out = "B";
                break;
        }
        return out;
    }

    private String setSection(boolean same, int row) {
        if (same || current_note == null) return null;

        String note = translateNote(((row - rows) * -1)%7);
        String octave = String.valueOf((((row - rows) * -1)/8)+5);
        String duration = translateToDuration(current_note);
        return note + octave + duration;
    }

    private void setCellValue(JTable target, int column, int row) {
        System.out.println("last note= "+last_note);
        last_note = (String)target.getValueAt(row, column);
        last_target = target;
        System.out.println("current note= "+current_note);
        boolean same_as_selected = target.getValueAt(row, column) == (current_note);
        String value = same_as_selected ? "" : current_note;
        clearColumn(target, column);
        target.setValueAt(value, row, column);

        song[column] = setSection(same_as_selected, row);

        String full_song = "";
        for (String s : song) {
            if (s != null) full_song += s + " ";
        }

        selected_partition.setText(full_song);
    }

    private void clearColumn(JTable target, int column) {
        int rows = target.getRowCount();
        for (int row = 0; row < rows; row++) {
            target.setValueAt("", row, column);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // Crear tabla y asignarle la cantidad de filas y columnas
        pentagram_panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                try {
                    BufferedImage myPicture = ImageIO.read(new File("src/img/Music/pentagrama.png"));

                    g.drawImage(myPicture, 0, 0, null);
                } catch (IOException ex) {
                    System.out.print(ex.toString());
                }
            }
        };
        pentagram_table = new JTable(rows, cols){
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };

        // Modificar el ancho de las columnas
        TableColumnModel columnModel = pentagram_table.getColumnModel();
        for (int i = 0; i < cols; i++) {
            columnModel.getColumn(i).setPreferredWidth(35);
        }
        pentagram_table.setRowHeight(10);

        // Make table background transparent
        pentagram_table.setOpaque(false);
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer)pentagram_table.getDefaultRenderer(Object.class);
        renderer.setOpaque(false);
        renderer.setHorizontalAlignment( SwingConstants.CENTER );

        // Remove table grid lines
        pentagram_table.setShowGrid(false);

        pentagram_table.setFont(new Font("Arial", Font.PLAIN, 12));

        EmptyBorder border = new EmptyBorder(26, 100, 26,0);
        pentagram_panel.setBorder(border);
        pentagram_panel.setPreferredSize(new Dimension(1070,202));
        pentagram_panel.add(pentagram_table);
    }
}
