package codebind;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class App {
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
    private JTable pentagram_table;
    private String current_note = "R";

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
                System.out.println("pene row: "+row);
                System.out.println("pene col: "+column);

                setCellValue(target, column, row);
            }
        });
    }

    private void setCellValue(JTable target, int column, int row) {
        boolean same_as_selected = target.getValueAt(row, column) == current_note;
        String value = same_as_selected ? "" : current_note;
        clearColumn(target, column);
        target.setValueAt(value, row, column);
    }

    private void clearColumn(JTable target, int column) {
        int rows = target.getRowCount();
        for (int row = 0; row < rows; row++) {
            target.setValueAt("", row, column);
        }
    }

    /*
        public App() {
            button_msg.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Hello World");
                }
            });
        }
    */
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // Crear tabla y asignarle la cantidad de filas y columnas
        pentagram_panel = new JPanel();
        int rows = 10;
        int cols = 30;
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

        // Make table background transparent
        pentagram_table.setOpaque(false);
        ((DefaultTableCellRenderer)pentagram_table.getDefaultRenderer(Object.class)).setOpaque(false);

        // Remove table grid lines
        // pentagram_table.setShowGrid(false);

        pentagram_panel.add(pentagram_table);
    }
}
