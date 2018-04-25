package com.pismo.controller;

import com.pismo.DTO.PaymentDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/payments")
public class PaymentController {

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<?> payment(@RequestBody List<PaymentDTO> paymentDTOS){
        return new ResponseEntity<>(paymentDTOS, HttpStatus.OK);
    }
}
