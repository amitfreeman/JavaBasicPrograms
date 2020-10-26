package com.DataStructure;
import java.util.*;

//Write your Checker class here
class Checker implements Comparator<Player>{
	
	@Override
	public int compare(Player arg0, Player arg1) {
		// TODO Auto-generated method stub
		int diff=arg1.score-arg0.score;
		if(diff==0) {
		   return arg0.name.compareTo(arg1.name);	
		}
		else {
			return diff;
		}
	}
}

class Player{
 String name;
 int score;
 
 Player(String name, int score){
     this.name = name;
     this.score = score;
 }
}

class SolutionComparator {

 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();

     Player[] player = new Player[n];
     Checker checker = new Checker();
     
     for(int i = 0; i < n; i++){
         player[i] = new Player(scan.next(), scan.nextInt());
     }
     scan.close();
  
     Arrays.sort(player, checker);
     for(int i = 0; i < player.length; i++){
         System.out.printf("%s %s\n", player[i].name, player[i].score);
     }
 }
}