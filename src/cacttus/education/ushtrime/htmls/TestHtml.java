package cacttus.education.ushtrime.htmls;

public class TestHtml {
    public static void main(String[] args) {
        Select select = new Select("ekipet", "ekipt");
        select.addOption(new Option("rm", "Real Madrid"));
        select.addOption(new Option("bb", "Barcelona"));
        select.addOption(new Option("fch", "Chelse"));
        select.addOption(new Option("audi", "Audi"));
        System.out.println(select);
    }
}
