public class Ravenclaw extends Hogwarts{
    private final int smart;
    private final int wise;
    private final int witty;

    private int creativity;

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
}
