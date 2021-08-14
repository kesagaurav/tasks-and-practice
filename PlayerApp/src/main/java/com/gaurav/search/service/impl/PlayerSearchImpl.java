package com.gaurav.search.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.gaurav.dao.PlayerSearchDao;
import com.gaurav.dao.impl.PlayerSearchDaoImpl;
import com.gaurav.exception.BusinessException;
import com.gaurav.model.Player;
import com.gaurav.search.service.SerachService;

public class PlayerSearchImpl implements SerachService {

	private PlayerSearchDao playerDao = new PlayerSearchDaoImpl();

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		if (id < 100 || id > 1000) {
			throw new BusinessException("Invalid Player Id " + id);
		} else {
			// code here to DAO
			player = playerDao.getPlayerById(id);

		}
		return player;
	}

	@Override
	public Player getPlayerByContact(long contact) throws BusinessException {
		Player player = null;
		
			// code here to DAO
			player = playerDao.getPlayerByContact(contact);

		
		return player;
	}

	@Override
	public List<Player> getPlayersByName(String name) throws BusinessException {
		List<Player> playerList = null;
		if (name.matches("[a-zA-Z]{2,10}")) {
			// code here for dao
			playerList = playerDao.getPlayersByName(name);
		} else {
			throw new BusinessException("Invalid team name : " + name);
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersByTeamName(String teamName) throws BusinessException {
		List<Player> playerList = null;
		if (teamName.matches("[a-zA-Z]{2,10}")) {
			// code here for dao
			playerList = playerDao.getPlayersByTeamName(teamName);
		} else {
			throw new BusinessException("Invalid team name : " + teamName);
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		List<Player> playerList = null;
	if(age>=18 && age<100) {
			// code here for dao
			playerList = playerDao.getPlayersByAge(age);
		} else {
			throw new BusinessException("Invalid age  : " +age);
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersBySportsName(String sportsName) throws BusinessException {

		List<Player> playerList = null;
		if (sportsName.matches("[a-zA-Z]{2,10}")) {
			// code here for dao
			playerList = playerDao.getPlayersBySportsName(sportsName);
		} else {
			throw new BusinessException("Invalid team name : " + sportsName);
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersByCity(String city) throws BusinessException {
		List<Player> playerList = null;
		if (city.matches("[a-zA-Z]{2,10}")) {
			// code here for dao
			playerList = playerDao.getPlayersByCity(city);
		} else {
			throw new BusinessException("Invalid team name : " + city);
		}
		return playerList;
	}

	

	@Override
	public List<Player> getPlayersByGender(String gender) throws BusinessException {
		List<Player> playerList = null;
		if (gender.matches("[m,f]{1}")) {
			// code here for dao
			playerList = playerDao.getPlayersByGender(gender);
		} else {
			throw new BusinessException("Invalid team name : " + gender);
		}
		return playerList;
	}

	}


