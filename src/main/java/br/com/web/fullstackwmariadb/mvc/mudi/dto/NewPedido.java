package br.com.web.fullstackwmariadb.mvc.mudi.dto;

import br.com.web.fullstackwmariadb.mvc.mudi.model.Pedido;

public class NewPedido {

    private String produto;
    private String urlProduto;
    private String urlImage;
    private String descricao;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Pedido toPedido() {
        Pedido pedido = new Pedido();
        pedido.setDescricao(descricao);
        pedido.setNomeProduto(produto);
        pedido.setUrlImage(urlImage);
        pedido.setUrlProduto(urlProduto);

        return new Pedido();
    }

}
