package br.com.dougsneri.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.dougsneri.entidades.Cep;

//http://api.postmon.com.br/v1/cep/{cep}
@FeignClient(name = "cep", url = "http://api.postmon.com.br")
public interface BuscaCepService {

	@RequestMapping("/v1/cep/{cep}")
	Cep getCep(@PathVariable("cep") String cep);
}