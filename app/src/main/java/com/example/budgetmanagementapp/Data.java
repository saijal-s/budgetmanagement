package com.example.budgetmanagementapp;

public class Data {
    String item, dste, id, notes;
    int amount,month;

    public Data() {

    }

    public Data(String item, String dste, String id, String notes, int amount, int month) {
        this.item = item;
        this.dste = dste;
        this.id = id;
        this.notes = notes;
        this.amount = amount;
        this.month = month;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDste() {
        return dste;
    }

    public void setDste(String dste) {
        this.dste = dste;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
