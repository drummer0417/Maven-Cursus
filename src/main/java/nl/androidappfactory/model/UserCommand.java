package nl.androidappfactory.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Builder

public class UserCommand {

    private String firstName;
    private String lastName;
    private String email;

}
