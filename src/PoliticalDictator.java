public class PoliticalDictator extends Diktator implements PowerActions {
    private final String partyName;

    public PoliticalDictator(String name, String country, int yearsInPower, String partyName, int popularity) {
        super(name, country, yearsInPower, popularity);
        this.partyName = partyName;
    }

    public void implementPolicy() {
        System.out.println(name + " implements the no robots allowed policy!");
        popularity-= 3;
        System.out.println("Popularity decreased to: " + popularity);
    }

    public void repressOpposition() {
        System.out.println(name + " represses the AI army!");
        popularity-= 10;
        System.out.println("Popularity decreased to: " + popularity);

    }

    public void holdParade() {
        System.out.println(name + " holds a parade to stop the robots from invading the planet!");
        popularity+= 2;
        System.out.println("Popularity increased to: " + popularity);
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Party name: " + partyName);
        System.out.println("Popularity: " + popularity);
    }
}
