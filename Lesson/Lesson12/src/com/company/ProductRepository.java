package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ProductRepository {
    ArrayList<Product> listProduct;
    public  ArrayList<Product> getData() {
        listProduct = new ArrayList<>();
        listProduct.add(new Product(1 , "Oppo Reno5 8GB-128GB", "Oppo Reno5 8GB-128GB", 6688000L, 10, 7, "OPPO", Category.PHONE));
        listProduct.add(new Product(2 , "Oppo Reno4 Pro", "Oppo Reno4 Pro",  11490000L, 25, 10, "OPPO", Category.PHONE));
        listProduct.add(new Product(3 , "Samsung Galaxy Z Flip", "Samsung Galaxy Z Flip", 20990000L, 19, 3, "Samsung", Category.PHONE));
        listProduct.add(new Product(4 , "Oppo A92", "Oppo A92", 5990000L , 30, 15, "OPPO", Category.PHONE));
        listProduct.add(new Product(5 , "Xiaomi Redmi 9 4GB-64GB", "Xiaomi Redmi 9 4GB-64GB", 3190000L, 30, 25, "Xiaomi", Category.PHONE));
        listProduct.add(new Product(6 , "Asus Zenbook UX325EA-EG079T", "Asus Zenbook UX325EA-EG079T", 20790000L, 10, 6, "Asus", Category.LAPTOP));
        listProduct.add(new Product(7 , "Dell G3 15 i5 10300H", "Dell G3 15 i5 10300H", 21840000L, 15, 4, "DELL", Category.LAPTOP));
        listProduct.add(new Product(8 , "Dell Inspiron N7501 i7 10750H", "Dell Inspiron N7501 i7 10750H", 28970000L, 10, 1, "DELL", Category.LAPTOP));
        listProduct.add(new Product(9 , "iPhone 12 Pro Max 128GB", "iPhone 12 Pro Max 128GB", 30990000L, 5, 2, "iPhone", Category.APPLE));
        listProduct.add(new Product(10 , "MacBook Air 13\" 2020 M1 16GB/256GB", "MacBook Air 13\" 2020 M1 16GB/256GB", 33990000L, 20, 4, "MacBook", Category.APPLE));
        listProduct.add(new Product(11 , "Loa bluetooth Compact 2", "Loa bluetooth Compact 2", 290000L, 20, 15, "Xiaomi", Category.ACCESSORY));
        listProduct.add(new Product(12 , "Loa bluetooth i.value BT116", "Loa bluetooth i.value BT116", 490000L, 30, 19, "i.value", Category.ACCESSORY));
        listProduct.add(new Product(13 , "Pin sạc dự phòng 10000mAh Mi Ultra Compact", " Pin sạc dự phòng 10000mAh Mi Ultra Compact", 710000L, 20, 10, "Xiaomi", Category.ACCESSORY));
        listProduct.add(new Product(14 , " Vivo Y20 4GB-64GB", " Vivo Y20 4GB-64GB", 3690000L, 15, 1, "Vivo", Category.PHONE));
        return listProduct;
    }

    public void productSortByCateGory() {
        getData();
        System.out.println("1. Danh mục điện thoại");
        System.out.println("2. Danh mục laptop");
        System.out.println("3. Danh mục Apple");
        System.out.println("4. Danh mục Phụ kiện");
        System.out.println("0. Thoát chương trình");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Sản phẩm trong danh mục Điện thoại: ");
                for (Product p : listProduct) {
                    if (p.getCategory() == Category.PHONE) {
                        System.out.println(p);
                    }
                }
                break;
            case 2:
                System.out.println("Sản phẩm trong danh mục Laptop: ");
                for (Product p : listProduct) {
                    if (p.getCategory() == Category.LAPTOP) {
                        System.out.println(p);
                    }
                }
                break;
            case 3:
                System.out.println("Sản phẩm trong danh mục Apple: ");
                for (Product p : listProduct) {
                    if (p.getCategory() == Category.APPLE) {
                        System.out.println(p);
                    }
                }
                break;
            case 4:
                System.out.println("Sản phẩm trong danh mục Phụ kiện: ");
                for (Product p : listProduct) {
                    if (p.getCategory() == Category.ACCESSORY) {
                        System.out.println(p);
                    }
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Không có lựa chọn này");
        }
    }

    public void productSortByBrand() {
        getData();
        System.out.println("1. Oppo");
        System.out.println("2. Xiaomi");
        System.out.println("3. Samsung");
        System.out.println("4. Asus");
        System.out.println("5. DELL");
        System.out.println("6. Macbook");
        System.out.println("7. iphone");
        System.out.println("8. i.value");
        System.out.println("9. Vivo");
        System.out.println("0. Thoát chương trình");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Brand: Oppo");
                for (Product p : listProduct) {
                    if (p.getBrand().equalsIgnoreCase("OPPO")) {
                        System.out.println(p);
                    }
                }
                break;
            case 2:
                System.out.println("Brand: Xiaomi");
                for (Product p : listProduct) {
                    if (p.getBrand().equals("Xiaomi")) {
                        System.out.println(p);
                    }
                }
                break;
            case 3:
                System.out.println("Brand: Samsung");
                for (Product p : listProduct) {
                    if (p.getBrand().equals("Samsung")) {
                        System.out.println(p);
                    }
                }
                break;
            case 4:
                System.out.println("Brand: Asus");
                for (Product p : listProduct) {
                    if (p.getBrand().equals("Asus")) {
                        System.out.println(p);
                    }
                }
                break;
            case 5:
                System.out.println("Brand: DELL");
                for (Product p : listProduct) {
                    if (p.getBrand().equals("DELL")) {
                        System.out.println(p);
                    }
                }
                break;
            case 6:
                System.out.println("Brand: Macbook");
                for (Product p : listProduct) {
                    if (p.getBrand().equals("Macbook")) {
                        System.out.println(p);
                    }
                }
                break;
            case 7:
                System.out.println("Brand: iphone");
                for (Product p : listProduct) {
                    if (p.getBrand().equals("iphone")) {
                        System.out.println(p);
                    }
                }
                break;
            case 8:
                System.out.println("Brand: i.value");
                for (Product p : listProduct) {
                    if (p.getBrand().equals("i.value")) {
                        System.out.println(p);
                    }
                }
                break;
            case 9:
                System.out.println("Brand: Vivo");
                for (Product p : listProduct) {
                    if (p.getBrand().equals("Vivo")) {
                        System.out.println(p);
                    }
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Không có danh mục này");
        }
    }

    public void productSortByPriceRange() {
        getData();
        System.out.println("1. Dưới 2 triệu");
        System.out.println("2. Từ 2 - 4 triệu");
        System.out.println("3. Từ 4 - 7 triệu");
        System.out.println("4. Từ 7 - 13 triệu");
        System.out.println("5. Trên 13 triệu");
        System.out.println("0. Thoát chương trình");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Dưới 2 triệu");
                for (Product p : listProduct) {
                    if (p.getPrice() < 2000000) {
                        System.out.println(p);
                    }
                }
                break;
            case 2:
                System.out.println("Từ 2 - 4 triệu");
                for (Product p : listProduct) {
                    if (p.getPrice() >= 2000000 && p.getPrice() < 4000000) {
                        System.out.println(p);
                    }
                }
                break;
            case 3:
                System.out.println("Từ 4 - 7 triệu");
                for (Product p : listProduct) {
                    if (p.getPrice() >= 4000000 && p.getPrice() < 7000000) {
                        System.out.println(p);
                    }
                }
                break;
            case 4:
                System.out.println("Từ 7 - 13 triệu");
                for (Product p : listProduct) {
                    if (p.getPrice() >= 7000000 && p.getPrice() <= 13000000) {
                        System.out.println(p);
                    }
                }
                break;
            case 5:
                System.out.println("Trên 13 triệu");
                for (Product p : listProduct) {
                    if (p.getPrice() > 13000000) {
                        System.out.println(p);
                    }
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Không có mức giá này");
        }
    }

    public void findProduct() {
        getData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm: ");
        String find = sc.nextLine();
        for (Product p : listProduct) {
            if (p.getName().toLowerCase().contains(find.toLowerCase())) {
                System.out.println(p);
            }
        }
    }

}
