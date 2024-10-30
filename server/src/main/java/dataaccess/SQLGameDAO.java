package dataaccess;

import model.GameData;

import java.util.ArrayList;

public class SQLGameDAO implements GameDAO{
  @Override
  public void addGame(GameData newGame) throws DataAccessException {

  }

  @Override
  public String getGameID(String gameName) throws DataAccessException {
    return "";
  }

  @Override
  public Boolean getGameName(String gameName) throws DataAccessException {
    return null;
  }

  @Override
  public GameData getGame(String gameID) throws DataAccessException {
    return null;
  }

  @Override
  public Boolean setGame(GameData currGame, String playerColor, String username) throws DataAccessException {
    return null;
  }

  @Override
  public ArrayList<GameData> getList() throws DataAccessException {
    return null;
  }

  @Override
  public void clearAllGames() throws DataAccessException {

  }

  @Override
  public void updateGame(String gameID, GameData updatedGame) throws DataAccessException {

  }
}
