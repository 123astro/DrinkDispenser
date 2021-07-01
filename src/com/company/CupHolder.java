package com.company;

public class CupHolder {
        public boolean cupSizeSM;
        public boolean cupSizeMed;
        public boolean cupSizeLrg;
        public int qtyOfSmCups;
        public int qtyOfMedCups;
        public int qtyOfLrgCups;


        public CupHolder(boolean cupSizeSM,
                         boolean cupSizeMed,
                         boolean cupSizeLrg,
                         int qtyOfSmCups,
                         int qtyOfMedCups,
                         int qtyOfLrgCups
        ) {                     this.cupSizeSM  = cupSizeSM;
                                this.cupSizeMed = cupSizeMed;
                                this.cupSizeLrg = cupSizeLrg;
                                this.qtyOfSmCups = qtyOfSmCups;
                                this.qtyOfMedCups = qtyOfMedCups;
                                this.qtyOfLrgCups = qtyOfLrgCups;
        }

        public int dispenseCup(){
                 if (cupSizeSM){
                         return (qtyOfSmCups = (qtyOfSmCups - 1));
                 } else if (cupSizeMed) {
                         return (qtyOfMedCups = (qtyOfMedCups - 1));
                 } else { return (qtyOfLrgCups = (qtyOfLrgCups - 1));
                }
        }

        public int refill(int amt) {
            if (cupSizeSM){
                return (qtyOfSmCups = (qtyOfSmCups + amt));
            } else if (cupSizeMed) {
                return (qtyOfMedCups = (qtyOfMedCups + amt));
            } else { return (qtyOfLrgCups = (qtyOfLrgCups + amt));
            }

        }

}


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