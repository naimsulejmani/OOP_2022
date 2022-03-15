package cacttus.education.enums;

public enum StudentBehaviour {
    NOT_LISTENING(-10),
    SO_NOISY(-5),
    LITTLE_NOISY(-1),
    NOT_INTERESTED(0),
    LISTENING(1),
    VERY_ACTIVE(5);

    private int value;

    private StudentBehaviour(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}







