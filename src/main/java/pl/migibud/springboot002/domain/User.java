package pl.migibud.springboot002.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;
	private String surname;
	private String email;
	private String city;

	public User(String name, String surname, String email, String city) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.city = city;
	}
}



