package controller;

import javax.swing.JOptionPane;
import model.Queue;

public class PrinterController {
    public PrinterController() {
        super();
    }

    public void addFile(Queue<String> queuePrinter, String file) {
        queuePrinter.insertValue(file);
        JOptionPane.showMessageDialog(null, "Added document to queue", "Printer", 1);
    }

    public void printFile(Queue<String> queuePrinter) {
        if (queuePrinter.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty queue", "Printer", 0);
            return;
        }

        String file;
        String[] tmp;
        JOptionPane.showMessageDialog(null, "Starting printer", "Printer", 1);

        while (!queuePrinter.isEmpty()) {
            try {
                file = queuePrinter.removeValue();
                tmp = file.split(";"); // format string.
                System.out.printf("#PC:%s - File: %s\n", tmp[0], tmp[1]);
                /**
                 * JOptionPane.showMessageDialog(null,
                 * "#PC:" + tmp[0] + " - File: " + tmp[1], "Printer", 1);
                 */

                Thread.sleep((int) (Math.random() * 1001 + 1000));

            } catch (Exception errQueue) {
                System.err.println(errQueue);
            }
        }
    }
}
