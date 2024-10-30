package dataaccess;

import model.AuthData;

public class SQLAuthDAO implements AuthDAO{
  private static final String[] AUTH_TABLE_QUERY = {
          "CREATE TABLE IF NOT EXISTS authtokens (" +
                  "token VARCHAR(255) NOT NULL, " +
                  "username VARCHAR(50) NOT NULL, " +
                  "PRIMARY KEY (token)" +
                  ")"
  };

  @Override
  public void clearAllAuth() throws DataAccessException {

  }

  @Override
  public AuthData addAuthToken(String username) throws DataAccessException {
    return null;
  }

  @Override
  public AuthData findToken(String token) throws DataAccessException {
    return null;
  }

  @Override
  public void removeAuthToken(AuthData token) throws DataAccessException {

  }
}
