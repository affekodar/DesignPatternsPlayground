package Builder.Task;

public class Main {
    public static void main(String[] args) {
        PCBuilder builder = new PCBuilder();
        PC computer = builder
                .addBrand("Dell")
                .addCPU("Intel core i7")
                .addSSD(256)
                .build();

        System.out.println("Computer created: " + computer.getBrand() + ", " +  computer.getCPU() + ", " + computer.getSSD() + "GB");
    }
}
