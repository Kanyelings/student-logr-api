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
@Table(name = "internship_term")
public class InternshipTerm {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long termId;

	@Column(name = "name", nullable = false, length = 32)
	private String name;

	@Column(name = "start_date", nullable = false)
	private Date startDate;

	@Column(name = "stop_date", nullable = false)
	private Date stopDate;

}
