public class Diktator {
    protected String name;
    protected String country;
    protected int yearsInPower;
    protected int popularity;

    public Diktator(String name, String country, int yearsInPower, int popularity) {
        this.name = name;
        this.country = country;
        this.yearsInPower = yearsInPower;
        this.popularity = popularity;
    }
    public void giveSpeech() {
        System.out.println(name + " will give a speech!");
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Years in power: " + yearsInPower);
    }

}
