package co.projetWeb.Application.Model.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class DAO<T> {

  protected Connection connect = null;
  protected String tableName;
  protected String pkName;

  /**
   * DAO constructor.
   * 
   * @param conn Database connection to use for DB queries.
   * @param tableName represents the DB table name to use for queries. 
   */
  public DAO(Connection conn, String tableName) {
    this.connect = conn;
    this.tableName = tableName;
    this.pkName = "id";
  }

  /**
   * Persists T object in DB.
   * 
   * @param obj the object to persist in DB
   * @return a new {@code T} object created in DB.
   */
  public abstract T create(T obj);

  /**
   * Removes T object in DB.
   * 
   * @param obj the object to remove from DB.
   * @return {@code true} if the deletion succeeds, {@code false} otherwise.
   */
  public abstract boolean delete(T obj);

  /**
   * Finds T object with its ID.
   * 
   * @param id the ID to look for in the object DB table.
   * @return {@code T} object if id found, {@code null} otherwise.
   */
  public abstract T findById(int id);

  /**
   * Lists all T objects persisted in DB.
   * 
   * @return a {@code List} of {@code T} objects.
   */
  public List<T> list() {
    ArrayList<T> resultList = new ArrayList<T>();
    try {
      PreparedStatement createStatement = connect.prepareStatement("SELECT * from " + tableName);

      ResultSet results = createStatement.executeQuery();

      while (results.next()) {
        resultList.add(this.findById(results.getInt(pkName)));
      }
    } catch (SQLException e) {
      System.err.println("An error happened while reading from " + tableName + " DB table.");
    }
    return resultList;
  }
}
