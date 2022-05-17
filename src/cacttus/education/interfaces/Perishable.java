package cacttus.education.interfaces;

import java.time.Period;

public interface Perishable {
    //constants
    public static final Period MAX_PERIOD = Period.ofDays(5);
    Period MIN_PERIOD = Period.ofDays(1);

    //abstract methods
    void perish();

    public abstract boolean isPerished();

    //default methods
    public default boolean verifyPeriod(Period currentPeriod) {
        return comparePeriod(currentPeriod) < 0;
    }

    //private methods
    private int comparePeriod(Period currentPeriod) {
        return currentPeriod.getDays() - MAX_PERIOD.getDays();
    }

    //static methods
    public static int getMaxPeriodDays() {
        return MAX_PERIOD.getDays();
    }

}











