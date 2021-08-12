package com.gaurav.main;

import java.util.List;

import com.gaurav.dao.PlayerDao;
import com.gaurav.dao.impl.PlayerDaoImpl;
import com.gaurav.exception.BusinessException;
import com.gaurav.model.Player;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to List all the players
		PlayerDao pd=new PlayerDaoImpl();
		
		try {
			List<Player> playerList=pd.getAllPlayers();
			playerList.stream().forEach(e->System.out.println(e));
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		// create an players
		Player p=new Player(108,"sachin",23,"m","delhi","vollyball",12345678910L);
		Player p1=new Player(109,"ganguly",26,"m","mumbai","footbal",1112131415161718192L);
		
		try {
			if(pd.createPlayer(p)==1) {
				System.out.println("\n successfuly inserted ");
				System.out.println(p);
			}
			if(pd.createPlayer(p1)==1) {
				System.out.println("\n successfully inserted ");
				System.out.println(p1);
			}
		} catch (BusinessException e1) {
		System.out.println(e1.getMessage());
		}
		
		
		
	// this is for update
		try {
			int player_id=104;
			long contact=123891891809L;
			System.out.println(pd.updatePlayer(player_id, contact));
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		//  this is for delete
		try {
			int player_id=105;
			System.out.println(pd.DeletePlayer(player_id));
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
