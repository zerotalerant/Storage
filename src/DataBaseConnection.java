import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/Demo2?currentSchema=Warcout";
    private static final String USER = "postgres";
    private static final String PASSWORD = "radik";

    public Connection connection ()
    {
        Connection connection = null;
        try
        {
            connection = DriverManager.getConnection ( URL, USER, PASSWORD );
            System.out.println ( "Well done" );
        } catch (SQLException ex)
        {
            System.out.println ( ex.getMessage () );
        } finally
        {
            try
            {
                connection.close ();
            } catch (SQLException e)
            {
                e.printStackTrace ();
            }
        }
        return connection;
    }

}
