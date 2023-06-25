package baitap9;

import java.util.HashMap;

public class bt9 {
    public static void main(String[] args) {
        //Khai bao va khoi tao HashMap voi cac phan tu ben trong
        HashMap<String, Integer> hashMap =new HashMap<>();
        hashMap.put("A",9);
        hashMap.put("B",3);
        hashMap.put("C",4);
        hashMap.put("D",7);
        hashMap.put("G",5);
        // su dung contains de kiem tra phan tu co nam trong o hay ko

        boolean check= hashMap.containsKey("B");
        if (check){
            System.out.println("Phan tu: "+ "B" + " co ton tai.");
        }else {
            System.out.println("Phan tu: "+ "B"+ " khong ton tai.");
        }
    }
}
