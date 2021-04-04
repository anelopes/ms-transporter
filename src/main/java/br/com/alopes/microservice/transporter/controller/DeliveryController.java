package br.com.alopes.microservice.transporter.controller;

import br.com.alopes.microservice.transporter.dto.DeliveryDTO;
import br.com.alopes.microservice.transporter.dto.VoucherDTO;
import br.com.alopes.microservice.transporter.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @PostMapping
    public VoucherDTO bookDelivery(@RequestBody DeliveryDTO delivery) {
        return deliveryService.bookDelivery(delivery);
    }
}
