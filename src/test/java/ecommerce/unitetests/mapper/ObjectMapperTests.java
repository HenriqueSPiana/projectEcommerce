package ecommerce.unitetests.mapper;
import static ecommerce.mapper.ObjectMapper.parseListObjects;
import static ecommerce.mapper.ObjectMapper.parseObject;
import static org.junit.jupiter.api.Assertions.assertEquals;

import ecommerce.data.dto.ItemDTO;
import ecommerce.unitetests.mapper.mocks.MockItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ObjectMapperTests {

    MockItem inputObject;


    @BeforeEach
    public void setup(){inputObject = new MockItem();}


    @Test
    public void parseEntityToDTOTest(){
        ItemDTO output = parseObject(inputObject.mockEntity(),ItemDTO.class);
        assertEquals(Long.valueOf(0L), output.getId());

    }

    @Test
    public void parseEntityListToDTOListTest(){
        List<ItemDTO> outputList = parseListObjects(inputObject.mockEntityList(),ItemDTO.class);

        ItemDTO outputZero = outputList.get(0);

        assertEquals(Long.valueOf(0L), outputZero.getId());


        ItemDTO outputSeven = outputList.get(7);

        assertEquals(Long.valueOf(7L), outputSeven.getId());


        ItemDTO outputTwelve = outputList.get(12);

        assertEquals(Long.valueOf(12L), outputSeven.getId());


    }



}
