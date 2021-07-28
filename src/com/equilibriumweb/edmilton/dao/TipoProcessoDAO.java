package com.equilibriumweb.edmilton.dao;

import java.util.List;

import com.equilibriumweb.edmilton.model.TipoProcesso;

public interface TipoProcessoDAO {

	public int save(TipoProcesso tipoProcesso);
	
	public TipoProcesso get(int id);
	
	public List<TipoProcesso> tipoProcesso();
	
	public int update(TipoProcesso tipoProcesso);
	
	public int delete(int id);
}
