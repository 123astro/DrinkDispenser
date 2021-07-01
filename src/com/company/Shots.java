package com.company;

public class Shots {
        public String shotFlavor;
        public int totalLiquid;
        public int amountPerShot;


        public Shots( String shotFlavor, int totalLiquid, int amountPerShot){
                this.shotFlavor = shotFlavor;
                this.totalLiquid = totalLiquid;
                this.amountPerShot = amountPerShot;
        }

        public String dispense() {
                return (amountPerShot + shotFlavor);
        }

        public int getShot(){
                return (totalLiquid / amountPerShot);
        }

        }
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