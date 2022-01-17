package br.com.claitonp.kafka.model;

import java.time.LocalDateTime;
import java.util.Objects;

public record User(String id, String nome, LocalDateTime dh) {

	public User {
		Objects.requireNonNull(id);
		Objects.requireNonNull(nome);
	}
}

//@Getter
//@Setter
//@NoArgsConstructor
//@ToString
//@EqualsAndHashCode(of= {"id"})
//public class User implements Serializable {
//	
//	private static final long serialVersionUID = 1L;
//	
//	private String id;
//	private String nome;
//	private LocalDateTime dh;
//
//}
