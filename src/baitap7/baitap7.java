package baitap7;

import java.util.HashMap;
import java.util.Map;

public class baitap7 {
    public static void main(String[] args) {
        // khai bao va khoi tao HashMap va tao du lieu
        Map<Integer, String> hashMapGoc = new HashMap<>();
        hashMapGoc.put(1,"value 1");
        hashMapGoc.put(2,"value 2");
        hashMapGoc.put(3,"value 3");
        hashMapGoc.put(4,"value 4");
        // display hashMapGoc
        System.out.println("HashMap goc la: ");
        System.out.println(hashMapGoc);

        // khoi tao 1 hashMap moi va so chep du lieju tu hashMap goc
        HashMap<Integer,String> hasMapMoi = new HashMap<>();
        hasMapMoi.putAll(hashMapGoc);
        System.out.println("HashMap moi la: ");
        System.out.println(hasMapMoi);

    }

}
