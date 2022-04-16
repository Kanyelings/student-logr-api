package com.kanyelings.studentlograpi.business.mapper;


import com.kanyelings.studentlograpi.api.dto.TermInternInfoDto;
import com.kanyelings.studentlograpi.data.entity.TermInternInfo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface TermInternInfoMapper {

	TermInternInfoDto mapTermInternInfoToDto(TermInternInfo terminterninfo);

	TermInternInfo mapDtoToTermInternInfo(TermInternInfoDto terminterninfoDto);

}
