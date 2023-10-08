public class Ravenclaw extends Hogwarts{
    protected final int smart;
    protected final int wise;
    protected final int witty;

    protected int creativity;

    public Ravenclaw(String name, String surname, int witchcraft, int teleport, int smart, int wise, int witty, int creativity) {
        super(name, surname, witchcraft, teleport);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", witchcraft=" + witchcraft +
                ", teleport=" + teleport +
                '}';
    }

    public static void comparingTheStudent(Ravenclaw per, Ravenclaw per1) {
        int a =per.smart + per.wise + per.witty + per.creativity;
        int b =per1.smart + per1.wise + per1.witty + per1.creativity;
        if (a > b) {
            System.out.println(per.getName() + " лучший Когтевранец, чем "+ per1.getName());
        }else {
            System.out.println(per1.getName() + " лучший Когтевранец, чем "+ per.getName());
        }
    }
}
