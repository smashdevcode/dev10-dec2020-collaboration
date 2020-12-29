import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Something else...");

        List<String> names = getNames();

        for (String name : names) {
            System.out.println(name);
        }
        
        System.out.println("More changes to cause merge conflicts");
        System.out.println("Breaking James's app...whoops");
    }

    private static List<String> getNames() {
        ArrayList<String> names = new ArrayList<>();
        names.add("James");
        names.add("Kiel");
        names.add("Irina");
        names.add("Fred");
        return names;
    }
}
