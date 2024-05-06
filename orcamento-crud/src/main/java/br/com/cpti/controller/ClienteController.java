package br.com.cpti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.cpti.entity.Cliente;
import br.com.cpti.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;

	@PostMapping
	public Cliente inserirCliente(@RequestBody Cliente cliente) {
	return clienteRepository.save(cliente);
	}
}
