import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

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
        return phoneMap.get(name);
    }

    public Set<String> printAllNames(){
        return new HashSet<>();
    }
}
