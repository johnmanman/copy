package com.mapping.one2one.bi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
@RequestMapping ("/BiController")
public class BiController {
	
	@Autowired 
	BiDirectionalOneToOneRepository birepository;
	
	@PostMapping("/postIt")
	public CustomerBi postIt(@RequestBody ProductBi p) {
		
		System.out.println(p.getPname());
			
			ProductBi product = new ProductBi();
			product.setPid(p.getPid());
			product.setPname(p.getPname());
			product.setDis(p.getDis());
			
			CustomerBi customer = new CustomerBi();
			customer.setCname(p.getCustomer().getCname());
			customer.setCid(p.getCustomer().getCid());
			customer.setSal(p.getCustomer().getSal());
				
			product.setCustomer(customer);
			customer.setProduct(product); 
			
			CustomerBi customerBi = this.birepository.save(customer);
			
			return customerBi;
		
//		CustomerBi customer = p.getCustomer();
//		customer.setProduct(p);
//		p.getCustomer().setProduct(p); 
//		this.birepository.save(customer);
//		return customer;
	}
	
	@PostMapping("/postItio")
	public ProductBi postItio(@RequestBody ProductBi p) {
		
		CustomerBi customer = p.getCustomer();
		customer.setProduct(p);
		p.getCustomer().setProduct(p); 
		this.birepository.save(customer);
		return p;
	}
	@PostMapping("/postItiodd")
	public ProductBi postItiodd(@RequestBody ProductBi p) {
		p.getCustomer().setProduct(p);
		this.birepository.save(p.getCustomer());
		return p;
	}
	
	@GetMapping("/getItAll")
	public List<CustomerBi> getItAll() {
		
		ProductBi p = new ProductBi();
		p.getCustomer().getProduct().getCustomer();
		
		List<CustomerBi> prod = this.birepository.findAll();
		return prod;
	}
}
