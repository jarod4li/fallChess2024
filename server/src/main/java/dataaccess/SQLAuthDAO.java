package dataaccess;

import model.AuthData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLAuthDAO implements AuthDAO{
  public SQLAuthDAO() throws DataAccessException {
    configureDatabase();
  }
  private static final String[] AUTH_TABLE_QUERY = {
          "CREATE TABLE IF NOT EXISTS authtokens (" +
                  "token VARCHAR(255) NOT NULL, " +
                  "username VARCHAR(50) NOT NULL, " +
                  "PRIMARY KEY (token)" +
                  ")"
  };

  private void configureDatabase() throws DataAccessException {
    DatabaseManager.createDatabase();
    try (var conn = DatabaseManager.getConnection()) {
      for (var statement : AUTH_TABLE_QUERY) {
        try (var preparedStatement = conn.prepareStatement(statement)) {
          preparedStatement.executeUpdate();
        }
      }
    } catch (SQLException ex) {
      throw new DataAccessException(String.format("Unable to configure database: %s", ex.getMessage()));
    }
  }

  @Override
  public void clearAllAuth() throws DataAccessException {

  }

  @Override
  public AuthData addAuthToken(String username) throws DataAccessException {
    AuthData newUser = new AuthData(username);
    try (Connection conn = DatabaseManager.getConnection();
         PreparedStatement statement = conn.prepareStatement("INSERT INTO authtokens (username, token) VALUES (?, ?)")) {
      statement.setString(1, newUser.getUsername());
      statement.setString(2, newUser.getToken());
      statement.executeUpdate();
      return newUser;
    } catch (SQLException e) {
      throw new DataAccessException("Error: " + e.getMessage());
    }
  }

  @Override
  public AuthData findToken(String token) throws DataAccessException {
    return null;
  }

  @Override
  public void removeAuthToken(AuthData token) throws DataAccessException {

  }
}
