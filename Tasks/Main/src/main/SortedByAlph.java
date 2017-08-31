package main;

import java.util.Comparator;

class SortedByAlph implements Comparator<String> {

    public SortedByAlph() {
        
    }

    @Override
    public int compare(String f1, String f2) {
        if (f1 == null && f2 == null) {
            return 0;
        } else if (f1 == null) {
            return -1;
        } else if (f2 == null) {
            return 1;
        }
        return f1.toLowerCase().compareTo(f2.toLowerCase());
    }
}
