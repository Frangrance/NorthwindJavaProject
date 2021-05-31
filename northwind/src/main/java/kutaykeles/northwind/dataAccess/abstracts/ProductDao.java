package kutaykeles.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kutaykeles.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer> {

}
