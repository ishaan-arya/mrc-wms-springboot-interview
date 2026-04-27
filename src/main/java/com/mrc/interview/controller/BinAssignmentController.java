package com.mrc.interview.controller;

import com.mrc.interview.dto.AssignBinRequest;
import com.mrc.interview.dto.AssignBinResponse;
import com.mrc.interview.service.BinAssignmentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bins")
public class BinAssignmentController {

    private final BinAssignmentService binAssignmentService;

    public BinAssignmentController(BinAssignmentService binAssignmentService) {
        this.binAssignmentService = binAssignmentService;
    }

    @PostMapping("/assign")
    public AssignBinResponse assignBin(@RequestBody AssignBinRequest request) {
        return binAssignmentService.assignBin(request);
    }
}