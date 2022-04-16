package com.kanyelings.studentlograpi.business.mapper;


import com.kanyelings.studentlograpi.api.dto.LogrUserDto;
import com.kanyelings.studentlograpi.data.entity.LogrUser;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface LogrUserMapper {
	@Mappings({
			@Mapping(source = "userId", target = "userId"),
			@Mapping(source = "email", target = "email"),
			@Mapping(source = "password", target = "password")
	})
	LogrUserDto mapLogrUserToDto(LogrUser logruser);

	@Mappings({
			@Mapping(source = "userId", target = "userId"),
			@Mapping(source = "email", target = "email"),
			@Mapping(source = "password", target = "password"),
			@Mapping(target = "intern", ignore = true)
	})
	LogrUser mapDtoToLogrUser(LogrUserDto logruserDto);

}
