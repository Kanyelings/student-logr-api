package com.kanyelings.studentlograpi.data.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "logr_user")
public class LogrUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;

	@Column(name = "email", nullable = false, unique = true, length = 32)
	private String email;

	@Column(name = "password", nullable = false)
	private String password;

	@OneToOne(mappedBy = "logrUser", orphanRemoval = true)
	private Intern intern;

}
