package ie.atu.labexam;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.DecimalFormat;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Max(value = 100, message = "Code cant be greater than 100 characters ")
    private String employeeCode;

    @Max(value=100, message = "Name cannot be greater than 100 characters")
    private String name;

    @Email(message = "Must be valid email")
    private String email;

    @Max(value = 100, message = "Code cant be greater than 100 characters ")
    private String position;

    @Min(value = 1, message = "Salary must be positive")
    private int salary;

    @Max(value = 100, message = "Code cant be greater than 100 characters ")
    private String dateOfJoining;

}
