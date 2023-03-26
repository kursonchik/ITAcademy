package com.example.bootcamp.dto;

import com.example.bootcamp.model.entity.Roles;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Set;

/**
 * @author : Volha Salash
 */


@AllArgsConstructor
@Getter
@Setter
public class UserResponseDto implements Serializable {

    @SerializedName("Full name")
    private String fullName;

    @SerializedName("Email")
    private String email;

    @SerializedName("Role")
    @Transient
    private Set<Roles> roles;

    public UserResponseDto() {
    }
}
