package com.murilo.sistema_usuarios.exception;

public class EmailAlreadyExistsException extends RuntimeException {
    public EmailAlreadyExistsException(String email) {
        super("Email" + email + " já cadastrado");
    }
}
