package ie.atu.labexam;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;


import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Pattern(regexp = "EMP-XXXX")
    @NotBlank(message = "Employee Code cannot be blank")
    private String employeeCode;

    @Size(max =100, message = "Name cannot be greater than 100 characters")
    @NotBlank(message = "Name cannot be blank")
    private String name;

    @Email(message = "Must be valid email")
    @NotBlank(message = "Email cannot be blank")
    private String email;

    @NotBlank(message = "Position cannot be blank")
    private String position;

    @Min(value = 1, message = "Salary must be positive")
    private int salary;


    private String dateOfJoining;

}
