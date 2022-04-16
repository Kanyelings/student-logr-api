package com.kanyelings.studentlograpi.data.entity;


import com.kanyelings.studentlograpi.config.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "intern")
public class Intern {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long internId;

	@Column(name = "name", nullable = false, length = 64)
	private String name;

	@Column(name = "dob")
	private Date dob;

	@Enumerated(EnumType.STRING)
	@Column(name = "gender")
	private Gender gender;

	@Column(name = "phone", length = 16)
	private String phone;

	/**
	 * One intern is associated with one or more internship terms
	 */
	@OneToMany(mappedBy = "intern", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<InternshipTerm> internshipTerms = new ArrayList<>();

	@OneToOne(cascade = CascadeType.ALL, optional = false, orphanRemoval = true)
	@JoinColumn(name = "logr_user_logruser_id", nullable = false)
	private LogrUser logrUser;

}
