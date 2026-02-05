package application;

import db.DB;
import db.DbIntegrityException;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById ===");
        Department department = departmentDao.findById(6);
        System.out.println(department);

        System.out.println("\n=== TEST 2: department findByAll ===");
        for (Department obj : departmentDao.findAll()) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: department seller insert ===");
        Department newDepartment = new Department(null, "Military");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New Id " + newDepartment.getId());

        System.out.println("\n=== TEST 4: department update ===");
        Department dep = departmentDao.findById(9);
        dep.setName("Sports");
        departmentDao.update(dep);
        System.out.println("Updated!");

        System.out.println("\n=== TEST 5: department delete ===");
        try {
            departmentDao.deleteById(1);
            System.out.println("Deleted!");
        }
        catch (DbIntegrityException e) {
            System.out.println("Delete failed! Integrity violation: " + e.getMessage());
        }
        finally {
            DB.closeConnection();
        }
    }
}