package ch.demo.service;

import ch.demo.dto.EmployeeRequest;
import ch.demo.dto.EmployeeResponse;
import ch.demo.model.EmployeeDTO;
import ch.demo.ports.api.EmployeeServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeFacade {

    private final EmployeeServicePort employeeServicePort;

    @Autowired
    public EmployeeFacade(EmployeeServicePort employeeServicePort) {
        this.employeeServicePort = employeeServicePort;
    }

    public EmployeeResponse create(EmployeeRequest employeeRequest){
        EmployeeDTO employeeDTO = employeeServicePort.create(employeeRequest.getFirstName(), employeeRequest.getLastName());
        EmployeeResponse employeeResponse = new EmployeeResponse(employeeDTO.getId(),employeeDTO.getFirstName(), employeeDTO.getLastName(), employeeDTO.getVersion());
        return  employeeResponse;
    }

    public EmployeeResponse get(Integer id){
        EmployeeDTO employeeDTO = employeeServicePort.get(id);
        EmployeeResponse employeeResponse = new EmployeeResponse(employeeDTO.getId(),employeeDTO.getFirstName(), employeeDTO.getLastName(), employeeDTO.getVersion());
        return employeeResponse;
    }


}
