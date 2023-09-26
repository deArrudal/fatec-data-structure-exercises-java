package model;

public class Process {
    private String nameProcess;
    private int quantityProcess;

    public Process(String nameProcess, int quantityProcess) {
        this.nameProcess = nameProcess;
        this.quantityProcess = quantityProcess;
    }

    public String getNameProcess() {
        return nameProcess;
    }

    public int getQuantityProcess() {
        return quantityProcess;
    }

    public void setQuantityProcess(int quantityProcess) {
        this.quantityProcess = quantityProcess;
    }
}