package ecommerce.model;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;
@Entity
@Table(name = "item")
public class Item implements Serializable {

    private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "nome", nullable = false, length = (80))
    private String nome;

    @Column(name = "valor", nullable = false,length = (6))
    private float valor;

    @Column(name = "descricao", nullable = false, length = (200))
    private String descricao;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        Item item = (Item) o;
        return getId() == item.getId() && Float.compare(getValor(), item.getValor()) == 0 && Objects.equals(getNome(), item.getNome()) && Objects.equals(getDescricao(), item.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getValor(), getDescricao());
    }
}
