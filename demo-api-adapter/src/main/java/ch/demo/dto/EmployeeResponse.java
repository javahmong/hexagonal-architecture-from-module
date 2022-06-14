package ch.demo.dto;

public class EmployeeResponse {

    private Integer id;
    private String firstName;
    private String lastName;
    private Integer version;

    public EmployeeResponse() {
    }

    public EmployeeResponse(Integer id, String firstName, String lastName, Integer version) {
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
