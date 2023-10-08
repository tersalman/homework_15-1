public abstract class Hogwarts {
    protected final String name;
    protected final String surname;
    protected final int witchcraft;
    protected final int teleport;

    public Hogwarts(String name, String surname, int witchcraft, int teleport) {
        this.name = name;
        this.surname = surname;
        this.witchcraft = witchcraft;
        this.teleport = teleport;
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public int getWitchcraft() {
        return witchcraft;
    }


    public int getTeleport() {
        return teleport;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", witchcraft=" + witchcraft +
                ", teleport=" + teleport +
                '}';
    }

    private int sumTheAbilities() {
        return witchcraft + teleport;
    }

    public void basicCompare(Hogwarts hogwarts) {
        int a = sumTheAbilities();
        int b = hogwarts.sumTheAbilities();
        if (a > b) {
            System.out.println(name + " лучший Гриффиндорец, чем "+ hogwarts.getName());
        }else {
            System.out.println(hogwarts.getName() + " лучший Гриффиндорец, чем "+ name);
        }
    }


}
