import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {


    @Test
    public void addTest(){
        PhoneBook phoneBook = new PhoneBook();

        Assertions.assertEquals(1, phoneBook.add("Pasha", 7_965_234_87_93L));
        Assertions.assertEquals(2, phoneBook.add("Masha", 7_932_234_87_93L));
        Assertions.assertEquals(2, phoneBook.add("Pasha", 7_965_234_87_93L));

    }

    @Test
    public void findByNumberTest(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Pasha", 7_965_234_87_93L);
        phoneBook.add("Masha", 7_965_214_87_93L);
        phoneBook.add("Petya", 7_965_234_83_93L);
        phoneBook.add("Vasya", 7_975_234_87_93L);
        phoneBook.add("Olya", 7_965_234_87_94L);

        Assertions.assertEquals("Petya", phoneBook.findByNumber(7_965_234_83_93L));
    }
}
