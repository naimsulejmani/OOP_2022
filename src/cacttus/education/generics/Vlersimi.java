package cacttus.education.generics;

public class Vlersimi implements Comparable<Vlersimi> {
    private String emri;
    private String lenda;
    private int viti;
    private String profesori;
    private double piket;

    public Vlersimi(String emri, String lenda, int viti, String profesori, double piket) {
        this.emri = emri;
        this.lenda = lenda;
        this.viti = viti;
        this.profesori = profesori;
        this.piket = piket;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getLenda() {
        return lenda;
    }

    public void setLenda(String lenda) {
        this.lenda = lenda;
    }

    public int getViti() {
        return viti;
    }

    public void setViti(int viti) {
        this.viti = viti;
    }

    public String getProfesori() {
        return profesori;
    }

    public void setProfesori(String profesori) {
        this.profesori = profesori;
    }

    public double getPiket() {
        return piket;
    }

    public void setPiket(double piket) {
        this.piket = piket;
    }

    @Override
    public int compareTo(Vlersimi o) {
        if (this.piket < o.piket) return -1;
        else if (this.piket > o.piket) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Vlersimi{" +
                "emri='" + emri + '\'' +
                ", piket=" + piket +
                '}';
    }
}







