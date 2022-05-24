package cacttus.education.interfaces.detyre_pranimi;

public class Score implements Comparable<Score> {
    private final String player;
    private final int totalScore;

    public Score(String player, int totalScore) {
        this.player = player;
        this.totalScore = totalScore;
    }

    public String getPlayer() {
        return player;
    }

    public int getTotalScore() {
        return totalScore;
    }

    @Override
    public String toString() {
        return player + '=' + totalScore;
    }

    @Override
    public int compareTo(Score o) {
        if (this.totalScore - o.totalScore == 0) {
            return this.player.compareTo(o.player);
        }
        return this.totalScore - o.totalScore;
    }
    //write code here
}
