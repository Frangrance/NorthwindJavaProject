package kutaykeles.northwind.business.abstracts;

import java.util.List;

import kutaykeles.northwind.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
}
