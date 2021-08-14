package com.gaurav.crud.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.gaurav.crud.service.PlayerCrudSearch;
import com.gaurav.dao.CrudDao;
import com.gaurav.dao.impl.CrudDaoImpl;
import com.gaurav.exception.BusinessException;
import com.gaurav.model.Player;

public class PlayerCrudServiceImpl implements PlayerCrudSearch {

	CrudDao cd=new CrudDaoImpl();
	
	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> playerList=new ArrayList<>();
		return cd.getAllPlayers();
	}

	@Override
	public int createPlayer(Player p) throws BusinessException {

		return cd.createPlayer(p);
	}

	@Override
	public int updatePlayer(int player_id, long contact) throws BusinessException {

		return cd.updatePlayer(player_id, contact) ;
	}

	@Override
	public int DeletePlayer(int player_id) throws BusinessException {
	
		return cd.DeletePlayer(player_id);
	}

}
