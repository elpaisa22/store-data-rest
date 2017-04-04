package app.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import app.rest.models.Cliente;
import app.rest.repositories.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository repository;
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Cliente getById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

	@RequestMapping(method = RequestMethod.GET)
    public Page<Cliente> list(Pageable pageable) {
        return (Page<Cliente>) this.repository.findAll(pageable);
    }
	
	@RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Cliente info) {
		this.repository.save(info);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody Cliente info) {
    	this.repository.save(info);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	this.repository.delete(id);
    }
}
