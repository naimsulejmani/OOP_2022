package cacttus.education.interfaces.ushtrimi_db;

import cacttus.education.interfaces.ushtrimi_db.exceptions.SqlException;

public class TestDatabaseApp {
    public static void main(String[] args) {
        args = new String[]{"mssql",
                "Data Source=.;Initial Catalog=CacttusDb;User ID=user;Password=123456"};
        String connectionUrl = args[1];
        DatabaseConnection connection = null;

        switch (args[0]) {
            case "mssql":
                connection = new MssqlDbConnection();
                break;
            case "mysql":
                connection = new MySqlDbConnection();
                break;
            case "oracle":
                connection = new OracleDbConnection();
                break;
        }

        try {
            connection.connect(connectionUrl);
            String query = "INSERT INTO Personi (id,name) VALUES(1,'Naim');";
            int rowAffected = connection.execute(query);
            System.out.println(rowAffected + " row is affected!");
        } catch (SqlException e) {
            System.out.println(e.getMessage());
        }
    }
}







