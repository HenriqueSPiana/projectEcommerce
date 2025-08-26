package ecommerce.mapper.custom;


import ecommerce.data.dto.ItemDTO;
import ecommerce.model.Item;
import org.springframework.stereotype.Service;

@Service
public class ItemMapper {


    public ItemDTO convertToEntityToDTO(Item item){
        ItemDTO dto = new ItemDTO();
        dto.setId(item.getId());
        dto.setNome(item.getNome());
        dto.setValor(item.getValor());
        dto.setDescricao(item.getDescricao());
        return dto;
    }

    public Item convertToEntityToDTO(ItemDTO dto){
        Item entity = new Item();
        entity.setId(dto.getId());
        entity.setNome(dto.getNome());
        entity.setValor(dto.getValor());
        entity.setDescricao(dto.getDescricao());
        return entity;
    }





}
