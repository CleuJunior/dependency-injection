package org.example.notification;

import org.example.entity.Cliente;

public interface Notificador {

    void notificar(Cliente cliente, String msng);

}
