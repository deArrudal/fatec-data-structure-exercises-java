package controller;

import javax.swing.JList;
import javax.swing.JOptionPane;

import model.Queue;

public class CallController {
    public CallController() {
        super();
    }

    public void addCall(Queue<String> queueCall, String numberCall) {
        queueCall.insertValue(numberCall);
        JOptionPane.showMessageDialog(null, "Added number to call log", "Call History", 1);
    }

    public void checkLog(Queue<String> queueCall) {
        if (queueCall.isEmpty()) {
            JOptionPane.showMessageDialog(null, "You have no missed call", "Call History", 1);
            return;
        }

        String[] arrayCall = new String[queueCall.sizeQueue()];
        int index = 0;

        while (!queueCall.isEmpty()) {
            try {
                arrayCall[index] = queueCall.removeValue();
                index++;
            } catch (Exception errQueue) {
                System.err.println(errQueue);
            }
        }

        JOptionPane.showMessageDialog(null, new JList<String>(arrayCall), "Call History", 1);
    }
}
