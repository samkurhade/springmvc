package productcrudapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import productcrudapp.model.Product;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	// create product
	@Transactional
	public void createProduct(Product product) {

		this.hibernateTemplate.saveOrUpdate(product);

	}

	// get all product
	public List<Product> getAllProduct() {
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
	}

	// get the single product
	public Product getSingleProduct(int pid) {
		Product product = this.hibernateTemplate.get(Product.class, pid);
		return product;
	}

	// delete product
	@Transactional
	public void deleteProduct(int pid) {
		Product product = this.hibernateTemplate.get(Product.class, pid);
		this.hibernateTemplate.delete(product);
	}

}
