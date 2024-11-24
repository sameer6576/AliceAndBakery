package com.codingShuttle.sameer.week1_alice.Bakery.AliceAndBakery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    @Autowired
    Frosting frosting;

    @Autowired
    Syrup syrup;

    public void bakeCake(){
        frosting.getFrostingType();
        syrup.getSyrupType();

        System.out.println("Cake is baking successfully");
    }

}
