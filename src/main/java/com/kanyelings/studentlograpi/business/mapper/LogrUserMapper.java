package com.kanyelings.studentlograpi.business.mapper;


import com.kanyelings.studentlograpi.api.dto.LogrUserDto;
import com.kanyelings.studentlograpi.data.entity.LogrUser;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface LogrUserMapper {

	LogrUserDto mapLogrUserToDto(LogrUser logruser);

	LogrUser mapDtoToLogrUser(LogrUserDto logruserDto);

}
