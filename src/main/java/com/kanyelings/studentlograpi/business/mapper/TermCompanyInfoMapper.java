package com.kanyelings.studentlograpi.business.mapper;


import com.kanyelings.studentlograpi.api.dto.TermCompanyInfoDto;
import com.kanyelings.studentlograpi.data.entity.TermCompanyInfo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface TermCompanyInfoMapper {

	TermCompanyInfoDto mapTermCompanyInfoToDto(TermCompanyInfo termcompanyinfo);

	TermCompanyInfo mapDtoToTermCompanyInfo(TermCompanyInfoDto termcompanyinfoDto);

}
