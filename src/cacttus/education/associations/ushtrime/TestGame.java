package cacttus.education.associations.ushtrime;

public class TestGame {
    public static void main(String[] args) {
        Bomber b52 = new Bomber(16, 9); //bombardues amerikan b52
        //sistem mbrojtjes antiajrore rus s400
        AntiAircraftGun s400 = new AntiAircraftGun(1, 1);
        b52.setTarget(s400);
        b52.moveLeft();
        b52.moveLeft();
        b52.moveLeft();
        b52.moveLeft();
        b52.moveLeft();
        b52.moveLeft();
        b52.moveLeft();
        b52.moveLeft();
        b52.moveLeft();
        b52.moveLeft();
        b52.moveLeft();
        b52.moveLeft();
        b52.setTarget(s400);
        b52.attack();
        b52.attack();
        System.out.println(s400.getDamage());
    }
}
