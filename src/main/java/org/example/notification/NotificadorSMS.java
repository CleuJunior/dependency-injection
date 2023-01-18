package org.example.notification;

import org.example.entity.Cliente;

public class NotificadorSMS implements Notificador{

    @Override
    public void notificar(Cliente cliente, String msng) {
        System.out.printf("Notificando %s atraves do SMS %s: %s\n", cliente.getNome()
                , cliente.getEmail(), msng);
    }
}
