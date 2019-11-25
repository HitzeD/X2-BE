package net.comcast.x2.controller;

import net.comcast.x2.models.Operation;
import net.comcast.x2.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/operations")
public class OperationsController
{
    @Autowired
    private OperationService operationService;

    @GetMapping(value = "/operations",
                produces = {"application/json"})
    public ResponseEntity<?> listAllOps()
    {
        List<Operation> myList = operationService.findall();
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }

}
