package org.example.service;

import org.example.entity.Cliente;
import org.example.entity.Produto;
import org.example.notification.NotificadorEmail;

public class EmissaoNotaFiscalService {

    private void emitrir(Cliente cliente, Produto produto) {
        // TODO emite a nota fiscal...

        new NotificadorEmail().notificar(cliente, "Nota fiscal do produto " + produto.getNome() +
                "foi emitida!");
    }
}
