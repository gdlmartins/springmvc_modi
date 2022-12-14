package br.com.web.fullstackwmariadb.mvc.mudi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.web.fullstackwmariadb.mvc.mudi.dto.NewPedido;
import br.com.web.fullstackwmariadb.mvc.mudi.model.Pedido;

@Controller
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("formulario")
    public String formulario(NewPedido newPedid) {
        return "pedido/formulario";
    }

    @PostMapping("novo")
    public String novo(@Valid NewPedido newPedido, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println("voltou");
            return "pedido/formulario";
        }

        Pedido pedido = newPedido.toPedido();

        pedidoRepository.save(pedido);

        return "pedido/formulario";

    }

}
