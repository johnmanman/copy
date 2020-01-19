package com.mapping.one2one.uni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/requested")
public class One2OneUniController {
	@Autowired
	One2OneUniService serving;
	
	@PostMapping("/postTest")
	public CustomerUni postTest(@RequestBody CustomerUni custom) {
		CustomerUni cust = this.serving.saveBody(custom);
		return cust;
		
	}

	//	@GetMapping("/getAll")
//	public ResponseEntity<List<ProductUni>> getAll() {
//		List<ProductUni> list = this.oneUniRepository.findAll();
//		return new ResponseEntity<List<ProductUni>>(list, new HttpHeaders(), HttpStatus.OK);
//	}
//	
//	@GetMapping("/getbyId/{id}")
//	public ProductUni getById(@PathVariable int id) {
//		ProductUni product = this.oneUniRepository.getOne(id);
//		return product;
//		
//	}
}
