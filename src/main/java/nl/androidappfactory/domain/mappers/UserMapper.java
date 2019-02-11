package nl.androidappfactory.domain.mappers;

import nl.androidappfactory.domain.User;
import nl.androidappfactory.model.UserCommand;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {


    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "voornaam", target = "firstName")
    @Mapping(source = "achternaam", target = "lastName")
    UserCommand user2userCommand(User user);

    @Mapping(source = "firstName", target = "voornaam")
    @Mapping(source = "lastName", target = "achternaam")
    User userCommand2User(UserCommand userCommand);

}
