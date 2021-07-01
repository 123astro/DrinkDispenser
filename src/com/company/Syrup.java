package com.company;

public class Syrup{
        public String drinkName;
        public int totalLiquid;

        public int dispense(int amt) {
                return ( totalLiquid = (amt - totalLiquid));
        }

        public int getVolume(){
                return totalLiquid;
        }

}










//    Syrup details
//        drink name
//        amount of liquid
//        a dispense(amt) method that deducts the amount of liquid requested
//        a getVolume method that will return the amount of liquid remaining
//        Extra Challenges:
//        make fields Private