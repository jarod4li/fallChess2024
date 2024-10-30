package dataaccess;

import model.AuthData;

public class SQLAuthDAO implements AuthDAO{
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
