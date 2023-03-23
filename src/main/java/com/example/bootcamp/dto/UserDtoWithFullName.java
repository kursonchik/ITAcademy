package com.example.bootcamp.dto;

import com.example.bootcamp.model.entity.Roles;
import com.google.gson.annotations.SerializedName;
import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Set;

/**
 * @author : Volha Salash
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDtoWithFullName implements Serializable {

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]")
    @Length(max = 40)
    @SerializedName("Last name")
    private String lastName;


    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]")
    @Length(max = 20)
    @SerializedName("First name")
    private String firstName;


    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]")
    @Length(max = 40)
    @SerializedName("Patronymic")
    private String patronymic;


    @NotBlank
    @Pattern(regexp = "^[A-Za-z][a-z.-_]+@[A-Za-z0-9.-]+[.][A-Za-z]")
    @Length(max = 50)
    @Email
    private String email;

    @NotNull
    @Size(min = 1)
    private Set<Roles> roles;
}
