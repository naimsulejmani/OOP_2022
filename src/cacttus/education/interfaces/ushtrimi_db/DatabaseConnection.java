package cacttus.education.interfaces.ushtrimi_db;

import cacttus.education.interfaces.ushtrimi_db.exceptions.SqlException;

import java.util.List;

//
public interface DatabaseConnection {
    //metoda qe na sherben me u konektu
    public void connect(String connectionUrl) throws SqlException;

    public void open() throws SqlException; //metoda me hap koneksionin nese e ke mbyllur

    public void close() throws SqlException; //metoda me mbyll koneksionin nese nuk te nevoitet

    public void destroy() throws SqlException; //metoda me shkatru connection

    public int execute(String sqlQuery) throws SqlException; //metoda qe kryen veprime CRUD apo DML

    public List<Object> executeReader(String sqlQuery) throws SqlException; //metoda qe kryen veprime DQL
}






