package com.kanyelings.studentlograpi.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "logbook_day_record")
public class LogBookDayRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long recordId;

	@Column(name = "date", nullable = false)
	private Date date;

	@Column(name = "activity")
	private String activity;

	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "log_book_logbook_id", nullable = false)
	private LogBook logBook;

}
