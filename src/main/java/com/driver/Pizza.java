package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingsAdded=false;
    private boolean isTakeAway=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price=300;
        }
        else {
            price=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            isExtraCheeseAdded=true;
            price+=80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsAdded){
            isExtraToppingsAdded=true;
            if(isVeg){
                price+=70;
            }
            else{
                price+=120;
            }
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            isTakeAway=true;
            price+=20;
        }
    }

    public String getBill(){
        // your code goes here
        int basePrice;
        int topping;
        if(isVeg){
            basePrice=300;
            topping=70;
        }
        else{
            basePrice=400;
            topping=120;
        }
        StringBuilder str=new StringBuilder("");
        str.append("Base Price Of The Pizza: "+basePrice+'\n');
        if(isExtraCheeseAdded) str.append("Extra Cheese Added: 80\n");
        if(isExtraToppingsAdded) str.append("Extra Toppings Added: "+topping+'\n');
        if(isTakeAway) str.append("Paperbag Added: 20\n");
        str.append("Total Price: "+price+'\n');
        bill=str.toString();

        return this.bill;
    }
}
