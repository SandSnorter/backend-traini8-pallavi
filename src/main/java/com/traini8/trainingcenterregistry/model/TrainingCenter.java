package com.traini8.trainingcenterregistry.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// import jakarta.validation.constraints.NotNull;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

public class TrainingCenter {
        
    @NotBlank(message = "Center Name is required")
    @Size(max = 40, message = "Center Name must be less than 40 characters")
    private String centerName;
    
    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Center Code must be exactly 12 alphanumeric characters")
    private String centerCode;

    @NotBlank(message = "Address is required")
    private Address address;
    
    private int studentCapacity;
    
    private List<String> coursesOffered;
    
    private long createdOn;
    
    @Email(message = "Invalid email format")
    private String contactEmail;
    
    @NotBlank
    @Pattern(regexp = "\\d{10}", message = "Invalid phone number")
    private String contactPhone;
    
    // Getters and Setters

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getStudentCapacity() {
        return studentCapacity;
    }

    public void setStudentCapacity(int studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    public List<String> getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(List<String> coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn() {
        this.createdOn = createdOn;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
}