package dataaccess;

import model.GameData;

import java.util.ArrayList;

public class SQLGameDAO implements GameDAO{
  private static final String[] GAMES_TABLE_QUERY = {
          "CREATE TABLE IF NOT EXISTS games (" +
                  "gameName VARCHAR(255) NOT NULL, " +
                  "gameID VARCHAR(255) PRIMARY KEY, " +
                  "whiteUsername VARCHAR(255), " +
                  "blackUsername VARCHAR(255), " +
                  "game TEXT NOT NULL" +
                  ")"
  };

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
