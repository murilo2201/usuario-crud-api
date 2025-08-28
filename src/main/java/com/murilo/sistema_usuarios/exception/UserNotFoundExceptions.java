package com.murilo.sistema_usuarios.exception;

public class UserNotFoundExceptions extends RuntimeException {
    public UserNotFoundExceptions(Long id) {
        super("Usuário não encontrado com id: " + id);
    }
}
