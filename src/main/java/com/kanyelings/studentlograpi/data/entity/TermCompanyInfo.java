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
@Table(name = "term_company_info")
public class TermCompanyInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long companyId;

	@Column(name = "name", nullable = false, length = 32)
	private String name;

	@Column(name = "address", nullable = false, length = 128)
	private String address;

	@Column(name = "phone", nullable = false, length = 16)
	private String phone;

	@Column(name = "department", nullable = false, length = 32)
	private String department;

	@Column(name = "email", nullable = false, length = 32)
	private String email;

	@Column(name = "supervisor", nullable = false, length = 64)
	private String supervisor;

}
