import java.util.HashMap;

public class PhoneBook {

    private HashMap<String, Long> phoneMap = new HashMap<>();

    public int add(String name, long phoneNumber){
        phoneMap.putIfAbsent(name, phoneNumber);
        return phoneMap.size();
    }

    public String findByNumber(long phoneNumber){
        return null;
    }
}
