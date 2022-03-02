package DataAccessObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import config.DatabaseConfig;
import domain.Movie;

public class MovieDAO {

	private Statement statement;
	private Connection connection;

	
	//CREATE statement
	public MovieDAO() throws SQLException {
		this.connection = DriverManager.getConnection(DatabaseConfig.url, DatabaseConfig.username,
				DatabaseConfig.password);
		this.statement = connection.createStatement();
	}
	
	
	// CREATE Statement
	public void create(Movie movie) {
		try {
			statement.executeUpdate("INSERT INTO Movie" + "(`Name`, `Genre`, `Rating`) " 
					+ "VALUES ('" 
					+ movie.getName()
					+ "', '" + movie.getGenre() 
					+ "', " + movie.getRating() + " )");
			System.out.println(readLatest(1));
//					+ movie.isIsSeries() + "' ) ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//CREATE PREPARED statement
	public void createPrepared(Movie movie) {
		try {
			PreparedStatement statement = connection.prepareStatement
				("INSERT INTO movies VALUES (`name`,`genre`,`rating`)" 
					+ "(?,?,?)");
			statement.setString(1, movie.getName());
			statement.setString(2, movie.getGenre());
			statement.setInt(3, movie.getRating());
			statement.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//UPDATE Statement
	public void update(Movie movie, int id) {
		try {
			statement.executeUpdate("UPDATE FROM Movie WHERE id =" 
					+ movie.getName() 
					+ "', '" 
					+ movie.getGenre() 
					+ "', " 
					+ movie.getRating() 
					+ "WHERE Id = " + id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//UPDATE PREPARED Statement
	public void updatePrepared(Movie movie, int id) {
		try {
			PreparedStatement statement = connection.prepareStatement
				("UPDATE movies VALUES name = ?, genre = ?,rating = ? WHERE id = ?");
			statement.setString(1, movie.getName());
			statement.setString(2, movie.getGenre());
			statement.setInt(3, movie.getRating());
			statement.setInt(4, id);
			statement.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	// DELETE Statement
	public void delete(int id) {
		try {
			statement.executeUpdate("DELETE FROM Movie WHERE id =" + id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//DELETE PREPARED Statement
	public void deletePrepared (int id) {
		try {
			PreparedStatement statement = connection.prepareStatement("DELETE FROM movies WHERE id = ?"); 
			statement.setInt(1, id);
			statement.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//RESULTSET
	public Movie movieFromResultSet(ResultSet resultSet) throws SQLException {
		int id = resultSet.getInt("id");
		String name = resultSet.getString("name");
		String genre = resultSet.getString("genre");
		int rating = resultSet.getInt("rating");
		
		return new Movie(id, name, genre, rating);
	}
	
	
	//READALL Statement
	public List<Movie> realAll() {
		try {
		ResultSet resultSet = statement.executeQuery("SELECT * FROM movie"); 
			List<Movie> movies = new ArrayList<>();
			while(resultSet.next()) {
				movies.add(movieFromResultSet(resultSet));
			}
			return movies;
		}
			catch (SQLException e) {
				e.printStackTrace();
			}
		return null;
	}
	
	
	//READBYID statement
	public Movie readById(int id) {
		try { 
			ResultSet resultSet = statement.executeQuery("SELECT * FROM movie WHERE id =" + id);
				resultSet.next();
				return movieFromResultSet(resultSet);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	//READBYID PREPARED
	public Movie readByIdPrepared(int id) {
		try {
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM movie WHERE id = ?");
			statement.setInt(1, id);
			
			ResultSet resultSet = statement.executeQuery();
			resultSet.next();
			return movieFromResultSet(resultSet);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	//READLATEST statement
	public Movie readLatest(int id) {
		try {
			ResultSet resultSet = statement.executeQuery("SELECT * FROM movie ORDER BY id DESC LIMIT 1");
				resultSet.next();
				return movieFromResultSet(resultSet);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public Statement getStatement() {
		return statement;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
}