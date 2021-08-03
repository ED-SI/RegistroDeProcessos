package com.equilibriumweb.edmilton.dao;

import com.equilibriumweb.edmilton.model.Processo;
import com.equilibriumweb.edmilton.model.TipoProcesso;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProcessoDAOImpl implements ProcessoDAO {

    private final JdbcTemplate jdbcTemplate;

    public ProcessoDAOImpl(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int save(Processo processo) {
            // insert
            String sql = "INSERT INTO processos (numero, valor_recurso, objetivo) VALUES (?, ?, ?)";
            return jdbcTemplate.update(sql, processo.getNumero(), processo.getValorRecurso(),
                    processo.getObjetivo());
    }

    @Override
    public Processo get(Integer id) {
        String sql = "SELECT * FROM processos WHERE id=" + id;
        return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Processo.class));
    }

    @Override
    public int update(Processo processo){
        String sql = "UPDATE processos SET numero = ? WHERE id_processo = ?";
        return jdbcTemplate.update(sql,processo.getNumero());
    }

    @Override
    public List<Processo> list() {
        String sql = "SELECT * FROM processos";

        RowMapper<Processo> romMapper = new RowMapper<Processo>() {
            @Override
            public Processo mapRow(ResultSet rs, int rowNum) throws SQLException {
                Integer id = rs.getInt("id_processo");
                int numero = rs.getInt("numero");
                String data = rs.getString("data_entrada");
                Double valor_recurso = rs.getDouble("valor_recurso");
                String objetivo = rs.getString("objetivo");

                return new Processo(id, numero, valor_recurso, objetivo);
            }
        };
        return jdbcTemplate.query(sql, romMapper);
    }

    @Override
    public int delete(int id) {
        String sql = "DELETE FROM processo WHERE id_processo = " + id;
        return jdbcTemplate.update(sql);
    }

}
