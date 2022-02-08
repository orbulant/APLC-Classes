import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

public class App {

    static final List<Book> bookList = Arrays.asList(
        new Book ("when Breath Becomes Air", 8.8),
        new Book ("The Universe has your back", 5.6),
        new Book ("A War on Peace", 7.9),
        new Book ("One hundred years of soluted ", 7.9),
        new Book ("Moby Dick", 4.3),
        new Book ("The Great Wall", 7.0)
    );
    public static void main(String[] args) throws Exception {
        bookList.sort(Comparator.comparing(Book::getRating));
        System.out.println(bookList);
    }

    double f(int a, int b, int c, int d){
        return (a+b)*(c+d);
    };

}
