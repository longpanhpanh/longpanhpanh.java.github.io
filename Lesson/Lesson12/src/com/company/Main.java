package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProductRepository pRepo = new ProductRepository();
    //	pRepo.productSortByCateGory();
    //	pRepo.productSortByBrand();
    //  pRepo.findProduct();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập lựa chọn của bạn");
            System.out.println("1. In thông tin sản phẩm theo danh mục");
            System.out.println("2. In thông tin sản phẩm dựa theo hãng");
            System.out.println("3. In thông tin sản phẩm dựa theo mức giá");
            System.out.println("4. Tìm kiếm theo tên sản phẩm");
            System.out.println("0. Thoát chương trình");
            System.out.println("Nhập lựa chọn của bạn");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    pRepo.productSortByCateGory();
                    break;
                case 2:
                    pRepo.productSortByBrand();
                    break;
                case 3:
                    pRepo.productSortByPriceRange();
                    break;
                case 4:
                    pRepo.findProduct();
                    break;
                case 0:
                    System.out.println("Hẹn gặp lại");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }

        }
    }
}
