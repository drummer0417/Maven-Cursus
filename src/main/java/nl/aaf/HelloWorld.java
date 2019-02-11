package nl.aaf;

import nl.aaf.domain.User;
import nl.androidappfactory.domain.Product;
import nl.androidappfactory.model.ShippingAddress;
import org.apache.commons.lang3.StringUtils;

public class HelloWorld {

    public static void main(String[] args) {

        Product p = new Product();
        ShippingAddress shippingAddress = new ShippingAddress();
        shippingAddress.setCountryName("dsfds");
        System.out.println(StringUtils.upperCase("hallo wereldbol"));

        User user = new User("Hans", "van Meurs", "abc@hier.nl");
        User user2 = new User();
        user2.setFirstName("Hans");
        User user3 = User.builder().firstName("hans").lastName("van Meurs").build();

        System.out.println("User: " + user);
        System.out.println("User2: " + user2);
        System.out.println("User3: " + user3);
    }
}
