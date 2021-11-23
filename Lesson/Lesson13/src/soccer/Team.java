package soccer;

import java.util.ArrayList;
import java.util.Random;

public class Team {
    ArrayList<Player> allPlayers = new ArrayList<>();
    ArrayList<Player> selectedTeam = new ArrayList<>();
    ArrayList<Player> listPlayers = getAllPlayers();
    Random general = new Random();
    int gateKeeperSize = 0;
    int defenderSize = 0;
    int midFieldSize = 0;
    int forwarderSize = 0;
    public ArrayList<Player> getAllPlayers() {

        allPlayers.add(new Player(1, "Alisson", Position.GK));
        allPlayers.add(new Player(1, "Donnaruma", Position.GK));
        allPlayers.add(new Player(1, "Thibaut Courtoirs", Position.GK));
        allPlayers.add(new Player(5, "Sergio Ramos", Position.DF));
        allPlayers.add(new Player(6, "Sergio Busquets", Position.DF));
        allPlayers.add(new Player(3, "Virgil Van Dijk", Position.DF));
        allPlayers.add(new Player(16, "Giorgio Chiellini", Position.DF));
        allPlayers.add(new Player(4, "Kalidou Koulibaly", Position.DF));
        allPlayers.add(new Player(11, "Paul Pogba", Position.MF));
        allPlayers.add(new Player(10, "Andrea Pirlo", Position.MF));
        allPlayers.add(new Player(10, "Luka Modric", Position.MF));
        allPlayers.add(new Player(11, "Paul Pogba", Position.MF));
        allPlayers.add(new Player(5, "N'Golo Kanté", Position.MF));
        allPlayers.add(new Player(7, "Kevin De Bruyne", Position.MF));
        allPlayers.add(new Player(10, "Lionel Messi", Position.FW));
        allPlayers.add(new Player(7, "Cristiano Ronaldo", Position.FW));
        allPlayers.add(new Player(8, "Robert Lewandowski", Position.FW));
        allPlayers.add(new Player(13, "Kylian Mbappé", Position.FW));
        allPlayers.add(new Player(22, "Romelo Lukaku", Position.FW));

        return allPlayers;



    }



    public void team1 () {

        selectedTeam = new ArrayList<Player>();
        System.out.println("Danh sách cầu thủ");
        while (gateKeeperSize < 1 ) {
            int rdGateKeeper = general.nextInt(19);
            if (listPlayers.get(rdGateKeeper).getPosition().equals(Position.GK)) {
                selectedTeam.add(listPlayers.get(rdGateKeeper));
                gateKeeperSize++;
            }
        }
        while (defenderSize < 4) {
            int rdDefender = general.nextInt(19);
            if (listPlayers.get(rdDefender).getPosition().equals(Position.DF)
                    && !selectedTeam.contains(listPlayers.get(rdDefender)) ) {
                selectedTeam.add(listPlayers.get(rdDefender));
                defenderSize++;
            }
        }

        while (midFieldSize < 4) {
            int rdMidfielder = general.nextInt(19);
            if (listPlayers.get(rdMidfielder).getPosition().equals(Position.MF)
                    && !selectedTeam.contains(listPlayers.get(rdMidfielder)) ) {
                selectedTeam.add(listPlayers.get(rdMidfielder));
                midFieldSize++;
            }
        }
        while (forwarderSize < 2) {
            int rdForwarder = general.nextInt(19);
            if (listPlayers.get(rdForwarder).getPosition().equals(Position.FW)
                    && !selectedTeam.contains(listPlayers.get(rdForwarder)) ) {
                selectedTeam.add(listPlayers.get(rdForwarder));
                forwarderSize++;
            }
        }
        for (Player p : selectedTeam) {
            System.out.println(p);
        }
    }

    public void team2 () {


        selectedTeam = new ArrayList<Player>();
        System.out.println("Danh sách cầu thủ");
        while(gateKeeperSize < 1) {
            int rdGateKeeper = general.nextInt(19);
            if (listPlayers.get(rdGateKeeper).getPosition().equals(Position.GK)) {
                selectedTeam.add(listPlayers.get(rdGateKeeper));
                gateKeeperSize++;
            }
        }

        while (defenderSize < 4) {
            int rdDefender = general.nextInt(19);
            if (listPlayers.get(rdDefender).getPosition().equals(Position.DF)
                    && !selectedTeam.contains(listPlayers.get(rdDefender)) ) {
                selectedTeam.add(listPlayers.get(rdDefender));
                defenderSize++;
            }
        }

        while (midFieldSize < 3) {
            int rdMidfielder = general.nextInt(19);
            if (listPlayers.get(rdMidfielder).getPosition().equals(Position.MF)
                    && !selectedTeam.contains(listPlayers.get(rdMidfielder)) ) {
                selectedTeam.add(listPlayers.get(rdMidfielder));
                midFieldSize++;
            }
        }

        while (forwarderSize < 3) {
            int rdForwarder = general.nextInt(19);
            if (listPlayers.get(rdForwarder).getPosition().equals(Position.FW)
                    && !selectedTeam.contains(listPlayers.get(rdForwarder)) ) {
                selectedTeam.add(listPlayers.get(rdForwarder));
                forwarderSize++;
            }
        }

        for (Player p: selectedTeam) {
            System.out.println(p);
        }
    }

    public void team3 () {


        selectedTeam = new ArrayList<Player>();
        System.out.println("Danh sách cầu thủ");
        while (gateKeeperSize < 1 ) {
            int rdGateKeeper = general.nextInt(19);
            if (listPlayers.get(rdGateKeeper).getPosition().equals(Position.GK)) {
                selectedTeam.add(listPlayers.get(rdGateKeeper));
                gateKeeperSize++;
            }
        }
        while (defenderSize < 3) {
            int rdDefender = general.nextInt(19);
            if (listPlayers.get(rdDefender).getPosition().equals(Position.DF)
                    && !selectedTeam.contains(listPlayers.get(rdDefender)) ) {
                selectedTeam.add(listPlayers.get(rdDefender));
                defenderSize++;
            }
        }

        while (midFieldSize < 5) {
            int rdMidfielder = general.nextInt(19);
            if (listPlayers.get(rdMidfielder).getPosition().equals(Position.MF)
                    && !selectedTeam.contains(listPlayers.get(rdMidfielder)) ) {
                selectedTeam.add(listPlayers.get(rdMidfielder));
                midFieldSize++;
            }
        }
        while (forwarderSize < 2) {
            int rdForwarder = general.nextInt(19);
            if (listPlayers.get(rdForwarder).getPosition().equals(Position.FW)
                    && !selectedTeam.contains(listPlayers.get(rdForwarder)) ) {
                selectedTeam.add(listPlayers.get(rdForwarder));
                forwarderSize++;
            }
        }
        for (Player p : selectedTeam) {
            System.out.println(p);
        }
    }


}
