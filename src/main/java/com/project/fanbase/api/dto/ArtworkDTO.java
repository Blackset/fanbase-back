package com.project.fanbase.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ArtworkDTO {
    private Long id;
    private String title;
    private String type;
    private String category;

}

