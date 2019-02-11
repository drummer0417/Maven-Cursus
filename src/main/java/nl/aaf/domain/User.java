package nl.aaf.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Builder
public class User {


    private String voornaam;
    private String achternaam;
    private String email;

}
