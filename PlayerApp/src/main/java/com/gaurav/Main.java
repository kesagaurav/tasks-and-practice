package com.gaurav;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.gaurav.crud.service.PlayerCrudSearch;
import com.gaurav.crud.service.impl.PlayerCrudServiceImpl;
import com.gaurav.dao.TeamDao;
import com.gaurav.dao.impl.TeamDaoImpl;
import com.gaurav.exception.BusinessException;
import com.gaurav.model.Player;
import com.gaurav.model.Team;
import com.gaurav.search.service.SerachService;
import com.gaurav.search.service.impl.PlayerSearchImpl;

public class Main {

	private static Logger log = Logger.getLogger(Main.class);

	public static void main(String[] args) {

		log.info("\n Hi Welcome to the console based application of gaurav player app");
		log.info("===============================================");
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		TeamDao td=new TeamDaoImpl();
		PlayerCrudSearch pcs=new PlayerCrudServiceImpl();
		
		do {
			log.info("1) create an player");
			log.info("2) update an player");
			log.info("3) delete an player");
			log.info("4) list all the players");
			log.info("5) serach players based upon the name,age,gender,city,sportsName");
			log.info("6)Exit from the app");
			log.info("\n plz select an option from (1-6)");
			try {
				ch = Integer.parseInt((sc.nextLine()));
			} catch (NumberFormatException e) {
			
			}
			switch (ch) {
			case 1:
				log.info("\n plz add the players in the given below details");
				Player player = new Player();
				try {
					System.out.println("Enter player id:");
					player.setPlayer_id(Integer.parseInt(sc.nextLine()));

				} catch (NumberFormatException e) {
					System.out.println("Player id should be number only");
					break;
				}
				try {
					System.out.println("Enter player age:");
					player.setAge(Integer.parseInt(sc.nextLine()));
				} catch (NumberFormatException e) {
					System.out.println("Player age should be number only");
					break;
				}
				System.out.println("Enter Player Name");
				player.setName(sc.nextLine());
				System.out.println("Enter Player City");
				player.setCity(sc.nextLine());
				System.out.println("Enter Player Gender(m/f/F/M)");
				player.setGender(sc.nextLine());
				log.info("plz enter sportsName");
				player.setSportsName(sc.nextLine());
				System.out.println("Please select the teamNumber from the below list");
				try {
					List<Team> teamList = td.getAllTeams();
					for (int i = 0; i < teamList.size(); i++) {
						System.out.println((i + 1) + ")" + teamList.get(i).getTeamName());					}
					System.out.println(teamList.size() + 1 + ")Not preffered for now");

					try {
						System.out.println("Please enter your team choice between 1 - " + (teamList.size() + 1));
						int choice = Integer.parseInt(sc.nextLine());

						if (choice > 0 && choice <= teamList.size() + 1) {
							if (choice == teamList.size() + 1) {
								player.setTeam(new Team());
							} else {
								player.setTeam(teamList.get(choice - 1));
							}
						} else {
							System.out.println("Invalid choice");
						}

					} catch (NumberFormatException e) {
						System.out.println("Player team choice should be number only");
						break;
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
					break;
				}
				try {
					if (pcs.createPlayer(player) == 1) {
						System.out.println("Player Registered Successfully with below details");
						System.out.println(player);
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 2:
				log.info("update an player with the following details");
				try {
					log.info("\n plz enter player id");
					int player_id=Integer.parseInt(sc.nextLine());
					log.info("\n plz enter contact details");
					long contact=Long.parseLong(sc.nextLine());
					log.info(pcs.updatePlayer(player_id, contact));
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				log.info("\n delete an player with following details");
				try {
					log.info("\n plz enter the id to delete");
					int player_id=Integer.parseInt(sc.nextLine());
					log.info(pcs.DeletePlayer(player_id));
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 4:
				log.info("\n here we will show all the details of the players");
				try {
					log.info(pcs.getAllPlayers());
				} catch (BusinessException e2) {
					System.out.println(e2.getMessage());
				}
				
				break;
			case 5:
				log.info("\n under construction");
				int option = 0;
				SerachService ss = new PlayerSearchImpl();
				do {
					log.info("1)search by id");
					log.info("2)search by name");
					log.info("3)search by age");
					log.info("4)search by gender");
					log.info("5)search by city");
					log.info("6)search by sportsName");
					log.info("7)search by contact");
					log.info("8)search by teamName");
					log.info("9) go back to main menu");
					log.info("\n plz select an option from (1-9)");
					try {
						option = Integer.parseInt(sc.nextLine());
					} catch (NumberFormatException e) {
					}
					switch (option) {
					case 1:
						log.info("\n enter palyer id with details");
						try {
							int player_id = Integer.parseInt(sc.nextLine());
							Player player1 = ss.getPlayerById(player_id);
							if (player1 != null) {
								log.info("\n player with  this " + player_id + " is found");
								log.info(player1);
							}
						} catch (NumberFormatException e) {
							log.warn("\n player is not found with ");
						} catch (BusinessException e) {
							log.info(e.getMessage());
						}
						break;
					case 2:
						log.info("Enter the name to get the player");
						String name = sc.nextLine();
						try {
							List<Player> playerList1 = ss.getPlayersByName(name);
							if (playerList1 != null && playerList1.size() > 0) {
								log.info("Total there are " + playerList1.size()
										+ " number of players iplaying for the team " + name.toUpperCase()
										+ " printing the players");
								for (Player player1 : playerList1) {
									log.info(player1);
								}
							}
						} catch (BusinessException e1) {
							log.warn(e1.getMessage());
						}
						break;
					case 3:
						log.info("Enter the age to get the Players for that Team");
						int age = Integer.parseInt(sc.nextLine());
						try {
							List<Player> playerList = ss.getPlayersByAge(age);
							if (playerList != null && playerList.size() > 0) {
								log.info("Total there are " + playerList.size()
										+ " number of players iplaying for the team " + age + " printing the players");
								for (Player player1 : playerList) {
									log.info(player1);
								}
							}
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}
						break;
					case 4:
						log.info("Enter the gender to get the Players for that Team");
						String gender = sc.nextLine();
						try {
							List<Player> playerList = ss.getPlayersByGender(gender);
							if (playerList != null && playerList.size() > 0) {
								log.info("Total there are " + playerList.size()
										+ " number of players iplaying for the team " + gender.toUpperCase()
										+ " printing the players");
								for (Player player1 : playerList) {
									log.info(player1);
								}
							}
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}
						break;
					case 5:
						log.info("Enter the city to get the Players for that Team");
						String city = sc.nextLine();
						try {
							List<Player> playerList = ss.getPlayersByCity(city);
							if (playerList != null && playerList.size() > 0) {
								log.info("Total there are " + playerList.size()
										+ " number of players iplaying for the team " + city.toUpperCase()
										+ " printing the players");
								for (Player player1 : playerList) {
									log.info(player1);
								}
							}
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}
						break;
					case 6:
						log.info("Enter the sportsName to get the player");
						String sportsName = sc.nextLine();
						try {
							List<Player> playerList1 = ss.getPlayersBySportsName(sportsName);
							if (playerList1 != null && playerList1.size() > 0) {
								log.info("Total there are " + playerList1.size()
										+ " number of players iplaying for the team " + sportsName.toUpperCase()
										+ " printing the players");
								for (Player player1 : playerList1) {
									log.info(player1);
								}
							}
						} catch (BusinessException e1) {
							log.warn(e1.getMessage());
						}

						break;
					case 7:
						log.info("\n enter palyer contact with details");
						try {
							long contact = Long.parseLong(sc.nextLine());
							Player player1 = ss.getPlayerByContact(contact);
							if (player1 != null) {
								log.info("\n player with  this " + contact + " is found");
								log.info(player1);
							}
						} catch (NumberFormatException e) {
							log.warn("\n player is not found with ");
						} catch (BusinessException e) {
							log.info(e.getMessage());
						}
						break;
					case 8:
						log.info("Enter the TeamName to get the Players for that Team");
						String teamName = sc.nextLine();
						try {
							List<Player> playerList = ss.getPlayersByTeamName(teamName);
							if (playerList != null && playerList.size() > 0) {
								log.info("Total there are " + playerList.size()
										+ " number of players iplaying for the team " + teamName.toUpperCase()
										+ " printing the players");
								for (Player player1 : playerList) {
									log.info(player1);
								}
							}
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}

						break;
					case 9:
						log.info("\n going back to main menu");
						break;
					default:
						log.info("\n invalid choice");
						break;
					}
				} while (option != 9);
				break;
			case 6:
				log.info("\n thank you for choosing the gaurav shopping app plz visit again and also "
						+ "if any product is not good plz feedback us :)");
				break;
			default:
				log.info("it is an invalid choice plz choose the option between 1 to 6");
				break;
			}
		} while (ch != 6);

	}

}
