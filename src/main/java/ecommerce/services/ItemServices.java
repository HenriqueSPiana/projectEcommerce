package ecommerce.services;


import ecommerce.repository.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class ItemServices {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(ItemServices.class);
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = LoggerFactory.getLogger(ItemServices.class.getName());



//    @Autowired
//    ItemRepository repository;
//
//    @Autowired
//     converter;


}
