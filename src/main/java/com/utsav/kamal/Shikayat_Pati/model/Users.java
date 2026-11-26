package com.utsav.kamal.Shikayat_Pati.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Users {

    private Long userId;
    private String name;
    private String email;

    private String password;
    private List<String> roles;
}
