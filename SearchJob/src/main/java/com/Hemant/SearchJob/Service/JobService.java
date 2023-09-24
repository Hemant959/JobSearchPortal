package com.Hemant.SearchJob.Service;

import com.Hemant.SearchJob.model.Job;
import com.Hemant.SearchJob.repo.IJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service

public class JobService {
    @Autowired
    IJobRepo jobRepo;
    public String AddAllUser(List<Job> newJob) {
        for(Job j1:newJob){
            j1.setAppliedDate(LocalDate.now());
        }
        jobRepo.saveAll(newJob);
        return "Added";
    }


    public List<Job> GetAllUser() {
        return jobRepo.findAll();
    }

    public String update(Long id, String companyName) {
        Job preId=jobRepo.findById(id).orElse(null);
        if(preId!=null){
            preId.setCompanyName(companyName);
            jobRepo.save(preId);
            return"UserName updated Successfully";
        }
        return "User Name not found";
    }

    public String delete(Long id) {
        jobRepo.deleteById(id);
        return "User Id deleted Successfully";
    }
}
