package com.equilibriumweb.edmilton.dao;

import com.equilibriumweb.edmilton.model.Processo;

import java.util.List;

public interface ProcessoDAO {

    public static int save(Processo processo);

    public static Processo get(Integer id);

    public List<Processo> list();

    public static int delete(int id);

    public int update(Processo processo);
}
