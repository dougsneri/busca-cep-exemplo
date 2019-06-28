package br.com.dougsneri.entidades;

import lombok.Data;

@Data
public class Cep {

	private String cep;
	private String bairro;
	private String logradouro;
	private String cidade;
	private CidadeInfo cidade_info;
	private String estado;
	private EstadoInfo estado_info;

}
