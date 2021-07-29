package com.equilibriumweb.edmilton.test;

import com.equilibriumweb.edmilton.dao.TipoProcessoDAO;
import com.equilibriumweb.edmilton.dao.TipoProcessoDAOImpl;
import com.equilibriumweb.edmilton.model.TipoProcesso;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TipoProcessoDAOTest {

    private DriverManagerDataSource dataSource;
    private TipoProcessoDAO dao;

    @BeforeEach
    void setupBeforeEach(){
        dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/processo2?autoReconnect=true&useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        dao = new TipoProcessoDAOImpl(dataSource);
    }

    @Test
     void testSave() {
        TipoProcesso tipo = new TipoProcesso("Tipo2");

        int resultado = dao.save(tipo);

        assertTrue(resultado > 0);

    }

    @Test
    void testGet() {
        Integer id = 1;
        TipoProcesso tipoProcesso = dao.get(id);
        if(tipoProcesso != null){
            System.out.println(tipoProcesso);
        }
        assertNotNull(tipoProcesso);
    }

    @Test
    void testUpdate() {
        TipoProcesso tipo = new TipoProcesso(2,"Tipo 2");

        int resultado = dao.save(tipo);

        assertTrue(resultado > 0);
    }

    @Test
    void testDelete() {
        Integer id = 5;
        int resultado = dao.delete(id);

        assertTrue(resultado > 0);
    }

    @Test
    void testList() {
        List<TipoProcesso> listTipoProcessos = dao.list();

        for(TipoProcesso tipoProcesso : listTipoProcessos){
            System.out.println(tipoProcesso);
        }
        assertTrue(!listTipoProcessos.isEmpty());
    }
}