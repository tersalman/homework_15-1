public class Slytherin extends Hogwarts{
    protected final int cunning;
    protected final int determenation;
    protected final int ambition;
    protected final int resourcefulness;
    protected final int lustingForPower;

    public Slytherin(String name, String surname, int witchcraft, int teleport, int cunning, int determenation, int ambition, int lustingForPower, int resourcefulness) {
        super(name, surname, witchcraft, teleport);
        this.cunning = cunning;
        this.determenation = determenation;
        this.ambition = ambition;
        this.lustingForPower = lustingForPower;
        this.resourcefulness= resourcefulness;
    }

    public int getResourcefulness() {
        return resourcefulness;
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

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determenation=" + determenation +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustingForPower=" + lustingForPower +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", witchcraft=" + witchcraft +
                ", teleport=" + teleport +
                '}';
    }

    public static void comparingTheStudent(Slytherin per, Slytherin per1) {
        int a =per.cunning + per.determenation + per.ambition + per.lustingForPower;
        int b =per1.cunning + per1.determenation + per1.ambition + per.lustingForPower;
        if (a > b) {
            System.out.println(per.getName() + " лучший Слизеринец, чем "+ per1.getName());
        }else {
            System.out.println(per1.getName() + " лучший Слизеринец, чем "+ per.getName());
        }
    }
}
