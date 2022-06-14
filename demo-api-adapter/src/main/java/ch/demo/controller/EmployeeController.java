package ch.demo.controller;

import ch.demo.dto.EmployeeRequest;
import ch.demo.dto.EmployeeResponse;
import ch.demo.service.EmployeeFacade;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    private final EmployeeFacade employeeFacade;

    public EmployeeController(EmployeeFacade employeeFacade) {
        this.employeeFacade = employeeFacade;
    }


    @GetMapping("{employeeId}")
    EmployeeResponse get(@PathVariable("employeeId") final Integer employeeId){
        return employeeFacade.get(employeeId);
    }

    @PostMapping
    EmployeeResponse create(@RequestBody final EmployeeRequest employeeRequest){
        return employeeFacade.create(employeeRequest);
    }
}
