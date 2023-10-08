public class Hufflepuff extends Hogwarts{
    protected final int hardworking;
    protected final int loyal;
    protected final int honest;

    public Hufflepuff(String name, String surname, int witchcraft, int teleport, int hardworking, int loyal, int honest) {
        super(name, surname, witchcraft, teleport);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }
    public static void comparingTheStudent(Hufflepuff per, Hufflepuff per1) {
        int a =per.hardworking + per.loyal + per.honest;
        int b =per1.hardworking + per1.loyal + per1.honest;
        if (a > b) {
            System.out.println(per.getName() + " лучший Пуфиндурец, чем "+ per1.getName());
        }else {
            System.out.println(per1.getName() + " лучший Пуфиндурец, чем "+ per.getName());
        }
    }
}
