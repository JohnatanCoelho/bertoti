package com.thehecklers.sburrestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class SburRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SburRestDemoApplication.class, args);
	}

}

@RestController
@RequestMapping("/creatines")
class RestApiDemoController {
	private List<Creatine> creatines = new ArrayList<>();

	public RestApiDemoController() {
		creatines.addAll(List.of(
				new Creatine("Creatina Renova"),
				new Creatine("Creatina Hardcore"),
				new Creatine("Creatina Growth"),
				new Creatine("Creatina Dark")
		));
	}

	@GetMapping
	Iterable<Creatine> getCreatine() {
		return creatines;
	}

	@GetMapping("/{id}")
	Optional<Creatine> getCoffeeById(@PathVariable String id) {
		for (Creatine c: creatines) {
			if (c.getId().equals(id)) {
				return Optional.of(c);
			}
		}

		return Optional.empty();
	}

	@PostMapping
	Creatine postCreatine(@RequestBody Creatine creatine) {
		creatines.add(creatine);
		return creatine;
	}

	@PutMapping("/{id}")
	ResponseEntity<Creatine> putCreatine(@PathVariable String id,
									 @RequestBody Creatine creatine) {
		int creatineIndex = -1;

		for (Creatine c: creatines) {
			if (c.getId().equals(id)) {
				creatineIndex = creatines.indexOf(c);
				creatines.set(creatineIndex, creatine);
			}
		}

		return (creatineIndex == -1) ?
				new ResponseEntity<>(postCreatine(creatine), HttpStatus.CREATED) :
				new ResponseEntity<>(creatine, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	void deleteCoffee(@PathVariable String id) {
		creatines.removeIf(c -> c.getId().equals(id));
	}
}

class Creatine {
	private final String id;
	private String name;

	public Creatine(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Creatine(String name) {
		this(UUID.randomUUID().toString(), name);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}