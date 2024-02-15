package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Department department = new Department(2, null);
		Seller seller = sellerDao.findById(3);
		
		List<Seller> list = sellerDao.findByDepartment(department);
		
		System.out.println("FindById test");
		System.out.println(seller);
		
		System.out.println("\nFindByDepartment test");
		list.forEach(System.out::println);
	}

}
