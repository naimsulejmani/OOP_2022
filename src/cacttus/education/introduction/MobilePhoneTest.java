package cacttus.education.introduction;

public class MobilePhoneTest {
    public static void main(String[] args) {
        MobilePhone iphone13 = new MobilePhone(
                "Iphone 13 Pro","Apple",
                7.1f,376f,8,
                256,8,16
        );
        System.out.printf("%s e prodhuar nga brandi %s sosht fort produkt i mire",
                iphone13.getModel(),iphone13.getBrand());
    }
}
