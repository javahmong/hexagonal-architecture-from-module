package ch.demo.service;

import ch.demo.entity.Employee;
import ch.demo.model.EmployeeDTO;
import ch.demo.ports.spi.EmployeePeristencePort;
import ch.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class EmployeeJpaAdapter implements EmployeePeristencePort {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    @Transactional
    public EmployeeDTO save(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.toEntity(employeeDTO);
        Employee newEmployee = employeeRepository.save(employee);
        Employee temp = new Employee();
        return temp.toModel(newEmployee);
    }

    @Override
    public EmployeeDTO get(Integer id) {
        Employee employee = Optional.ofNullable(employeeRepository.findById(id)).get().get();
        Employee temp = new Employee();
        return temp.toModel(employee);
    }
}
