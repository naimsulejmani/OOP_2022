package cacttus.education.enums.ushtrime;

public enum Rating {
    NO_STARS("\u2606\u2606\u2606\u2606\u2606"),
    ONE_STARS("\u2605\u2606\u2606\u2606\u2606"),
    TWO_STARS("\u2605\u2605\u2606\u2606\u2606"),
    THREE_STARS("\u2605\u2605\u2605\u2606\u2606"),
    FOUR_STARS("\u2605\u2605\u2605\u2605\u2606"),
    FIVE_STARS("\u2605\u2605\u2605\u2605\u2605");

    private String stars;

    private Rating(String stars) {
        this.stars = stars;
    }

    public String getStars() {
        return stars;
    }

    public void print() {
        System.out.printf("%s -> %s%n", this, this.getStars());
    }
}







