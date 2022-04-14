package cacttus.education.polymorphism;

public final class LenovoX1Carbon extends Laptop {
    private int x;

    public LenovoX1Carbon(int id) {
        super(id);
    }

    @Override
    public int getSerialNo() {
        return 100;
    }

    public int getX() {
        return x;
    }

    public void setX(final int x) {
      //  ++x;
        this.x = x;
    }

    //
//    @Override
//    public int getRam() {
//        return 20;
//    }
}







