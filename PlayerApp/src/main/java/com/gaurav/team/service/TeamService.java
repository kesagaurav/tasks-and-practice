package com.gaurav.team.service;

import java.util.List;

import com.gaurav.exception.BusinessException;
import com.gaurav.model.Team;

public interface TeamService {
	public Team createTeam(Team team) throws BusinessException;
	public List<Team> getAllTeams() throws BusinessException;
	public List<Team> getTeamsByName(String teamName) throws BusinessException;
}
