package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
//    Today you will be practicing the "Has A" relationship by creating a DrinkDispenser system.
//
//
//        The DrinkDispenser system will have
//        a collection of Syrups. These syrups will have a name and a volume
//        a collection of Shots. These will have a Flavor a volume and amount to dispense per shot.
//        Three different CupHolders with sizes 'small' 'medium' large' (you can decide what those numbers are)
//        CupHolder details:
//        The CupHolder class will have
//        Volume per cup
//        Quantity
//        our cups are not smart cups so it won't be able to tell us if it's full or how full however it will be able
//        to respond with it's size.
//        a dispenseCup() method that will return the volume of the cup and deduct one from it's quantity of cups.
//        a refill(amt) method that will add amt to the quantity of cups
//        Extra challenges:
//        make the volume a private final field that can't be modified or accessed outside of the dispenseCup method.
//        make the quantity field a private field so it can only be modified through the two methods.
//
//
//        Shots Details
//        the shots class will have:
//        a flavor name
//        current amount of liquid
//        amount to dispense per "shot"
//        a dispense() method that deducts the liquid for a single shot per call and returns the flavor of the shot.
//        a getVolume method that will return the amount of shots remaining (not liquid amount the number of shots);
//        Extra Challenges:
//        make the fields all private.
//        update the dispense method to see if there is enough liquid to dispense and if not return null instead of
//        the flavor.
//        Syrup details
//        drink name
//        amount of liquid
//        a dispense(amt) method that deducts the amount of liquid requested
//        a getVolume method that will return the amount of liquid remaining
//        Extra Challenges:
//        make fields Private

//        DrinkDispenser Methods:
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