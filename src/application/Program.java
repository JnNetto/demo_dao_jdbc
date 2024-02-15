package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
			
		System.out.println("FindById test");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\nFindByDepartment test");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(System.out::println);
		
		System.out.println("\nFindAll test");
		List<Seller> listAll = sellerDao.findAll();
		listAll.forEach(System.out::println);
		
		/*
		System.out.println("\nInsert test");
		Seller newSeller = new Seller(null, "João", "joao@gmail.com", new Date(), 5000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id: " + newSeller.getId());
		*/
		
		
	}

}
