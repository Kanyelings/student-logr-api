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
@Table(name = "term_intern_info")
public class TermInternInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long internInfoId;

	@Column(name = "name", nullable = false, length = 64)
	private String name;

	@Column(name = "reg_no", nullable = false, length = 16)
	private String regNo;

	@Column(name = "level", nullable = false, length = 4)
	private String level;

	@OneToOne(mappedBy = "termInternInfo", cascade = CascadeType.ALL, optional = false, orphanRemoval = true)
	private InternshipTerm internshipTerm;

}
