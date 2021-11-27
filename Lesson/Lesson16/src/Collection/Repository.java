package Collection;

import java.util.*;


public class Repository {
        ArrayList<Product> listProduct;
        Map<String, Integer> listCategory = new HashMap<>();
        Map<String, Integer> listBrand = new HashMap<>();

    public ArrayList<Product> getListProduct() {
            listProduct = new ArrayList<>();
            listProduct.add(new Product(1, "Oppo Reno5 8GB-128GB", "Oppo Reno5 8GB-128GB", 6688000L, 10, 7, "OPPO", Category.PHONE));
            listProduct.add(new Product(2, "Oppo Reno4 Pro", "Oppo Reno4 Pro", 11490000L, 25, 10, "OPPO", Category.PHONE));
            listProduct.add(new Product(3, "Samsung Galaxy Z Flip", "Samsung Galaxy Z Flip", 20990000L, 19, 3, "Samsung", Category.PHONE));
            listProduct.add(new Product(4, "Oppo A92", "Oppo A92", 5990000L, 30, 15, "OPPO", Category.PHONE));
            listProduct.add(new Product(5, "Xiaomi Redmi 9 4GB-64GB", "Xiaomi Redmi 9 4GB-64GB", 3190000L, 30, 25, "Xiaomi", Category.PHONE));
            listProduct.add(new Product(6, "Asus Zenbook UX325EA-EG079T", "Asus Zenbook UX325EA-EG079T", 20790000L, 10, 6, "Asus", Category.LAPTOP));
            listProduct.add(new Product(7, "Dell G3 15 i5 10300H", "Dell G3 15 i5 10300H", 21840000L, 15, 4, "DELL", Category.LAPTOP));
            listProduct.add(new Product(8, "Dell Inspiron N7501 i7 10750H", "Dell Inspiron N7501 i7 10750H", 28970000L, 10, 1, "DELL", Category.LAPTOP));
            listProduct.add(new Product(9, "iPhone 12 Pro Max 128GB", "iPhone 12 Pro Max 128GB", 30990000L, 5, 2, "iPhone", Category.APPLE));
            listProduct.add(new Product(10, "MacBook Air 13\" 2020 M1 16GB/256GB", "MacBook Air 13\" 2020 M1 16GB/256GB", 33990000L, 20, 4, "MacBook", Category.APPLE));
            listProduct.add(new Product(11, "Loa bluetooth Compact 2", "Loa bluetooth Compact 2", 290000L, 20, 15, "Xiaomi", Category.ACCESSORY));
            listProduct.add(new Product(12, "Loa bluetooth i.value BT116", "Loa bluetooth i.value BT116", 490000L, 30, 19, "i.value", Category.ACCESSORY));
            listProduct.add(new Product(13, "Pin sạc dự phòng 10000mAh Mi Ultra Compact", " Pin sạc dự phòng 10000mAh Mi Ultra Compact", 710000L, 20, 10, "Xiaomi", Category.ACCESSORY));
            listProduct.add(new Product(14, " Vivo Y20 4GB-64GB", " Vivo Y20 4GB-64GB", 3690000L, 15, 1, "Vivo", Category.PHONE));
            return listProduct;
        }


        public void listSortByCategory(ArrayList<Product> list) {
            System.out.println("Liệt kê số lượng sản phẩm theo danh mục");
            for (int i = 0; i < list.size(); i++) {
                String productKey = list.get(i).getCategory().getValues();
                listCategory.merge(productKey, 1, Integer::sum);
            }

            for (Map.Entry<String, Integer> entry: listCategory.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
            System.out.println("-----------------------------------------");
        }


        public void listSortByBrand(ArrayList<Product> list) {
            System.out.println("Liệt kê số lượng sản phẩm theo hãng");
            for (int i = 0; i < list.size(); i++) {
                String productKey = list.get(i).getBrand();
                if (listBrand.get(productKey) == null) {
                    listBrand.put(productKey, 1);
                } else {
                    listBrand.put(productKey, listBrand.get(productKey) + 1);
                }
            }

            for (Map.Entry<String, Integer> entry: listBrand.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
            System.out.println("-----------------------------------------");
        }

        public void listSortBySearch(ArrayList<Product> list) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập từ khóa tìm kiếm");
            String search = sc.nextLine();
            int count = 0;
            for (Product p : list) {
                if (p.getName().toLowerCase().contains(search.toLowerCase())) {
                    System.out.println(p);
                    count++;
                }
            }
            System.out.println("Có " + count + " sản phẩm chứa từ khóa " + search );

            System.out.println("-----------------------------------------");
        }
    }



