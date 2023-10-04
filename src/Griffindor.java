public class Griffindor extends Hogwarts {

    private final int nobility;
    private final int honor;
    private final int courage;

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
}
