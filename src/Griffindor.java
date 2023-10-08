public class Griffindor extends Hogwarts {

    protected final int nobility;
    protected final int honor;
    protected final int courage;

    public Griffindor(String name, String surname, int witchcraft, int teleport, int nobility, int honor, int courage) {
        super(name, surname, witchcraft, teleport);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    @Override
    public String toString() {
        return "Griffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", witchcraft=" + witchcraft +
                ", teleport=" + teleport +
                '}';
    }

    public static void comparingTheStudent(Griffindor per, Griffindor per1) {
        int a =per.courage + per.honor + per.nobility;
        int b =per1.courage + per1.honor + per1.nobility;
        if (a > b) {
            System.out.println(per.getName() + " лучший Гриффиндорец, чем "+ per1.getName());
        }else {
            System.out.println(per1.getName() + " лучший Гриффиндорец, чем "+ per.getName());
        }
    }

}
