package ch.demo.ports.api;

import ch.demo.model.EmployeeDTO;

public interface EmployeeServicePort {
    EmployeeDTO create(final String firstName, final String lastName);
    EmployeeDTO get(final Integer id);
}
