package com.company;
import java.util.ArrayList;
import java.util.List;
public class DrinkDispenser {
    List<DrinkDispenser>  drinks = new ArrayList<>();
    public DrinkDispenser(){

    }


}


//    DrinkDispenser Methods:
//        ServeDrink(size, syrupIndex) will get a cup of the size requested and dispense the syrup requested.
//        Will display "{Size} {Drink}" ex: "Medium Coke"
//        ServeDrink(size, syrupIndex, shotIndex, shotCount) will get a cup of size requested add shotcount of shotIndex
//        shot and dispense the syrup requested will display "{Size} {Shot} {Drink}" ex "Large Cherry Sprite"
//        lowSyrups(vol) will scan the syrups and return the indexes of any syrups that have less then vol liquid
//        remaining
//        lowShots(num) will scan the shots and return the indexes of any shots that have less then num shots remaining
//        addSyrup(syrup) will add the syrup to the collection
//        addShot(shot) will add the shot to the collection.
//        extraChallenges
//        replaceSyrup(index, newSyrup) will replace the syrup at index with newSyrup
//        replaceShot(index, shot) will replace the shot at the index with newShot
//        update serveDrinks system to display "failed" if either there is not enough cups or not enough shots.