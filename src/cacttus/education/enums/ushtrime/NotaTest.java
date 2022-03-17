package cacttus.education.enums.ushtrime;

public class NotaTest {
    public static void main(String[] args) {
        Nota matematike = Nota.SHKELQYESHEM;
        Nota fizike = Nota.MIRE;
        Nota kimi = Nota.MIRE;
        Nota edukateFizike = Nota.SHKELQYESHEM;
        Nota gjuheShqipe = Nota.SHKELQYESHEM;

        double notaMesatare = (matematike.getValue() + fizike.getValue() +
                kimi.getValue() + edukateFizike.getValue() +
                gjuheShqipe.getValue()) / (double) 5;

        System.out.println(notaMesatare);

        Nota[] notatEMuales = {Nota.SHKELQYESHEM, Nota.SHUME_MIRE, Nota.SHKELQYESHEM};
        Nota[] notatEElmedinit = {Nota.DOBET, Nota.MJAFTUESHEM, Nota.SHUME_MIRE};
    }
}
