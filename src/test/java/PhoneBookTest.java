import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {


    @Test
    public void testAdd(){
        PhoneBook phoneBook = new PhoneBook();

        Assertions.assertEquals(1, phoneBook.add("Pasha", 7_965_234_87_93L));
        Assertions.assertEquals(2, phoneBook.add("Masha", 7_932_234_87_93L));
        Assertions.assertEquals(2, phoneBook.add("Pasha", 7_965_234_87_93L));


    }
}
