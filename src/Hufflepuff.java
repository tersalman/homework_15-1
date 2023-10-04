public class Hufflepuff extends Hogwarts{
    private final int hardworking;
    private final int loyal;
    private final int honest;

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


}
