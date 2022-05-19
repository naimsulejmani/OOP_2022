package cacttus.education.interfaces.ushtrimi_db;

import cacttus.education.interfaces.ushtrimi_db.exceptions.SqlException;

import java.util.ArrayList;
import java.util.List;

public class MssqlDbConnection implements DatabaseConnection {
    Boolean isConnected = null;

    @Override
    //"Data Source=127.0.0.1;Initial Catalog=db_name;User ID=user;Password=user"
    public void connect(String connectionUrl) throws SqlException {
        String[] constr = connectionUrl.split(";");
        if (constr.length < 4) throw new SqlException("Connection Url is wrong!");
        if (!connectionUrl.contains("Data Source="))
            throw new SqlException("Data Source is missing!");
        //validime tjera
        isConnected = true;
        System.out.println("Connection has been successfully made!");
    }

    @Override
    public void open() throws SqlException {
        if (isConnected == null) throw new SqlException("Connection can not be open!");
        isConnected = true;
        System.out.println("Connection is open now!");
    }

    @Override
    public void close() throws SqlException {
        if (isConnected == null)
            throw new SqlException("Conneciton cannot be closed!");
        if (!isConnected)
            throw new SqlException("Connection is already closed!");
        isConnected = false;
        System.out.println("Connection is closed now!");
    }

    @Override
    public void destroy() throws SqlException {
        if (isConnected == null) throw new SqlException("Connection is already destroyed!");
        isConnected = null;
        System.out.println("Connection is destroyed now!");
    }

    //DML - Insert, Update dhe DELETE
    @Override
    public int execute(String sqlQuery) throws SqlException {
        if (isConnected == null || !isConnected)
            throw new SqlException("Query cannot be executed on closed or detroyed conenction!");

        if (!sqlQuery.contains("INSERT") && !sqlQuery.contains("UPDATE") &&
                !sqlQuery.contains("DELETE"))
            throw new SqlException("Wrong Command!");

        return 1;
    }

    @Override
    public List<Object> executeReader(String sqlQuery) throws SqlException {
        if (isConnected == null || !isConnected)
            throw new SqlException("Query cannot be executed on closed or detroyed conenction!");
        if (!sqlQuery.contains("SELECT"))
            throw new SqlException("Wrong SQL Command!");

        return new ArrayList<>();
    }
}
