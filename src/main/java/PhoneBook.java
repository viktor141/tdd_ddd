import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class PhoneBook {

    private BiMap<String, Long> phoneMap = HashBiMap.create();

    public int add(String name, long phoneNumber){
        phoneMap.putIfAbsent(name, phoneNumber);
        return phoneMap.size();
    }

    public String findByNumber(long phoneNumber){
        return phoneMap.inverse().get(phoneNumber);
    }

    public Long findByName(String name){
        return null;
    }
}
