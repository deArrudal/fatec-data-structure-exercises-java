package controller;

import model.Process;
import model.Queue;

public class ProcessController {
    public ProcessController() {
        super();
    }

    public void runRoundRobin(Queue<Process> queueProcess) {
        if (queueProcess.isEmpty()) {
            System.err.println("empty queue");
            return;
        }

        Process process;

        while (!queueProcess.isEmpty()) {
            try {
                process = queueProcess.removeValue();

                System.out.printf("Process: %s\tRemaining Executions: %d\n",
                        process.getNameProcess(), process.getQuantityProcess() - 1);

                if (process.getQuantityProcess() > 1) {
                    // decrement.
                    process.setQuantityProcess(process.getQuantityProcess() - 1);

                    queueProcess.insertValue(process);
                }
            } catch (Exception errQueue) {
                System.err.println(errQueue);
            }
        }
    }
}
