package com.equilibriumweb.edmilton.test;

import com.equilibriumweb.edmilton.dao.TipoProcessoDAO;
import com.equilibriumweb.edmilton.dao.TipoProcessoDAOImpl;
import com.equilibriumweb.edmilton.model.TipoProcesso;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

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
        TipoProcesso tipo = new TipoProcesso("Tipo 2");

        int resultado = dao.save(tipo);

        assertTrue(resultado > 0);

    }

    @Test
    void get() {
    }

    @Test
    void tipoProcesso() {
    }

    @Test
    void testUpdate() {
        TipoProcesso tipo = new TipoProcesso(2,"Tipo 2");

        int resultado = dao.save(tipo);

        assertTrue(resultado > 0);
    }

    @Test
    void delete() {
    }
}