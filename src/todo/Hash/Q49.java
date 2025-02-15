package todo.Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for (String str:strs){
            char[] chs = str.toCharArray();
            Arrays.sort(chs);
            String sort = String.copyValueOf(chs);
            List<String> list = map.getOrDefault(sort,new ArrayList<>());
            list.add(str);
            map.put(sort,list);
        }
        return new ArrayList<>(map.values());
    }
}
