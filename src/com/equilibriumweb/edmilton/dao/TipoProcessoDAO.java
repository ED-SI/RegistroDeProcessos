package com.equilibriumweb.edmilton.dao;

import java.util.List;

import com.equilibriumweb.edmilton.model.TipoProcesso;

public interface TipoProcessoDAO {

	public int salvar(TipoProcesso tipoProcesso);
	
	public TipoProcesso get(int id);
	
	public List<TipoProcesso> tipoProcesso();
	
	public int atualizar(TipoProcesso tipoProcesso);
	
	public int deletar(int id);
}
