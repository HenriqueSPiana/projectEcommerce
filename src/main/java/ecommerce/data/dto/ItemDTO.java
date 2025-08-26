package ecommerce.data.dto;

import java.util.Objects;

public class ItemDTO {
    private static final long serialVersionUID =1L;

    long id;
    String nome;
    float valor;
    String descricao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ItemDTO itemDTO = (ItemDTO) o;
        return getId() == itemDTO.getId() && Float.compare(getValor(), itemDTO.getValor()) == 0 && Objects.equals(getNome(), itemDTO.getNome()) && Objects.equals(getDescricao(), itemDTO.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getValor(), getDescricao());
    }
}
