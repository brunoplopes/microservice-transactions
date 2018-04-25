package com.pismo.controller;

import com.pismo.DTO.TransactionDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/transactions")
public class TransactionController {

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<?> payment(@RequestBody TransactionDTO transactionDTO){
        return new ResponseEntity<>(transactionDTO, HttpStatus.OK);
    }
}
