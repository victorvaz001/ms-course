package com.victorvaz.hrworker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.victorvaz.hrworker.entitties.Worker;
import com.victorvaz.hrworker.repositories.WorkerRepository;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

	@Autowired
	private WorkerRepository reporsitory;

	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {
		List<Worker> list = reporsitory.findAll();

		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity <Worker> findById(@PathVariable Long id) {
		Worker obj = reporsitory.findById(id).get();

		return ResponseEntity.ok(obj);
	}
	
}
