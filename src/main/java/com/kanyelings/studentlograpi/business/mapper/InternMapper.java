package com.kanyelings.studentlograpi.business.mapper;


import com.kanyelings.studentlograpi.api.dto.InternDto;
import com.kanyelings.studentlograpi.data.entity.Intern;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface InternMapper {

	InternDto mapInternToDto(Intern intern);

	Intern mapDtoToIntern(InternDto internDto);

}
