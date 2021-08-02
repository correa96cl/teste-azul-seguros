package br.com.teste.azulseguros.service;

import br.com.teste.azulseguros.entity.Cliente;
import br.com.teste.azulseguros.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository  clienteRepository;

    /**
     * Metodo para salvar o cliente
     * @param cliente
     * @return
     */
    public Cliente saveCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> getClientById(int id){
        return clienteRepository.findById(id);
    }

    public Cliente getClientsByMail(String mail){
        return clienteRepository.findByMail(mail);
    }

    public Cliente getClienteByMailCep(String mail, String cep){
        return clienteRepository.findByMailCep(mail, cep);
    }
}
