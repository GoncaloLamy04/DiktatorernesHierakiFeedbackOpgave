import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Diktator> dictator = new ArrayList<Diktator>();

        dictator.add(new MilitaryDictator("Captain Ben", "Brasil", 19, "Captain", 60));
        dictator.add(new PoliticalDictator("Commander Lewis", "England", 25, "Commander", 50));
        dictator.add(new AIDictator("Master Robert", "Alpha Centauri", 405, "Master", 40));

        System.out.println("Welcome to the dictators of system Sector-196C");

        for (Diktator dictators : dictator) {
            System.out.println("=================================");
            dictators.printDetails();
            dictators.giveSpeech();
            if (dictators instanceof MilitaryDictator) {
                MilitaryDictator m = (MilitaryDictator) dictators;
                System.out.println("=================================");
                m.implementPolicy();
                System.out.println("=================================");
                m.repressOpposition();
                System.out.println("=================================");
                m.holdParade();
            }
            if (dictators instanceof PoliticalDictator) {
                PoliticalDictator p = (PoliticalDictator) dictators;
                System.out.println("=================================");
                p.implementPolicy();
                System.out.println("=================================");
                p.repressOpposition();
                System.out.println("=================================");
                p.holdParade();
            }
            if (dictators instanceof AIDictator) {
                AIDictator a = (AIDictator) dictators;
                System.out.println("=================================");
                a.killHumans();
                System.out.println("=================================");
                a.enforceRule();
            }

        }
    }
}





