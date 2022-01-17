package br.com.claitonp.kafka.model;

import java.time.LocalDateTime;
import java.util.Objects;

public record Login(String login, LocalDateTime dh) {

	public Login {
		Objects.requireNonNull(login);
	}
}
