package br.com.consumer.entity;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private int id;
    private String nome;
    private int idade;
}
