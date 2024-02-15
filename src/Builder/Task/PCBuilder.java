package Builder.Task;

public class PCBuilder {

    private PC computer = new PC();


    public PCBuilder addBrand(String brand) {
        computer.setBrand(brand);
        return this;
    }

    public PCBuilder addCPU(String CPU) {
        computer.setCPU(CPU);
        return this;
    }

    public PCBuilder addSSD(int SSD) {
        if (SSD < 100 || SSD > 1500) {
            throw new RuntimeException("Invalid SSD");
        }
        computer.setSSD(SSD);
        return this;
    }

    public PC build() {
        if (computer.getBrand() == null) {
            throw new RuntimeException("Brand missing");
        }
        return computer;
    }
}
