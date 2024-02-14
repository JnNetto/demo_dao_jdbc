package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Seller dep = new Seller(1, "Book", "fds", new Date(), 12.0);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(dep);
	}

}
