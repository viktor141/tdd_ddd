import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class PhoneBookTest {


    @Test
    public void addTest(){
        PhoneBook phoneBook = new PhoneBook();

        Assertions.assertEquals(1, phoneBook.add("Pasha", 7_965_234_87_93L));
        Assertions.assertEquals(2, phoneBook.add("Masha", 7_932_234_87_93L));
        Assertions.assertEquals(2, phoneBook.add("Pasha", 7_965_234_87_93L));

    }

    private PhoneBook initPhoneBook(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Pasha", 7_965_234_87_93L);
        phoneBook.add("Masha", 7_965_214_87_93L);
        phoneBook.add("Petya", 7_965_234_83_93L);
        phoneBook.add("Vasya", 7_975_234_87_93L);
        phoneBook.add("Olya", 7_965_234_87_94L);

        return phoneBook;
    }

    @Test
    public void findByNumberTest(){
        PhoneBook phoneBook = initPhoneBook();

        Assertions.assertEquals("Petya", phoneBook.findByNumber(7_965_234_83_93L));
    }

    @Test
    public void findByNameTest(){
        PhoneBook phoneBook = initPhoneBook();

        Assertions.assertEquals(7_965_214_87_93L, phoneBook.findByName("Masha"));
        Assertions.assertNull(phoneBook.findByName("Dasha"));
    }

    @Test
    public void printAllNames(){
        PhoneBook phoneBook = initPhoneBook();

        List<String> list = new ArrayList<>();

        list.add("Pasha");
        list.add("Masha");
        list.add("Petya");
        list.add("Vasya");
        list.add("Olya");

        list = list.stream().sorted().toList();

        System.out.println(list);

        Assertions.assertIterableEquals(list, phoneBook.printAllNames());
    }
}
