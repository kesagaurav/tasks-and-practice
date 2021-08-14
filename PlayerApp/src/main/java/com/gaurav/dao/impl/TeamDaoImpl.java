package com.gaurav.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.gaurav.dao.TeamDao;
import com.gaurav.exception.BusinessException;
import com.gaurav.model.Team;
import com.gaurav.util.MysqlDbConnection;

public class TeamDaoImpl implements TeamDao{

	
	private static Logger log = Logger.getLogger(TeamDaoImpl.class);
	
	@Override
	public Team createTeam(Team team) throws BusinessException {
		try (Connection connection = MysqlDbConnection.getConnection()) {
			String sql="insert into team(teamName) values(?)";
			PreparedStatement  preparedStatement =connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, team.getTeamName());
			
			int c=preparedStatement.executeUpdate();
			if(c==1) {
				ResultSet resultSet=preparedStatement.getGeneratedKeys();
				if(resultSet.next()) {
					team.setId(resultSet.getInt(1));
				}
			}
	} catch (Exception e) {
		System.out.println(e);
		throw new BusinessException("Internal Error occured contact sysadmin");
	}

	return team;
	}


	
	

	@Override
	public List<Team> getAllTeams() throws BusinessException {
		List<Team> teamList=new ArrayList<>();
		try (Connection connection = MysqlDbConnection.getConnection()) {
			String sql="select id,teamName from team";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Team team=new Team();
				team.setId(resultSet.getInt("id"));
				team.setTeamName(resultSet.getString("teamName"));
				teamList.add(team);
			}
		} catch (Exception e) {
			System.out.println(e);
			throw new BusinessException("Internal Error occured contact sysadmin");
		}
		return teamList;
	}

	@Override
	public List<Team> getTeamsByName(String teamName) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
