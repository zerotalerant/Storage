import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Group {
    private int id;
    private String nameOfGroup;

    public Group() {
    }

    public Group(int id, String nameOfGroup) {
        this.id = id;
        this.nameOfGroup = nameOfGroup;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    @Override
    public String toString() {
        return "Group{" +
               "id=" + id +
               ", nameOfGroup='" + nameOfGroup + '\'' +
               '}';
    }

    private DataBaseConnection dataBaseConnection = new DataBaseConnection ();

    public List<Group> getAllGroup ()
    {
        List<Group> groups = new ArrayList<> ();
        String sql = "SELECT id, name FROM group";
        try (Connection connection = dataBaseConnection.connection ();
             Statement statement = connection.createStatement ();
             ResultSet resultSet = statement.executeQuery ( sql ))
        {
            Group group = new Group (
                    resultSet.getInt ( "id" ),
                    resultSet.getString ( "name" ) );
            groups.add ( group );
        } catch (SQLException e)
        {
            System.out.println ( e.getMessage () );
        }
        return groups;
    }
}
