public class MilitaryDictator extends Diktator implements PowerActions {
    private final String militaryRank;

    public MilitaryDictator(String name, String country, int yearsInPower, String militaryRank, int popularity) {
        super(name, country, yearsInPower, popularity);
        this.militaryRank = militaryRank;
    }
    public void implementPolicy() {
        System.out.println(name + " implements policy to let robots analyse and study Orison 7b!");
        popularity+=8;
        System.out.println("Popularity increased to: " + popularity);
    }
    public void repressOpposition() {
        System.out.println(name + " represses the people that are agaisnt robots!");
        popularity+=3;
        System.out.println("Popularity increased to: " + popularity);
    }
    public void holdParade() {
        System.out.println(name + " holds a parade to prevent humans from killing foreign robots!");
        popularity+=4;
        System.out.println("Popularity increased to: " + popularity);
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Military rank: " + militaryRank);
        System.out.println("Popularity: " + popularity);
    }
}

