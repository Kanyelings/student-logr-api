package com.kanyelings.studentlograpi.data.entity;


import com.kanyelings.studentlograpi.config.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

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

}
