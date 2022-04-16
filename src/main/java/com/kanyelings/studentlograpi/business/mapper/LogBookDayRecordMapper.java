package com.kanyelings.studentlograpi.business.mapper;


import com.kanyelings.studentlograpi.api.dto.LogBookDayRecordDto;
import com.kanyelings.studentlograpi.data.entity.LogBookDayRecord;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface LogBookDayRecordMapper {

	LogBookDayRecordDto mapLogBookDayRecordToDto(LogBookDayRecord logbookdayrecord);

	LogBookDayRecord mapDtoToLogBookDayRecord(LogBookDayRecordDto logbookdayrecordDto);

}
