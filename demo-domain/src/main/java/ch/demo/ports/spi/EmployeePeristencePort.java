package ch.demo.ports.spi;

import ch.demo.model.EmployeeDTO;

public interface EmployeePeristencePort {
    EmployeeDTO save(final EmployeeDTO employeeDTO);
    EmployeeDTO get(Integer id);
}
