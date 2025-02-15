package todo.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q438 {
    public static void main(String[] args) {
        findAnagrams("cbaebabacd","abc");
    }
    public static List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        if (sLen < pLen) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapP = new HashMap<>();
        char[] Sch = s.toCharArray();
        char[] Pch = p.toCharArray();
        for (char c : Pch) {
            int count = mapP.getOrDefault(c, 0)+1;
            mapP.put(c, count);
        }
        for (int i = 0; i < pLen; i++) {
            int count = mapS.getOrDefault(Sch[i], 0)+1;
            mapS.put(Sch[i], count);
        }
        if (mapP.equals(mapS)) {
            result.add(0);
        }
        for (int i = 0; i < sLen - pLen; i++) {
            mapS.put(Sch[i], mapS.getOrDefault(Sch[i], 0) - 1);
            if(mapS.get(Sch[i]) == 0){
                mapS.remove(Sch[i]);
            }
            mapS.put(Sch[i + pLen], mapS.getOrDefault(Sch[i + pLen], 0) + 1);
            if (mapP.equals(mapS)) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
