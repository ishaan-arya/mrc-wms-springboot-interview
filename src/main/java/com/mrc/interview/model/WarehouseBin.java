package com.mrc.interview.model;

public class WarehouseBin {
    private String binCode;
    private int currentWeightKg;
    private int maxWeightKg;

    public WarehouseBin(String binCode, int currentWeightKg, int maxWeightKg) {
        this.binCode = binCode;
        this.currentWeightKg = currentWeightKg;
        this.maxWeightKg = maxWeightKg;
    }

    public String getBinCode() {
        return binCode;
    }

    public int getCurrentWeightKg() {
        return currentWeightKg;
    }

    public int getMaxWeightKg() {
        return maxWeightKg;
    }
}