package cacttus.education.polymorphism;

public class Laptop {
    public final int ID;
    private String model;
    private int ram;
    private int serialNo;

    //instance initializer block
    {
        for (int i = 0; i < 10; i++) {

        }
    }

    {
        ram = 8;
    }

    public Laptop(int id) {
        ID = id;
    }

    public final int getRam() {
        return ram;
    }

    public int getSerialNo() {
        return serialNo;
    }
}









