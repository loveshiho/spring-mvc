package com.akai.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String uname;
    private Integer uage;
    private String[] uhobby;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private List<Pet> pets;
}
