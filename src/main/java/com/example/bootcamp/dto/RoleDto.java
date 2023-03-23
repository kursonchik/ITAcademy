package com.example.bootcamp.dto;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

/**
 * @author : Volha Salash
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleDto implements Serializable {

    @SerializedName("Role name")
    private String name;

    private Set<UserDtoWithFullName> users;

}
