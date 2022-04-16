package com.kanyelings.studentlograpi.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "logbook")
public class LogBook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long logbookId;

	@Column(name = "intern_remarks")
	private String internRemarks;

	@Column(name = "week_number", nullable = false)
	private Integer weekNumber;

	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "internship_term_id", nullable = false)
	private InternshipTerm internshipTerm;

	@OneToMany(mappedBy = "logBook", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<LogBookDayRecord> logBookDayRecords = new ArrayList<>();

}
