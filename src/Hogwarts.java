public  class Hogwarts {
    private final String name;
    private final String surname;
    private final int witchcraft;
    private final int teleport;

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


}
