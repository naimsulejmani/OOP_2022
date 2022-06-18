package cacttus.education.provim.Detyra2;

import cacttus.education.provim.Main;

public class TrekendeshiKendrejte {
    private double katetjaA;
    private double katetjaB;
    private double hipotenuza;


    public TrekendeshiKendrejte(double katetjaA, double katetjaB) {
        setKatetjaA(katetjaA);
        this.katetjaB = katetjaB;
        hipotenuza = Math.sqrt(katetjaA * katetjaA + katetjaB * katetjaB);
    }

    public TrekendeshiKendrejte(double katetjaA, double katetjaB, double hipotenuza) {

        this.katetjaA = katetjaA;
        this.katetjaB = katetjaB;
        this.hipotenuza = hipotenuza;
        if (!isValid()) {
            throw new RuntimeException("Vlerat e dhena nuk jane valide");
        }
    }

    public double getKatetjaA() {
        return katetjaA;
    }

    public void setKatetjaA(double katetjaA) {
        if (katetjaA < 0) throw new NumberFormatException("Vlera negative!");
        this.katetjaA = katetjaA;
    }

    public double getKatetjaB() {
        return katetjaB;
    }

    public void setKatetjaB(double katetjaB) {
        this.katetjaB = katetjaB;
    }

    public double gethipotenuza() {
        return hipotenuza;
    }

    public void sethipotenuza(double hipotenuza) {
        this.hipotenuza = hipotenuza;
    }

    private boolean isValid() {
        return hipotenuza * hipotenuza == katetjaA * katetjaA + katetjaB * katetjaB;
    }

    public double perimeter() {
        return katetjaB + katetjaA + hipotenuza;
    }

    public double siperfaqja() {
        return 0.5 * katetjaA * katetjaB;
    }


}
