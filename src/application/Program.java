package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment ===");
        Department deparment = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(deparment);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: seller findByAll ===");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 4: seller insert ===");
        Seller newSeller = new Seller();
        newSeller.setName("Mark");
        newSeller.setEmail("Mark@gmail.com");
        newSeller.setBirthDate(new Date());
        newSeller.setBaseSalary(10000.0);
        newSeller.setDepartment(deparment);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New Id " + newSeller.getId());

        System.out.println("\n=== TEST 5: seller insert ===");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Updated!");

        System.out.println("\n=== TEST 6: seller delete ===");
        sellerDao.deleteById(14);
        System.out.println("Deleted!");
    }
}