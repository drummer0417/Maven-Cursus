package nl.androidappfactory;

import nl.androidappfactory.domain.Product;
import nl.androidappfactory.domain.User;
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

        System.out.println("User: " + user);
        System.out.println("User2: " + user2);

    }
}
