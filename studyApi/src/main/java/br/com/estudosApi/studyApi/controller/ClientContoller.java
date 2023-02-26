package br.com.estudosApi.studyApi.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudosApi.studyApi.model.Cliente;
import br.com.estudosApi.studyApi.repository.ClientRepository;

@RestController
@RequestMapping("/clientes")
public class ClientContoller {
	
	@Autowired
	private ClientRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> listar() {
		return clienteRepository.findAll();
		
	}
	
	@PostMapping
	public Cliente adicionarCliente (@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}

}
