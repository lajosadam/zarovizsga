package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.HashSet;
import java.util.Set;

public class DigitsCounter {

    Set<Integer> uniqueNumberCount = new HashSet<>();


    int getCountOfDigits(String s) {
        if (s == null) {
            return uniqueNumberCount.size();
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    uniqueNumberCount.add(Integer.valueOf(s.charAt(i)));
                }
            }
            return uniqueNumberCount.size();
        }
    }
}
