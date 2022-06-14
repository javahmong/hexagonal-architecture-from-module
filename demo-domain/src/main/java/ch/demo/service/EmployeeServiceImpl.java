package ch.demo.service;

import ch.demo.model.EmployeeDTO;
import ch.demo.ports.api.EmployeeServicePort;
import ch.demo.ports.spi.EmployeePeristencePort;

import java.util.NoSuchElementException;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeServicePort {

    private final EmployeePeristencePort employeePeristencePort;

    public EmployeeServiceImpl(EmployeePeristencePort employeePeristencePort) {
        this.employeePeristencePort = employeePeristencePort;
    }

    @Override
    public EmployeeDTO create(String firstName, String lastName) {
        EmployeeDTO newVersion = new EmployeeDTO(firstName, lastName);
        employeePeristencePort.save(newVersion);
        return newVersion;
    }

    @Override
    public EmployeeDTO get(Integer id) {
        EmployeeDTO employeeDTO = null;
        try{
            employeeDTO = Optional.ofNullable(employeePeristencePort.get(id)).get();
        }catch(NoSuchElementException nse){
            employeeDTO = new EmployeeDTO();
        }finally {
            return employeeDTO;
        }
    }
}
