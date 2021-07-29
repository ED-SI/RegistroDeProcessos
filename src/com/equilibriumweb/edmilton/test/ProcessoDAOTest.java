package com.equilibriumweb.edmilton.test;

import com.equilibriumweb.edmilton.dao.ProcessoDAO;
import com.equilibriumweb.edmilton.dao.ProcessoDAOImpl;
import com.equilibriumweb.edmilton.model.Processo;
import com.equilibriumweb.edmilton.model.TipoProcesso;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ProcessoDAOTest {

    private DriverManagerDataSource dataSource;
    private ProcessoDAO dao;

    @BeforeEach
    void setupBeforeEach(){
        dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/processo2?autoReconnect=true&useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        dao = new ProcessoDAOImpl(dataSource);
    }

    @Test
    void Save() {
        Processo processo = new Processo(1122,3000.00,"Teste");

        int resultado = dao.save(processo);

        assertTrue(resultado > 0);

    }

    @Test
    void Get() {
        Integer id = 1;
        Processo processo = dao.get(id);
        if(processo != null){
            System.out.println(processo);
        }
        assertNotNull(processo);
    }

    @Test
    void List() {
        List<Processo> listProcessos = dao.list();

        for(Processo processo : listProcessos){
            System.out.println(processo);
        }
        assertTrue(!listProcessos.isEmpty());
    }

    @Test
    void Update() {
        Processo processo = new Processo(1,1, 555.00, "Update com sucesso");

        int resultado = dao.save(processo);

        assertTrue(resultado > 0);
    }

    @Test
    void Delete() {
        Integer id = 2;
        int resultado = dao.delete(id);

        assertTrue(resultado > 0);
    }
}