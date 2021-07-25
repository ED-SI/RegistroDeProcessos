package com.equilibriumweb.edmilton.dao;

import java.util.List;

import com.equilibriumweb.edmilton.model.Processo;

public interface ProcessoDAO {

	public int salvar(Processo processo);

	public Processo get(int id);

	public List<Processo> processo();

	public int atualizar(Processo processo);

	public int deletar(int id);

}
