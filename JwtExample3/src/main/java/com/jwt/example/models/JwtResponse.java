package com.jwt.example.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
public class JwtResponse {
    private String jwtToken;
    private String username;
}
