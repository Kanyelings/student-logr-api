package com.kanyelings.studentlograpi.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "term_school_info")
public class TermSchoolInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long schoolInfoId;

	@Column(name = "name", nullable = false, length = 64)
	private String name;

	@Column(name = "year", nullable = false, length = 4)
	private String year;

	@Column(name = "academic_year", nullable = false, length = 12)
	private String academicYear;

	@OneToOne(mappedBy = "termSchoolInfo", cascade = CascadeType.ALL, optional = false, orphanRemoval = true)
	private InternshipTerm internshipTerm;

}
