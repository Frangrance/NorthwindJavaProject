package kutaykeles.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kutaykeles.northwind.business.abstracts.ProductService;
import kutaykeles.northwind.core.utilities.results.DataResult;
import kutaykeles.northwind.core.utilities.results.Result;
import kutaykeles.northwind.entities.concretes.Product;

@RestController
@RequestMapping("api/products")
public class ProductsController {
	
	private ProductService productService;
	
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")
	public DataResult<List<Product>> getAll(){
		return this.productService.getAll();	
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
	}
	
	@GetMapping("/getbyproductname")
	public DataResult<Product> getByProductName(@RequestParam String productName){
		return this.productService.getByProductName(productName);
	}
	
	@GetMapping("/getbyproductnameandcategory")
	public DataResult<Product> getByProductNameAndCategoryId(@RequestParam String productName, @RequestParam int categoryId){
		return this.productService.getByProductNameAndCategory_CategoryId(productName, categoryId);
	}
	@GetMapping("/getbyproductnamecontains")
	public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName){
		return this.productService.getByProductNameContains(productName);
	}
	
	@GetMapping("/getallbypage")
	DataResult<List<Product>> getAll(int pageNo, int pageSize){
		return this.productService.getAll(pageNo,pageSize);
	}
	@GetMapping("/getallDesc")
	public DataResult<List<Product>> getAllSorted(){
		return this.productService.getAllSorted();
	}
	
}
