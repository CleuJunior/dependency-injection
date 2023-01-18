package org.example;

import org.example.entity.Cliente;
import org.example.notification.Notificador;
import org.example.notification.NotificadorSMS;
import org.example.service.AtivacaoClienteService;

public class Main {
    public static void main(String[] args) {
        Cliente junior = new Cliente("Junior", "xpto@gmail.com", "9999999");
        Cliente agatha = new Cliente("Agatha", "xyz@gmail.com", "9999999");

        Notificador notificador = new NotificadorSMS();

        AtivacaoClienteService ativar = new AtivacaoClienteService(notificador);

        ativar.ativar(junior);
        ativar.ativar(agatha);
    }
}