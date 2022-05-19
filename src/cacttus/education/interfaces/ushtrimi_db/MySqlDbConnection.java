package cacttus.education.interfaces.ushtrimi_db;

import cacttus.education.interfaces.ushtrimi_db.exceptions.SqlException;

import java.util.List;

public class MySqlDbConnection implements DatabaseConnection{
    @Override
    //"server=localhost;database=testDB;uid=root;pwd=abc123;";
    //jdbc:mysql://localhost/test?user=minty&password=greatsqldb"
    public void connect(String connectionUrl) throws SqlException {

    }

    @Override
    public void open() throws SqlException {

    }

    @Override
    public void close() throws SqlException {

    }

    @Override
    public void destroy() throws SqlException {

    }

    @Override
    public int execute(String sqlQuery) throws SqlException {
        return 0;
    }

    @Override
    public List<Object> executeReader(String sqlQuery) throws SqlException {
        return null;
    }
}
