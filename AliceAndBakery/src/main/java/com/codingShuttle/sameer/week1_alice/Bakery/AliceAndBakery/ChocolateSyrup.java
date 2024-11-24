package com.codingShuttle.sameer.week1_alice.Bakery.AliceAndBakery;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="cake.type",havingValue = "chocolate")
public class ChocolateSyrup implements Syrup{

    @Override
    public void getSyrupType(){
        System.out.println("Get chocolate syrup type for the cake");
    }
}
