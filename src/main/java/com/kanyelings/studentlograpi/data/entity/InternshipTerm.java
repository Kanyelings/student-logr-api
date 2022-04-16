package com.kanyelings.studentlograpi.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

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

	/**
	 * Many-to-one relationship with the intern entity
	 */
	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "intern_id", nullable = false)
	private Intern intern;

	/**
	 * One-to-one relationship with the term school info entity
	 */
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "term_school_info_school_info_id", nullable = false)
	private TermSchoolInfo termSchoolInfo;

	/**
	 * One-to-one relationship with the term intern info entity
	 */
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "term_intern_info_intern_info_id", nullable = false)
	private TermInternInfo termInternInfo;

	/**
	 * One-to-one relationship with the term company entity
	 */
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "term_company_info_company_id")
	private TermCompanyInfo termCompanyInfo;

	/**
	 * One-to-many relationship with the log book entity
	 */
	@OneToMany(mappedBy = "internshipTerm", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<LogBook> logBooks = new ArrayList<>();

}
