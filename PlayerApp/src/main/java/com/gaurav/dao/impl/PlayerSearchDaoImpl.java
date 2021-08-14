package com.gaurav.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.gaurav.dao.PlayerSearchDao;
import com.gaurav.exception.BusinessException;
import com.gaurav.model.Player;
import com.gaurav.model.Team;
import com.gaurav.util.MysqlDbConnection;

public class PlayerSearchDaoImpl implements PlayerSearchDao {
	private static Logger log = Logger.getLogger(PlayerSearchDaoImpl.class);

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		try (Connection connection = MysqlDbConnection.getConnection()) {
			String sql = "select p.player_id,name,age,city,gender,sportsName,contact,teamName,team_id from player p JOIN team t on p.team_id=t.id where p.player_id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				player = new Player();
				player.setPlayer_id(id);
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setContact(resultSet.getLong("contact"));
				Team team = new Team();
				team.setId(resultSet.getInt("team_id"));
				team.setTeamName(resultSet.getString("teamName"));
				player.setTeam(team);
			} else {
				throw new BusinessException("Entered player id " + id + " doesnt exist");
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return player;

	}

	@Override
	public Player getPlayerByContact(long contact) throws BusinessException {
		Player player = null;
		try (Connection connection = MysqlDbConnection.getConnection()) {
			String sql = "select p.player_id,name,age,city,gender,sportsName,contact,teamName,team_id from player p JOIN team t on p.team_id=t.id where p.contact=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, contact);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				player = new Player();
				player.setPlayer_id(resultSet.getInt("player_id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setContact(contact);
				Team team = new Team();
				team.setId(resultSet.getInt("team_id"));
				team.setTeamName(resultSet.getString("teamName"));
				player.setTeam(team);
			} else {
				throw new BusinessException("Entered player id " + contact + " doesnt exist");
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return player;

	}

	@Override
	public List<Player> getPlayersByName(String name) throws BusinessException {
		List<Player> playerList = new ArrayList<>();
		try (Connection connection = MysqlDbConnection.getConnection()) {
			String sql = "select p.player_id,name,age,gender,city,sportsName,contact,teamName,team_id from player p JOIN team t on p.team_id=t.id where p.name=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,name);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Player player = new Player();
				player.setPlayer_id(resultSet.getInt("player_id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setContact(resultSet.getLong("contact"));
				Team team = new Team();
				team.setId(resultSet.getInt("team_id"));
				team.setTeamName(resultSet.getString("teamName"));
				player.setTeam(team);
				playerList.add(player);
			}

			if (playerList.size() == 0) {
				log.warn("no players with team " + name);
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersByTeamName(String teamName) throws BusinessException {
		List<Player> playerList = new ArrayList<>();
		try (Connection connection = MysqlDbConnection.getConnection()) {
			String sql = "select p.player_id,name,age,gender,city,sportsName,contact,teamName,team_id from player p JOIN team t on p.team_id=t.id where t.teamName=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, teamName);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Player player = new Player();
				player.setPlayer_id(resultSet.getInt("player_id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setContact(resultSet.getLong("contact"));
				Team team = new Team();
				team.setId(resultSet.getInt("team_id"));
				team.setTeamName(resultSet.getString("teamName"));
				player.setTeam(team);
				playerList.add(player);
			}

			if (playerList.size() == 0) {
				log.warn("no players with team " + teamName);
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		List<Player> playerList = new ArrayList<>();
		try (Connection connection = MysqlDbConnection.getConnection()) {
			String sql = "select p.player_id,name,age,gender,city,sportsName,contact,teamName,team_id from player p JOIN team t on p.team_id=t.id where p.age=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,age);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Player player = new Player();
				player.setPlayer_id(resultSet.getInt("player_id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setContact(resultSet.getLong("contact"));
				Team team = new Team();
				team.setId(resultSet.getInt("team_id"));
				team.setTeamName(resultSet.getString("teamName"));
				player.setTeam(team);
				playerList.add(player);
			}

			if (playerList.size() == 0) {
				log.warn("no players with team " + age);
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersBySportsName(String sportsName) throws BusinessException {
		
		List<Player> playerList = new ArrayList<>();
		try (Connection connection = MysqlDbConnection.getConnection()) {
			String sql = "select p.player_id,name,age,gender,city,sportsName,contact,teamName,team_id from player p JOIN team t on p.team_id=t.id where p.sportsName=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,sportsName);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Player player = new Player();
				player.setPlayer_id(resultSet.getInt("player_id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setContact(resultSet.getLong("contact"));
				Team team = new Team();
				team.setId(resultSet.getInt("team_id"));
				team.setTeamName(resultSet.getString("teamName"));
				player.setTeam(team);
				playerList.add(player);
			}

			if (playerList.size() == 0) {
				log.warn("no players with team " + sportsName);
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersByCity(String city) throws BusinessException {
		List<Player> playerList = new ArrayList<>();
		try (Connection connection = MysqlDbConnection.getConnection()) {
			String sql = "select p.player_id,name,age,gender,city,sportsName,contact,teamName,team_id from player p JOIN team t on p.team_id=t.id where p.city=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,city);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Player player = new Player();
				player.setPlayer_id(resultSet.getInt("player_id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setContact(resultSet.getLong("contact"));
				Team team = new Team();
				team.setId(resultSet.getInt("team_id"));
				team.setTeamName(resultSet.getString("teamName"));
				player.setTeam(team);
				playerList.add(player);
			}

			if (playerList.size() == 0) {
				log.warn("no players with team " + city);
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersByGender(String gender) throws BusinessException {
		List<Player> playerList = new ArrayList<>();
		try (Connection connection = MysqlDbConnection.getConnection()) {
			String sql = "select p.player_id,name,age,gender,city,sportsName,contact,teamName,team_id from player p JOIN team t on p.team_id=t.id where p.gender=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,gender);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Player player = new Player();
				player.setPlayer_id(resultSet.getInt("player_id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setContact(resultSet.getLong("contact"));
				Team team = new Team();
				team.setId(resultSet.getInt("team_id"));
				team.setTeamName(resultSet.getString("teamName"));
				player.setTeam(team);
				playerList.add(player);
			}

			if (playerList.size() == 0) {
				log.warn("no players with team " + gender);
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return playerList;
		
	}

}
