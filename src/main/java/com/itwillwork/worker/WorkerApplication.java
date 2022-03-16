package com.itwillwork.worker;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SpringBootApplication
public class WorkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkerApplication.class, args);
	}

}
/**
@RestController
class Controller{
	@GetMapping(path = "/hello/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String hello(@PathVariable String name){
		return "Hello "+name+"!";
	}
}

@Entity
class Book{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
}
@RepositoryRestResource
interface BookRepository extends JpaRepository<Book,Long>{

}
*/