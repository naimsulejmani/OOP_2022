package cacttus.education.introduction;

public class MobilePhone {
    private String model;
    private String brand;
    private float size;
    private float weight;
    private int ramMemory; //ne GB
    private int storage; //ne GB
    private int frontCameraPixel;
    private int backCameraPixel;

    public MobilePhone(String model, String brand, float size, float weight,
                       int ramMemory, int storage, int frontCameraPixel,
                       int backCameraPixel) {
        this.model = model;
        this.brand = brand;
        this.size = size;
        this.weight = weight;
        this.ramMemory = ramMemory;
        this.storage = storage;
        this.frontCameraPixel = frontCameraPixel;
        this.backCameraPixel = backCameraPixel;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public float getSize() {
        return size;
    }

    public float getWeight() {
        return weight;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public int getStorage() {
        return storage;
    }

    public int getFrontCameraPixel() {
        return frontCameraPixel;
    }

    public int getBackCameraPixel() {
        return backCameraPixel;
    }
}
