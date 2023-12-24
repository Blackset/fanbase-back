package com.project.fanbase.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AvatarDTO {
    private Long id;
    private String surname;
    private String name;
    private String description;
    private String image;
    private Long creatorId; // Assuming you want to transfer the creator's ID
    private Long artworkId;
}
