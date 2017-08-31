package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Map {
    public static void main(String[] args) {

        Random random = new Random();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 15; i++) {
            int number = random.nextInt(15);
            hashMap.put(i, number);
        }
        hash(hashMap);
        hash2(hashMap);
        hash3(hashMap);
        hash4(hashMap);

        System.out.println(hashMap);
    }


    static void hash(HashMap<Integer, Integer> map) {
        int key = 0;
        int value = 0;
        for (HashMap.Entry<Integer, Integer> e : map.entrySet()) {
            key += e.getKey();
            value += e.getValue();
        }
        System.out.println("Метод 1 ключи : " + key);
        System.out.println("Метод 1 значения : " + value + "\n");
    }

    static void hash2(HashMap<Integer, Integer> map) {
        int values = 0;
        int keys = 0;
        for (Integer key : map.keySet()) {
            keys += key;
            values += map.get(key);
        }
        System.out.println("Метод 2 ключи : " + keys);
        System.out.println("Метод 2 значения : " + values + "\n");
    }

    static void hash3(HashMap<Integer, Integer> map) {
        int key = 0;
        int value = 0;
        Iterator<HashMap.Entry<Integer, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            HashMap.Entry<Integer, Integer> entry = entries.next();
            key += entry.getKey();
            value += entry.getValue();
        }
        System.out.println("Метод 3 ключи : " + key);
        System.out.println("Метод 3 значения : " + value + "\n");
    }

    static void hash4(HashMap<Integer, Integer> map) {
        map.forEach((key, value) -> {
                System.out.println(key);
                System.out.println(value);

            });
    }
}
