package com.mrc.interview.dto;

public class AssignBinResponse {
    private String itemCode;
    private String assignedBin;
    private int remainingCapacityAfterPlacementKg;

    public AssignBinResponse(String itemCode, String assignedBin, int remainingCapacityAfterPlacementKg) {
        this.itemCode = itemCode;
        this.assignedBin = assignedBin;
        this.remainingCapacityAfterPlacementKg = remainingCapacityAfterPlacementKg;
    }

    public String getItemCode() {
        return itemCode;
    }

    public String getAssignedBin() {
        return assignedBin;
    }

    public int getRemainingCapacityAfterPlacementKg() {
        return remainingCapacityAfterPlacementKg;
    }
}