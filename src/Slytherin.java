public class Slytherin extends Hogwarts{
    int a;
    int b;
    int c;

    int d;

    public Slytherin(String name, String surname, int witchcraft, int teleport, int a, int b, int c, int d) {
        super(name, surname, witchcraft, teleport);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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

    public int getD() {
        return d;
    }
}
