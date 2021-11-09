import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ProductRepository  {
    public ArrayList<Product> products;
    public ArrayList<Product> getData() {
        products = new ArrayList<>();


        products.add(new Product ("Robot lau nhà", "RB12", 5550000, Category.HOUSEWARE, 9, 2));
        products.add(new Product ("Niacinamide 10%", "NC10", 250000, Category.COSMESTIC, 19, 11));
        products.add(new Product ("Áo khoác nam", "AK98", 535000, Category.FASHION, 50, 15));
        products.add(new Product ("Snack", "SN03", 10000, Category.FOOD, 100, 69));
        products.add(new Product ("Facial Mask", "FM01", 40000, Category.COSMESTIC, 22, 11));
        products.add(new Product ("Nồi cơm điện", "CK35", 3120000, Category.HOUSEWARE, 18, 5));
        products.add(new Product ("Red bull", "FM01", 20000, Category.FOOD, 100, 35));
        products.add(new Product ("Áo khoác nữ", "AK99", 420000, Category.FASHION, 55, 29));
        return products;
    }

    public void print() {
        for (Product p: products
             ) {
            System.out.println(p);
        }
    }

    public void get100kProduct() {
        for (Product p: products
             ) {
            if (p.getPrice() > 100000) {
                System.out.println(p);
            }
        }
    }

    public void getMaxSold() {
        int max = products.get(0).getSold();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getSold() > max) {
                max = products.get(i).getSold();
            }
        }
        for (Product p: products) {
            if (p.getSold() == max) {
                System.out.println(p);
            }
        }
    }

    public void compareProductByQuantity() {
        Collections.sort(products);
    }

    public void compareProductByCategory () {
       Collections.sort(products, new Comparator<Product>() {
           @Override
           public int compare(Product o1, Product o2) {
               return o1.getCategory().compareTo(o2.getCategory());
           }
       });
    }



}



