package br.com.fiap.mypass.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "password")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Password {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String url;
    String username;
    String password;
}
