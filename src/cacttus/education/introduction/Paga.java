package cacttus.education.introduction;

public class Paga {
    private String name;
    private float value;
    private int month;
    private int year;
    private String company;

    public Paga() {
    }

    public Paga(String name, float value, int month, int year, String company) {
        this.name = name;
        this.value = value;
        this.month = month;
        this.year = year;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void print() {
        System.out.printf(
                "Paga e %s per periudhen %d/%d  nga kompania %s eshte: %.2f EUR.%n",
                name, month, year, company, value
        );
    }
}









