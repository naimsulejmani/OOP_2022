package cacttus.education.inheritance;

public class TalkingParrot extends Parrot {
    private String[] words;

    public TalkingParrot(String call, String color, String food, String[] words) {
        super(call, color, food);
        this.words = words;
        this.food = "HAHAH";
    }
}
