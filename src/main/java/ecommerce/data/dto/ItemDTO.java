package ecommerce.data.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ItemDTO {

    long Id;
    String nome;
    float valor;
    String descricao;

}
