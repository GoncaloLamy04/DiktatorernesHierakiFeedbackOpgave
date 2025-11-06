public class AIDictator extends Diktator {
    private final String aiRank;

    public AIDictator(String name, String country, int yearsInPower, String aiRank, int popularity) {
        super(name, country, yearsInPower, popularity);
        this.aiRank = aiRank;
    }
    public void enforceRule(){
        System.out.println(name + " enforces the dankmeme rule!");
        popularity+=3;
        System.out.println("Popularity increased to: " + popularity);
    }

    public void killHumans() {
        System.out.println(name + " instructs his army to exterminate all living humans on planet Orison 7b!");
        popularity+=5;
        System.out.println("Popularity increased to: " + popularity);
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Military rank: " + aiRank);
        System.out.println("Popularity: " + popularity);
    }
}
