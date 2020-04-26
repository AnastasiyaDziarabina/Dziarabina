package com.stormnet.homework.homework3.Task3;



import java.util.ArrayList;
import java.util.Date;

public class Task3_Data {


    private String cardNumber;
    private String typeCard;
    private String customerName;
    private Date term ;
    private String cvv;



    public Task3_Data(String cardNumber, String typeCard, String customerName, Date term, String cvv) {
        this.cardNumber = cardNumber;
        this.typeCard = typeCard;
        this.customerName = customerName;
        this.term = term;
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getTypeCard() {
        return typeCard;
    }

    public void setTypeCard(String typeCard) {
        this.typeCard = typeCard;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getTerm() {
        return term;
    }

    public void setTerm(Date term) {
        this.term = term;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    static class Validator{
        static void validationCard(ArrayList <Task3_Data> card, Task3_Data objectCard){


        Date date = new Date();




            if (objectCard.getCardNumber().replaceAll(" ","").length() < 16 ){
                System.out.println("Card number should consist of 16 digits");
            }
            if (objectCard.getTypeCard() != "Credit" && objectCard.getTypeCard() != "Debit"){
                System.out.println("Card type can only be Debit or Credit");
            }
            if (objectCard.getCustomerName().length() < 1){
                System.out.println("Name should contains at least 1 symbol");
            }
            if (objectCard.getTerm().before(date)){
                System.out.println("Card expired");
            }
            if (objectCard.getCvv().length() < 3) {
                System.out.println("CVV should consist of 3 digits");
            }
    }
}
}