package com.cybin.userprj;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioBuilder {

    private UUID idUsuario;
    private String emailUsuario;
    private String nombreUsuario;

    public UsuarioBuilder(UUID uuid) {
        this.idUsuario = uuid;
    }

    public UsuarioBuilder identificadorRandom() {
        this.idUsuario = UUID.randomUUID();
        return this;
    }

    public UsuarioBuilder email(String mail) {
        this.emailUsuario = mail;
        return this;
    }

    public UsuarioBuilder nombre(String name) {
        this.nombreUsuario = name;
        return this;
    }

    public Usuario build() {
        return new Usuario(this);
    }
}
