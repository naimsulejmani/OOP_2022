package cacttus.education.introduction;

public class PagaTest {
    public static void main(String[] args) {
        Paga pagaEOmerit =
                new Paga("Omer Shaqiri",
                        9999.99f,3,2022,
                        "Badihava SHPK");
        Paga pagaEErionit = new Paga();

        pagaEOmerit.print();
        pagaEErionit.print();

    }
}
