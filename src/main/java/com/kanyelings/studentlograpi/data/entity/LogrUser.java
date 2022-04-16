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
@Table(name = "logr_user")
public class LogrUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long logruserId;

	@Column(name = "email", nullable = false, unique = true, length = 32)
	private String email;

	@Column(name = "password", nullable = false)
	private String password;

}
