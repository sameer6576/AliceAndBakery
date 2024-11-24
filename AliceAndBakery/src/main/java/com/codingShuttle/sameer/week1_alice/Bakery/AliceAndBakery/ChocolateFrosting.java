package com.codingShuttle.sameer.week1_alice.Bakery.AliceAndBakery;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="cake.type",havingValue = "chocolate")
public class ChocolateFrosting implements Frosting {

    @Override
    public void getFrostingType(){
        System.out.println("Get frosting of chocolate flavour");
    }
}
