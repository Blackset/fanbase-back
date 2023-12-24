package com.project.fanbase.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserCardDTO {
    private Long id;
    private String surname;
    private String name;
    private String email;
    private Long userAuthorityId;
}
