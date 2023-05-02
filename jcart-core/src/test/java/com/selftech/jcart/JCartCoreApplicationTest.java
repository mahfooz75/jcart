package com.selftech.jcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
public class JCartCoreApplicationTest {

    @Autowired
    DataSource dataSource;

    @Test
    public void testDummy() throws SQLException {
        String schema = dataSource.getConnection().getCatalog();
        assertEquals("jcart",schema);
    }
}
