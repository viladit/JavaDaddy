package step4_OOP.topic8_Computer.solution;

public class Computer {
    private String brand;
    private String model;
    private int ram;

    public Computer(String brand, String model, int ram) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
    }

    public void displaySpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("RAM: " + ram + " GB");
    }
}
