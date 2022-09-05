package br.com.web.fullstackwmariadb.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.web.fullstackwmariadb.mvc.mudi.model.Pedido;

@Controller
public class ControllerHome {

    @GetMapping("/home")
    public String home(Model model) {

        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Lekebaby Nappy Bag");
        pedido.setValorNegociado(43.98);
        pedido.setUrlImage("https://m.media-amazon.com/images/I/61fr-HGo3DL._AC_SX679_.jpg");
        pedido.setUrlProduto(
                "https://www.amazon.com.au/Lekebaby-Nappy-Backpack-Diaper-Changing/dp/B08CRHZQB6/?_encoding=UTF8&pd_rd_w=3Sbmq&content-id=amzn1.sym.3a84452d-4836-4b58-a639-43fdeca1bac3&pf_rd_p=3a84452d-4836-4b58-a639-43fdeca1bac3&pf_rd_r=CGWT1THN9Z4THSNG4STC&pd_rd_wg=okiRr&pd_rd_r=6c42016c-9d34-4619-a82b-ee2be5213e5a&ref_=pd_gw_ci_mcx_mr_hp_atf_m");
        pedido.setDescricao("Bolsa para guardar mamadeiras");

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);

        return "home";

    }

}
