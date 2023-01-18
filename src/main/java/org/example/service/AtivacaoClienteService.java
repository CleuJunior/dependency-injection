package org.example.service;

import org.example.entity.Cliente;
import org.example.notification.Notificador;

public class AtivacaoClienteService {
    private final Notificador notificador;

    public AtivacaoClienteService(final Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();
        this.notificador.notificar(cliente, "seu cadadstro foi ativado!");
    }
}
