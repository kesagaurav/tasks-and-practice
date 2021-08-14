package com.gaurav.crud.service;

import java.util.List;

import com.gaurav.exception.BusinessException;
import com.gaurav.model.Player;

public interface PlayerCrudSearch {
	public List<Player> getAllPlayers() throws BusinessException;
	public int  createPlayer(Player p) throws BusinessException;
	public int updatePlayer(int player_id,long contact)throws BusinessException;
	public int DeletePlayer(int player_id)throws BusinessException;
	
}
