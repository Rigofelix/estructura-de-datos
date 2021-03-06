import listasLigadas.LinkedList;

public class DraftList {
	private LinkedList<String> daList;
	
	public DraftList() {
		daList = new LinkedList<String>();
	}
	
	public void addPlayer(String name) {
		daList.add(name);
	}
	
	public void removePlayer(String name) {
		daList.remove(name);
		
		
	}
	
	public void increaseRank(String name, int rank) {
		if(daList.contains(name)) {
			daList.remove(name);
			daList.add(rank - 1, name);
		}
	}
	
	public void shiftRank(String player1, String player2) {
		if(daList.contains(player1) && daList.contains(player2)) {
			int indexPlayer1 = daList.indexOf(player1);
			int indexPlayer2 = daList.indexOf(player2);
			
			daList.set(indexPlayer1, player1);
			daList.set(indexPlayer2, player1);
		}
	}
	
	public String toString() {
		if(daList.isEmpty()) {
			return "The draft list is empty";
		}
		
		String returnValue = "";
		for(int i=0; i<daList.size(); i++) {
			returnValue += (i+1) + "."+ daList.get(i)+ "\n";
		}
		return returnValue;
	}

}
