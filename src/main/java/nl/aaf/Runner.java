package nl.aaf;

import nl.aaf.domain.User;
import nl.aaf.domain.mappers.UserMapper;
import nl.aaf.domain.mappers.UserMapperImpl;
import nl.aaf.model.UserCommand;
import nl.androidappfactory.domain.Product;
import nl.androidappfactory.model.ShippingAddress;
import org.apache.commons.lang3.StringUtils;

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
