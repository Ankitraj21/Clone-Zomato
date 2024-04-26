package com.clone.zomato.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserInfo {
    @Id
    private String userId;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    }
