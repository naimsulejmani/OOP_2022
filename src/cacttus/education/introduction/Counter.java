package cacttus.education.introduction;

public class Counter {
    private int maxValue;
    private int minValue;
    private int value;

    public Counter(int maxValue) {
        this.maxValue = maxValue;
    }

    public Counter(int minValue, int maxValue) {
        this.value = this.minValue = minValue;
        this.maxValue = maxValue;
    }


    public void increment() {
        if (value < maxValue)
            ++value;
        else {
            System.out.println("Conter has reach the limit!");
        }
    }

    public void decrement() {
        if (value > minValue)
            --value;
    }

    public int getValue() {
        return value;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

}






