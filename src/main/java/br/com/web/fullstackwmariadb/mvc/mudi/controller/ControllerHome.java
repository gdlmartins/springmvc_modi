package br.com.web.fullstackwmariadb.mvc.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.web.fullstackwmariadb.mvc.mudi.model.Pedido;
import br.com.web.fullstackwmariadb.mvc.mudi.model.StatusPedido;

@Controller
@RequestMapping("/home")
public class ControllerHome {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    public String home(Model model) {

        List<Pedido> pedidos = pedidoRepository.findAll();
        System.out.println(pedidos);
        model.addAttribute("pedidos", pedidos);

        return "home";

    }

    @GetMapping("/{status}")
    public String statusMeth(@PathVariable("status") String status, Model model) {
        List<Pedido> pedidos = pedidoRepository.findByStatus(StatusPedido.valueOf(status.toUpperCase()));
        model.addAttribute("pedidos", pedidos);
        return "home";
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String onError() {
        return "redirect:/home";
    }

}
