package com.gaurav.dao;

import java.util.List;

import com.gaurav.exception.BusinessException;
import com.gaurav.model.Team;

public interface TeamDao {
	public Team createTeam(Team team) throws BusinessException;
	public List<Team> getAllTeams() throws BusinessException;
	public List<Team> getTeamsByName(String teamName) throws BusinessException;
}
