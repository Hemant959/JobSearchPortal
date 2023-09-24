package com.Hemant.SearchJob.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Job {
    @Id
    private Long id;

    @NotBlank(message = "Title is required")
    private String title;

    private String  description;
    private String location;
    @Min(value = 20000, message = "Salary should be above 20,000")
    private Double salary;
    private String CompanyEmail;
    private String CompanyName;
    private String EmployName;
    @NotNull(message = "Job type is required")
    private Type jobType;

    private LocalDate appliedDate;
}
