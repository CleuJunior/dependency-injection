package org.example.notification;

import org.example.entity.Cliente;

public class NotificadorEmail implements Notificador{

    @Override
    public void notificar(Cliente cliente, String msng) {
        System.out.printf("Notificando %s atraves do email %s: %s\n", cliente.getNome()
                , cliente.getEmail(), msng);
    }
}
