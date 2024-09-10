package com.cybin.userprj;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {

    private UUID idUsuario;
    private String emailUsuario;
    private String nombreUsuario;

    public Usuario(UsuarioBuilder builder) {
        this.idUsuario = builder.getIdUsuario();
        this.emailUsuario = builder.getEmailUsuario();
        this.nombreUsuario = builder.getNombreUsuario();
    }
}
