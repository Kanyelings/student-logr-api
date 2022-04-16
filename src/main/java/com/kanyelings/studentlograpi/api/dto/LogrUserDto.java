package com.kanyelings.studentlograpi.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class LogrUserDto {
    @JsonProperty("id")
    private Long userId;
    private String email;
    private String password;
}
