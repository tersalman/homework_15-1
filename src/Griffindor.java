public class Griffindor extends Hogwarts {

    int a;
    int b;
    int c;

    public Griffindor(String name, String surname, int witchcraft, int teleport, int a, int b, int c) {
        super(name, surname, witchcraft, teleport);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
