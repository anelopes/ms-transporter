package br.com.alopes.microservice.transporter.service;

import br.com.alopes.microservice.transporter.dto.DeliveryDTO;
import br.com.alopes.microservice.transporter.dto.VoucherDTO;
import br.com.alopes.microservice.transporter.model.Delivery;
import br.com.alopes.microservice.transporter.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

    @Autowired
    private DeliveryRepository repository;

    public VoucherDTO bookDelivery(DeliveryDTO deliveryDto) {

        Delivery delivery = new Delivery();
        delivery.setWithdrawalDate(deliveryDto.getDeliveryDate());
        delivery.setDeliveryScheduled(deliveryDto.getDeliveryDate().plusDays(1l));
        delivery.setDestinationAddress(deliveryDto.getDestinationAddress());
        delivery.setSourceAddress(deliveryDto.getSourceAddress());
        delivery.setOrderId(deliveryDto.getOrderId());

        repository.save(delivery);

        VoucherDTO voucher = new VoucherDTO();
        voucher.setNumber(delivery.getId());
        voucher.setDeliveryScheduled(delivery.getDeliveryScheduled());
        return voucher;
    }
}
