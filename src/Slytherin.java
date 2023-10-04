public class Slytherin extends Hogwarts{
    private final int cunning;
    private final int determenation;
    private final int ambition;

    private final int lustingForPower;

    public Slytherin(String name, String surname, int witchcraft, int teleport, int cunning, int determenation, int ambition, int lustingForPower) {
        super(name, surname, witchcraft, teleport);
        this.cunning = cunning;
        this.determenation = determenation;
        this.ambition = ambition;
        this.lustingForPower = lustingForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermenation() {
        return determenation;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getLustingForPower() {
        return lustingForPower;
    }
}
