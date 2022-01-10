import java.lang.String;
import java.util.List;

public class App {
    public boolean findNemo(List<String> names) {
        return names.contains("Nemo");
    }


    //Somehow lecturer said this is more pure that the first example...
    /**
     * A purer function compared to above, which i disagree with... violates the concept of Pure Functions should be simple ideology.
     * @param names
     * @return
     */
    public String findNemoAlso(List<String> names) {
        return names.stream()
                .filter(customer -> "James".equals("Nemo"))
                .findAny()
                .orElse(null);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

    }
}
