package com.kanyelings.studentlograpi.business.mapper;


import com.kanyelings.studentlograpi.api.dto.LogBookDto;
import com.kanyelings.studentlograpi.data.entity.LogBook;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface LogBookMapper {

	LogBookDto mapLogBookToDto(LogBook logbook);

	LogBook mapDtoToLogBook(LogBookDto logbookDto);

}
