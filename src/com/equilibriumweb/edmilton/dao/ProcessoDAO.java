package com.equilibriumweb.edmilton.dao;

import com.equilibriumweb.edmilton.model.Processo;

import java.util.List;

public interface ProcessoDAO {

    public int save(Processo processo);

    public Processo get(Integer id);

    public List<Processo> list();

    public int update(Processo processo);

    public int delete(int id);
}
