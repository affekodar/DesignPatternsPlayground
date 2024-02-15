package Builder.Task;

public class PC {

    private String brand;
    private String CPU;
    private int SSD;


    public PC() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public PC(String brand, String CPU, int SSD) {
        this.brand = brand;
        this.CPU = CPU;
        this.SSD = SSD;
    }
}
