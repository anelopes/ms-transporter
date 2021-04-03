package br.com.alopes.microservice.transporter.repository;

import br.com.alopes.microservice.transporter.model.Entrega;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregaRepository extends CrudRepository<Entrega, Long>{

}
