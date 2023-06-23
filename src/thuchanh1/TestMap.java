package thuchanh1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Nhung",30);
        hashMap.put("Thuy", 27);
        hashMap.put("Nam",30);
        hashMap.put("Hoa",27);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");


        // Tạo treemap trong main để lưu trữ key theo thứ tự giảm dần
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        // Tạo linkedHashMap trong main để lưu trữ danh sách sinh viên và hiển thị dữ liệu
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Thuy",  30);
        linkedHashMap.put("Nhung", 19);
        linkedHashMap.put("Hung", 24);

        System.out.println("\n The age for"+ " Nhung is"+linkedHashMap.get("Nhung"));




    }
}
