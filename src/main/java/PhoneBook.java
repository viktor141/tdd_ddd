import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.*;

public class PhoneBook {

    private BiMap<String, Long> phoneMap = HashBiMap.create();
    private TreeSet<String> phoneNameContacts = new TreeSet<>();

    public int add(String name, long phoneNumber) {
        if(phoneMap.putIfAbsent(name, phoneNumber) == null){
            phoneNameContacts.add(name);
        }
        return phoneMap.size();
    }

    public String findByNumber(long phoneNumber) {
        return phoneMap.inverse().get(phoneNumber);
    }

    public Long findByName(String name) {
        return phoneMap.get(name);
    }

    public TreeSet<String> printAllNames() {
        return phoneNameContacts;
    }

}
