package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("FindById test");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\nFindAll test");
		List<Department> listAll = departmentDao.findAll();
		listAll.forEach(System.out::println);
		
		
		System.out.println("\nInsert test");
		Department newDepartment = new Department(null, "Animais");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId());
		
		
		
		System.out.println("\nupdate test");
		department = departmentDao.findById(4);
		department.setName("Books e Notebooks");
		departmentDao.update(department);
		System.out.println("Update completed!");
		
		
		System.out.println("\ndeleteById test");
		System.out.print("Enter Id for delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		
		sc.close();
	}

}
