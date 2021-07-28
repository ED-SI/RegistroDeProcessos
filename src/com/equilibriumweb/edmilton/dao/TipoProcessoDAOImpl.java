package com.equilibriumweb.edmilton.dao;

import com.equilibriumweb.edmilton.model.TipoProcesso;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class TipoProcessoDAOImpl implements TipoProcessoDAO {

    private final JdbcTemplate jdbcTemplate;

    public TipoProcessoDAOImpl(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int save(TipoProcesso tipo) {
        String sql = "INSERT INTO tipo_processo (nome) VALUES ('?')";

        return jdbcTemplate.update(sql, tipo.getNome());
    }

    @Override
    public TipoProcesso get(int id) {
        return null;
    }

    @Override
    public List<TipoProcesso> tipoProcesso() {
        return null;
    }

    @Override
    public int update(TipoProcesso tipo) {
        String sql = "UPDATE tipo_processo SET nome = ? WHERE id_tipo_processo = ?";
        return jdbcTemplate.update(sql,tipo.getNome());
    }

    @Override
    public int delete(int id) {
        return 0;
    }
}
