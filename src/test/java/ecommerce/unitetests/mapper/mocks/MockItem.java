package ecommerce.unitetests.mapper.mocks;

import ecommerce.data.dto.ItemDTO;
import ecommerce.model.Item;

import java.util.ArrayList;
import java.util.List;

public class MockItem {


    public Item mockEntity(){
        return mockEntity(0);
    }

    public ItemDTO mockDTO(){
        return mockDTO(0);
    }


    public List<Item> mockEntityList() {
        List<Item> item = new ArrayList<Item>();
        for (int i = 0; i < 14; i++) {
            item.add(mockEntity(i));
        }
        return item;
    }

    public List<ItemDTO> mockDTOList() {
        List<ItemDTO> dto = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            dto.add(mockDTO(i));
        }
        return dto;
    }


    public Item mockEntity(Integer number){
        Item item = new Item();
        item.setId(number.longValue());
        item.setDescricao("Panela de cozinha para sua cozinha");
        item.setNome("Panela");
        item.setValor(10.99f);
        return item;
    }


    public ItemDTO mockDTO(Integer number){
        ItemDTO dto = new ItemDTO();
        dto.setId(number.longValue());
        dto.setDescricao("Panela de cozinha para sua cozinha");
        dto.setNome("Panela");
        dto.setValor(10.99f);
        return dto;
    }

}
