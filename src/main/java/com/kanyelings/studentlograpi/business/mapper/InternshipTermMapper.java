package com.kanyelings.studentlograpi.business.mapper;

import com.kanyelings.studentlograpi.api.dto.InternshipTermDto;
import com.kanyelings.studentlograpi.data.entity.InternshipTerm;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface InternshipTermMapper {

	InternshipTermDto mapInternshipTermToDto(InternshipTerm internshipterm);

	InternshipTerm mapDtoToInternshipTerm(InternshipTermDto internshiptermDto);

}
