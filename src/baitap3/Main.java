package baitap3;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        // them san pham

        Product product1 = new Product(1,"product 1", 180.98);
        Product product2 = new Product(2,"product 2", 30.15);
        Product product3 = new Product(3,"product 3", 260.34);
        Product product4 = new Product(4,"product 4", 500.98);
        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);
        productManager.addProduct(product4);

        // Hien thi thong tin san pham

        System.out.println("Danh sach san pham");
        productManager.displayProduct();

        // Sua thong tin san pham
        productManager.updateProduct(1, "product 11", 20.16);


        // Hien thi danh sach san pham sau khi sua
        System.out.println("Danh sach san pham sau khi sua: ");
        productManager.displayProduct();

        // xoa san pham
        productManager.removeProduct(3);

        // Hien thi san pham sau khi xoa
        System.out.println(" Hien thi san pham sau khi xoa");
        productManager.displayProduct();

        //Tim kiem san pham theo ten
        Product foundProduct = productManager.findProductByName("new product 1");
        if (foundProduct!= null){
            System.out.println("San pham duoc tim thay: ID "+ foundProduct.getId()+ ",  Name: "+foundProduct.getName() + ", Price: "+ foundProduct.getPrice());
        }else {
            System.out.println(" Khong tim thay san pham");
        }

        // sap xep san pham tang dan theo gia

        productManager.sortProductsAscending();

        // hien thi san pham tang dan theo gia
        System.out.println("Danh sach san pham sau khi sap xep tang dan: ");
        productManager.displayProduct();

        // sap xep san pham giam dan theo gia
        productManager.sortProductsDescending();

        // Sap xep san pham giam dan theo gia

        System.out.println("Danh sach san pham giam dan theo gia la: ");
        productManager.displayProduct();

    }
}
