package com.gaurav.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gaurav.dao.PlayerDao;
import com.gaurav.dbutil.mySqlDbConnection;
import com.gaurav.exception.BusinessException;
import com.gaurav.model.Player;

public class PlayerDaoImpl implements PlayerDao {

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> playerList = new ArrayList<>();
		try (Connection con = mySqlDbConnection.getConnection()) {
			String sql = " select player_id,name,age,gender,city,sportsName,contact from player";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Player p = new Player();
				p.setPlayer_id(rs.getInt("player_id"));
				p.setName(rs.getString("name"));
				p.setAge(rs.getInt("age"));
				p.setGender(rs.getString("gender"));
				p.setCity(rs.getString("city"));
				p.setSportsName(rs.getString("sportsName"));
				p.setContact(rs.getLong("contact"));
				playerList.add(p);

			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
			throw new BusinessException("internal server has occured plz contact the system admin");
		}
		return playerList;
	}

	@Override
	public int updatePlayer(int player_id, long contact) throws BusinessException {
		int a=0;
		try(Connection con=mySqlDbConnection.getConnection()){
			String sql="update player set contact=? where player_id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setLong(1,contact);
			ps.setInt(2,player_id);
			a=ps.executeUpdate();
			System.out.println("\n record updated " + a);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

	@Override
	public int DeletePlayer(int player_id) throws BusinessException {
		int a=0;
		try(Connection con=mySqlDbConnection.getConnection()){
			String sql="delete from player where player_id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,player_id);
			a=ps.executeUpdate();
			System.out.println("\n deleted record  successfully" + a);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BusinessException("could not delete the record plz check the id you give is correct or not");

			
		}
		return a;
	}

	@Override
	public int createPlayer(Player p) throws BusinessException {

		int c=0;
		try(Connection connection=mySqlDbConnection.getConnection()){
			String sql="insert into player(player_id,name,age,gender,city,sportsName,contact) values(?,?,?,?,?,?,?)";
			
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, p.getPlayer_id());
			preparedStatement.setString(2, p.getName());
			preparedStatement.setInt(3, p.getAge());
			preparedStatement.setString(4, p.getGender());
			preparedStatement.setString(5, p.getCity());
			preparedStatement.setString(6, p.getSportsName());
			preparedStatement.setLong(7, p.getContact());
			
			c=preparedStatement.executeUpdate();
			System.out.println("\n successfully inserted " + c);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured, please contact support");
		}
		return c;
		
	}

}
