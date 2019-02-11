package nl.androidappfactory;

import nl.androidappfactory.domain.User;
import nl.androidappfactory.domain.mappers.UserMapper;
import nl.androidappfactory.domain.mappers.UserMapperImpl;
import nl.androidappfactory.model.UserCommand;

public class Runner {

    public static void main(String[] args) {

        User user = new User("Hans", "van Meurs", "abc@hier.nl");
        User user2 = new User();
        user2.setVoornaam("Hans");
        User user3 = User.builder().voornaam("hans").achternaam("van Meurs").build();

        System.out.println("User: " + user);
        System.out.println("User2: " + user2);
        System.out.println("User3: " + user3);

        UserMapper mapper = new UserMapperImpl();

        UserCommand uc = mapper.user2userCommand(user);
        System.out.println("uc: " + uc);
        uc.setEmail("xyz@234.nl");
        User user4 = mapper.userCommand2User(uc);
        System.out.println("user4: " + user4);

    }
}
