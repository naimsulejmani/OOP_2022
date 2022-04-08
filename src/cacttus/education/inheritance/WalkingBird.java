package cacttus.education.inheritance;

public class WalkingBird extends Bird {
    public WalkingBird(String call, String color, String food) {
        super(call, color, food, "walking");
    }

    @Override
    public String getCall() {
        //po e e shtojme do tekst + po e therrasim metoden e prindit super.getCall
        return "WB -> " + super.getCall();
    }
}
