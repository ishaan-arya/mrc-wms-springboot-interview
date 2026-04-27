package com.mrc.interview.dto;

public class AssignBinRequest {
    private String itemCode;
    private int weightKg;

    public String getItemCode() {
        return itemCode;
    }

    public int getWeightKg() {
        return weightKg;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public void setWeightKg(int weightKg) {
        this.weightKg = weightKg;
    }
}