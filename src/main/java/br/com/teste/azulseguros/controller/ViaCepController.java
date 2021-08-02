package br.com.teste.azulseguros.controller;

import br.com.teste.azulseguros.entity.Cliente;
import br.com.teste.azulseguros.entity.Endereco;
import br.com.teste.azulseguros.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.teste.azulseguros.service.ViaCepService;

@RestController
public class ViaCepController {

	@Autowired
	private ViaCepService service;

	@Autowired
	private ClienteService clienteService;

	private ResponseEntity<Endereco> consumer(String cep, long idFormat){
		return ResponseEntity.ok(service.consumer(cep, idFormat));
	}

	/**
	 * Metodo para inserir um cliente
	 * @param cliente
	 * @return
	 */
	@PostMapping("/adicionarCliente")
	public Object addCliente(@RequestBody Cliente cliente){
		Endereco endereco = service.consumer(cliente.getCep(), 1);


		Cliente clienteExiste = clienteService.getClienteByMailCep(cliente.getMail(), cliente.getCep());

		if (clienteExiste != null){
		return "Cliente Existente.Nao pode inserir";
		}else{
			cliente.setLogradouro(endereco.getLogradouro());
			return clienteService.saveCliente(cliente);
		}

	}

	@GetMapping("/procurarClientePorMail/{mail}")
	public Cliente findClienteByMail(@PathVariable String mail){
		return clienteService.getClientsByMail(mail);

	}
	
}
