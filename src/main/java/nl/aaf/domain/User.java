package nl.aaf.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Builder
public class User {


    private String firstName;
    private String lastName;
    private String email;

}
