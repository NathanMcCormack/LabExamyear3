package ie.atu.labexam;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")

public class EmployeeController {

    private List<Employee> employeeList = new ArrayList<>();

    @GetMapping("/{employeeCode}")
    public List<Employee> getALlEmployees(@PathVariable String employeeCode){
        return employeeList;
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee newEmployee){
        employeeList.add(newEmployee);
        return newEmployee;
    }

    @PutMapping("/{employeeCode}")
    public ResponseEntity updateEmployee(@PathVariable @Valid String employeeCode, @RequestBody Employee updatedEmployee){
        for(Employee e : employeeList){
            if(e.getEmployeeCode() == employeeCode){
                employeeList.remove(e);
            }
        }
        employeeList.add(updatedEmployee);
        return  ResponseEntity.ok(employeeList);
    }

    @DeleteMapping("/{employeeCode}")
    public ResponseEntity <List> deleteEmployee(@PathVariable String employeeCode){
        for(Employee e : employeeList){
            if(e.getEmployeeCode().equals(employeeCode)){
                employeeList.remove(e);
            }
        }
        return ResponseEntity.ok(employeeList);
    }
}