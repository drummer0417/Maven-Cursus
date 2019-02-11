package nl.aaf.domain.mappers;

import nl.aaf.domain.User;
import nl.aaf.model.UserCommand;
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
