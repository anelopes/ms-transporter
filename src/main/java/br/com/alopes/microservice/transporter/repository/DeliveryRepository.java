package br.com.alopes.microservice.transporter.repository;

import br.com.alopes.microservice.transporter.model.Delivery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends CrudRepository<Delivery, Long> {

}
