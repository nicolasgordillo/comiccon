package com.boot.subsidios.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.subsidios.model.Subsidio;
import com.boot.subsidios.repository.SubsidioStub;

@RestController
@RequestMapping("api/v1/")
public class SubsidioController {

	@RequestMapping(value = "subsidios", method = RequestMethod.GET)
	public List<Subsidio> list() {
		return SubsidioStub.list();
	}
	
	@RequestMapping(value = "subsidios/{id}", method = RequestMethod.GET)
	public Subsidio get(@PathVariable long id) {
		return SubsidioStub.get(id);
	}
	
	@RequestMapping(value = "subsidios", method = RequestMethod.POST)
	public Subsidio create(@RequestBody Subsidio subsidio) {
		return SubsidioStub.create(subsidio);
	}
	
	@RequestMapping(value = "subsidios/{id}", method = RequestMethod.PUT)
	public Subsidio update(@PathVariable long id, @RequestBody Subsidio subsidio) {
		return SubsidioStub.update(id, subsidio);
	}
	
	@RequestMapping(value = "subsidios/{id}", method = RequestMethod.DELETE)
	public Subsidio delete(@PathVariable long id) {
		return SubsidioStub.delete(id);
	}
}
