package baitap3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    // khai bao ArrayList de luu tru thong tin san pham

    private List<Product> productList = new ArrayList<>();

    // them san pham vao danh sach
    public void addProduct(Product product) {
        productList.add(product);
    }

    // sua thong tin dua tren id
    public void updateProduct(int id, String newName, double newPrice) {
        for (Product product : productList
        ) {
            if (product.getId() == id) {
                product.setName(newName);
                product.setPrice(newPrice);
                break;
            }
        }
    }

    // xoa san pham dua tren id
    public void removeProduct(int id) {
        for (Product product : productList
        ) {
            if (product.getId() == id) {
                productList.remove(id);
                break;
            }

        }
    }

    // hien thi danh sach san pham
    public void displayProduct() {
        for (Product product : productList
        ) {
            System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Price: " + product.getPrice());
        }
    }


    // tim kiem san pham theo ten

    public Product findProductByName(String name) {
        for (Product product : productList
        ) {
            if (product.getName() == name) {
                return product;
            }
        }
        return null;
    }

    // Sap xep san pham theo gia tang dan

    public void sortProductsAscending() {
        Collections.sort(productList, Comparator.comparingDouble(Product::getPrice));
    }

    //
    public void sortProductsDescending(){
        Collections.sort(productList, Comparator.comparingDouble(Product::getPrice).reversed());
    }


}
