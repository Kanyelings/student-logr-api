package com.kanyelings.studentlograpi.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "logbookdayrecord")
public class LogBookDayRecord {
	@Id
	 private Long logbookdayrecordId;
}
