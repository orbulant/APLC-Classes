import java.lang.String;
import java.util.List;

public class App {

    // Not so pure...
    public boolean findNemoUnpure(List<String> names){
        try {
            return names.contains("Nemo");
        } catch (Exception e) {
            return false;
        }
    }

    // Purer
    public boolean findNemo(List<String> names) {
        try {
            return names.contains("Nemo");
        } catch (Exception e) {
            return false;
        }
    }

    // Somehow lecturer said this is more pure that the first example...
    /**
     * A purer function compared to above, .findAny() has ONE exception which is
     * handled by .orElse(null).
     * This makes it so that exception handling is done which returns appropriately.
     * 
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
