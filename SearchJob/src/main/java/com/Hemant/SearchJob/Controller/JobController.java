package com.Hemant.SearchJob.Controller;

import com.Hemant.SearchJob.Service.JobService;
import com.Hemant.SearchJob.model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    JobService jobService;
    @PostMapping("post")
    public String AddAllUser(@RequestBody List<Job> newJob){
        return jobService.AddAllUser(newJob);
    }

    @GetMapping("get")
    public List<Job> GetAllUser(){
        return jobService.GetAllUser();
    }

    @PutMapping("companyName/id/{id}")
    public String company(@PathVariable Long id, @RequestParam String companyName){
        return jobService.update(id,companyName);
    }

    @DeleteMapping("delete/id/{id}")
    public String delete(@PathVariable Long id){
        return jobService.delete(id);
    }
}
