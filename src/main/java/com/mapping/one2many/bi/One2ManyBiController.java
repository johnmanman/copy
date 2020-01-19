package com.mapping.one2many.bi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/requestedmapping")

public class One2ManyBiController {
	@Autowired 
	One2ManyBiRepo one2ManyBiRepo;
	
	@PostMapping("/posting")
	public AuthorBi posting(@RequestBody AuthorBi a){
		
		AuthorBi author = new AuthorBi(); 
		author.setAname(a.getAname());
		author.setAcity(a.getAcity());
//		author.setBooklist(a.getBooklist());
		
		BookBi bookbi1 = new BookBi();
		
		bookbi1.setBname(bookbi1.getBname());
		bookbi1.setBtype(bookbi1.getBtype());
		bookbi1.setBid(bookbi1.getBid());
		
		
//		bookbi1.setBname(a.getBooklist().iterator().next().getBname());
//		bookbi1.setBtype(a.getBooklist().iterator().next().getBtype());
//		bookbi1.setBid(a.getBooklist().iterator().next().getBid());
//		bookbi1.setAuthor(author);
		
		BookBi bookbi2 = new BookBi();
		
		
		bookbi2.setBname(bookbi2.getBname());
		bookbi2.setBtype(bookbi2.getBtype());
		bookbi2.setBid(bookbi2.getBid());
		
//		bookbi2.setBname(a.getBooklist().iterator().next().getBname());
//		bookbi2.setBtype(a.getBooklist().iterator().next().getBtype());
//		bookbi2.setBid(a.getBooklist().iterator().next().getBid());
//		bookbi2.setAuthor(author);
		
		
		
		BookBi bookbi3 = new BookBi();
		
		bookbi3.setBname(bookbi3.getBname());
		bookbi3.setBtype(bookbi3.getBtype());
		bookbi3.setBid(bookbi3.getBid());
		
//		bookbi3.setBname(a.getBooklist().iterator().next().getBname());
//		bookbi3.setBtype(a.getBooklist().iterator().next().getBtype());
//		bookbi3.setBid(a.getBooklist().iterator().next().getBid());
//		bookbi3.setAuthor(author);
		
		
		
		
		bookbi1.setAuthor(author); 
		bookbi2.setAuthor(author);
		bookbi3.setAuthor(author);
		
		
		List<BookBi> booklist = new ArrayList<>();
		booklist.add(bookbi1);
		booklist.add(bookbi2);
		booklist.add(bookbi3);
		
		author.setBooklist(booklist);
		
		AuthorBi auth = this.one2ManyBiRepo.save(author);
		return auth;
		
	}

}
