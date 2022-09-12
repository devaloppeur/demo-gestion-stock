package com.skysoft.gestionstock.exception;

import lombok.Getter;

import java.util.List;

// Là c'est une exception qui sera principalement levée lorsqu'on essai par exemple d'enregistrer quelques choses dans la base de données et lorsqu'on passe par la validation, cette entité n'est pas valide
public class InvalidEntityException extends RuntimeException{

    @Getter
    // On définie d'abord un code erreur
    private ErrorCodes errorCodes;
    @Getter
    // On définie une liste de String qui sera des erreurs
    private List<String> errors;

    public InvalidEntityException(String message) {
        super(message);
    }

    public InvalidEntityException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidEntityException(String message, ErrorCodes errorCodes) {
        super(message);
        this.errorCodes = errorCodes;
    }

    public InvalidEntityException(String message, Throwable cause, ErrorCodes errorCodes) {
        super(message, cause);
        this.errorCodes = errorCodes;
    }

    public InvalidEntityException(String message, ErrorCodes errorCodes, List<String> errors) {
        super(message);
        this.errorCodes = errorCodes;
        this.errors = errors;
    }
}
