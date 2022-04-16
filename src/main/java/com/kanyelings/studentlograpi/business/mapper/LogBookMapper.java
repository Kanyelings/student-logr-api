package com.kanyelings.studentlograpi.business.mapper;


@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface LogBookMapper {

	LogBookDto mapLogBookToDto(LogBook logbook);

	LogBook mapDtoToLogBook(LogBookDto logbookDto);

}
