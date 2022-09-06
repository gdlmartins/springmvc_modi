package br.com.web.fullstackwmariadb.mvc.mudi.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.web.fullstackwmariadb.mvc.mudi.model.Pedido;

@Controller
public class ControllerHome {

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping("/home")
    public String home(Model model) {

        TypedQuery<Pedido> query = entityManager.createQuery("select p from Pedido p", Pedido.class);
        List<Pedido> pedidos = query.getResultList();
        System.out.println(pedidos);
        model.addAttribute("pedidos", pedidos);

        return "home";

    }

}
