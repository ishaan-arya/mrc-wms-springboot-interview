package com.mrc.interview.service;

import com.mrc.interview.dto.AssignBinRequest;
import com.mrc.interview.dto.AssignBinResponse;
import com.mrc.interview.model.WarehouseBin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BinAssignmentService {

    private final List<WarehouseBin> bins = List.of(
            new WarehouseBin("A-01", 400, 500),
            new WarehouseBin("A-02", 100, 300),
            new WarehouseBin("B-01", 420, 500),
            new WarehouseBin("C-01", 0, 1000)
    );

    public AssignBinResponse assignBin(AssignBinRequest request) {
        /*
         * TODO:
         *
         * You are building a small part of a Warehouse Management System for MRC Logistics.
         * The API receives an inbound item and assigns it to the best warehouse bin.
         *
         * Assignment rules:
         *
         * 1. Find all bins which are eligible (i.e. they can fit the new item's weight).
         *
         * 2. Pick the eligible bin with the least remaining capacity after placement.
         *
         * 3. If there is a tie, pick the bin with the alphabetically smaller binCode.
         *
         * API contract:
         *
         * 4. Reject invalid input with HTTP 400:
         *      - itemCode must be non-blank
         *      - weightKg must be > 0
         *
         * 5. If no bin is eligible, respond with HTTP 404 and a JSON body of the form:
         *      { "error": "No suitable bin available" }
         *
         * You may add new classes/files (exceptions, handlers, etc.) as needed.
         */

        return null;
    }
}