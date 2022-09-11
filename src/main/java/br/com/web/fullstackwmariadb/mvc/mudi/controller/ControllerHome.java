package br.com.web.fullstackwmariadb.mvc.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.web.fullstackwmariadb.mvc.mudi.model.Pedido;

@Controller
public class ControllerHome {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("/home")
    public String home(Model model) {

        List<Pedido> pedidos = pedidoRepository.findAll();
        System.out.println(pedidos);
        model.addAttribute("pedidos", pedidos);

        return "home";

    }

}
