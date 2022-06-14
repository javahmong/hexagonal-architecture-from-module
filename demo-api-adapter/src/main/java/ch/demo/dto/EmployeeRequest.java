package ch.demo.dto;

import ch.demo.model.EmployeeDTO;

public class EmployeeRequest {
    private Integer id;
    private String firstName;
    private String lastName;

    public EmployeeRequest() {
    }

    public EmployeeDTO employee(){
        EmployeeDTO employeeDTO = new EmployeeDTO(this.id, this.firstName, this.lastName, 0);
        return employeeDTO;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
