package ecommerce.unitetests.mapper;



import static ecommerce.mapper.ObjectMapper.parseListObjects;
import static ecommerce.mapper.ObjectMapper.parseObject;

import ecommerce.data.dto.ItemDTO;
import ecommerce.unitetests.mapper.mocks.MockItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ObjectMapperTests {

    MockItem inputObjects;


    @BeforeEach
    public void setup(){inputObjects = new MockItem();}


    @Test
    public void parseEntityToDTOTest(){
        ItemDTO output = parseObject(inputObjects.);
    }



}
