package baitap2;

import java.util.HashMap;
import java.util.Map;

public class baitap2 {
    public static void main(String[] args) {
        // khai bao va khoi tao mang
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 7, 6, 5, 4, 3};

        // khoi tao HashMap de luu tru so lan xuat hien cua tung phan tu
        Map<Integer, Integer> elementCoutMap = new HashMap<>();

        // Duyet qua mang va dem so lan so lan xuat hien cua tung phan tu

        for (int element : arr
        ) {
            if (elementCoutMap.containsKey(element)) {
                // neu phan tu da co trong HashMap thi tan so lan xuat hien len 1
                int count = elementCoutMap.get(element);
                elementCoutMap.put(element, count + 1);
            } else {
                elementCoutMap.put(element, 1);
            }
        }

        // duyet qua cac phan u trong HashMap va in ra so lan xuat hien cua tung phan tu
        for (Map.Entry<Integer, Integer> enTry : elementCoutMap.entrySet()
        ) {
            int element = enTry.getKey();
            int count = enTry.getValue();
            if (count==1){
                System.out.println("phan tu"+element+ " co mot lan xuat hien.");

            }
        }


    }
}
