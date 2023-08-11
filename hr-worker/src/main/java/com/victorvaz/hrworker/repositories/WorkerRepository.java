package com.victorvaz.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorvaz.hrworker.entitties.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
