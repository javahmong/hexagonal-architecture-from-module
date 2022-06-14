package ch.demo.model;

public class EmployeeDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer version;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public EmployeeDTO(Integer id, String firstName, String lastName, Integer version) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.version = version;
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

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }


}
