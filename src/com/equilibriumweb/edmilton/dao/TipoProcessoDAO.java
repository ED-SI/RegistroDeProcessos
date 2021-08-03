package com.equilibriumweb.edmilton.dao;

import java.util.List;

import com.equilibriumweb.edmilton.model.TipoProcesso;

public interface TipoProcessoDAO {

	public int save(TipoProcesso tipoProcesso);

	public TipoProcesso get(Integer id);

	public List<TipoProcesso> list();

	public int delete(int id);

	public int update(TipoProcesso tipo);
}
