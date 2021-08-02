package br.com.teste.azulseguros.repository;

import br.com.teste.azulseguros.entity.Cliente;
import ch.qos.logback.core.net.server.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.Id;

public interface ClienteRepository  extends JpaRepository<Cliente, Integer> {

    Cliente findByMail(String mail);

    @Query("select c from Cliente c where c.mail =:mail and c.cep =:cep")
    Cliente findByMailCep(String mail, String cep);
}
