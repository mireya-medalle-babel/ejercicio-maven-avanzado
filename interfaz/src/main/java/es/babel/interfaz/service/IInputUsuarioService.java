package es.babel.interfaz.service;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public interface IInputUsuarioService {
    int operacionEscogida(Scanner sc);
    int introducirNumero(Scanner sc);
}
