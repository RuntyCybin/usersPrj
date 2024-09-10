CREATE SCHEMA userprj;

CREATE TABLE userprj.USERS (
    id UUID,
    email varchar(255),
    nombreUsuario varchar(255),
    CONSTRAINT pk_users PRIMARY KEY (id)
);

CREATE UNIQUE INDEX unique_users_email ON userprj.USERS (email);
CREATE UNIQUE INDEX unique_users_nombreUsuario ON userprj.USERS (nombreUsuario);