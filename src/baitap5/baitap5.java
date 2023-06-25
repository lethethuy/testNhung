package baitap5;

import java.util.*;

public class baitap5 {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo HashMap chứa các phần tử và giá trị của chúng
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 5);
        hashMap.put("B", 2);
        hashMap.put("C", 8);
        hashMap.put("D", 1);

        // Bước 2: Tạo danh sách các cặp key-value từ HashMap
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());

        // Bước 3: Sắp xếp danh sách theo giá trị tăng dần của chúng
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });

        // Bước 4: In ra các phần tử và giá trị của chúng theo thứ tự tăng dần
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


    }
