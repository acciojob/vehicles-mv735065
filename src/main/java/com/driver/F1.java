package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name,4,2,7,isManual,"Sports",2);
        //Use arbitrary values for parameters which are not mentioned
//            super.setName(name);
//            super.setManual(isManual);

    }

    public void accelerate(int rate){
        int newSpeed = rate+getCurrentSpeed() ; //set the value of new speed by using currentSpeed and rate


        /**
         *
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            stop();
            setCurrentGear(1);

        }
        //for all other cases, change the gear accordingly

        else if( newSpeed<=50) {
            setCurrentGear(1);
            //changeSpeed(newSpeed, getCurrentDirection());
        }else if( newSpeed<=100) {
            setCurrentGear(2);
            //changeSpeed(newSpeed, getCurrentDirection());
        }else if( newSpeed<=150) {
            setCurrentGear(3);
            //changeSpeed(newSpeed, getCurrentDirection());
        }else if( newSpeed<=200) {
            setCurrentGear(4);
            //changeSpeed(newSpeed, getCurrentDirection());
        }else if( newSpeed<=250) {
            setCurrentGear(5);
            //changeSpeed(newSpeed, getCurrentDirection());
        }
        else if( newSpeed>250) {
            setCurrentGear(6);
            //changeSpeed(newSpeed, getCurrentDirection());
        }

        if(newSpeed>0){
            changeSpeed(newSpeed,getCurrentDirection());
        }

    }
}
