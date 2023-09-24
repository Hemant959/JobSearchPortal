package com.Hemant.SearchJob.repo;

import com.Hemant.SearchJob.model.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepo extends CrudRepository<Job,Long> {
    List<Job> findAll();
}
