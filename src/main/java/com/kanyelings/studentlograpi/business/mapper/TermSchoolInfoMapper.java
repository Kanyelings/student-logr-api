package com.kanyelings.studentlograpi.business.mapper;


import com.kanyelings.studentlograpi.api.dto.TermSchoolInfoDto;
import com.kanyelings.studentlograpi.data.entity.TermSchoolInfo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface TermSchoolInfoMapper {

	TermSchoolInfoDto mapTermSchoolInfoToDto(TermSchoolInfo termschoolinfo);

	TermSchoolInfo mapDtoToTermSchoolInfo(TermSchoolInfoDto termschoolinfoDto);

}
