package Game;
import java.util.*;

import static Game.PointsGenerationService.generatePoints;

public class BoardService {
    private Board board;
    private boolean isComplete;
    private int noOfPlayers;
    private Queue<Player> players;
    private int noOfDices;

    static int capacity = 100;

   public BoardService(int size ){
      this.board = new Board(size);
      this.players = new LinkedList<>() ;
      this.noOfDices = 1;
   }

    public int getNoOfDices() {
        return noOfDices;
    }

    public void setNoOfDices(int noOfDices) {
        this.noOfDices = noOfDices;
    }

    public void initiateSnakes(List<Snake> snakes){
       this.board.setSnakeList(snakes);
    }

    public void initiatePipes(List<Pipe> pipes){
        this.board.setPipeList(pipes);
    }

    public void initiatePlayers(List<Player> players){
       this.players = new LinkedList<>();
       this.noOfPlayers = players.size();
       HashMap<String, Integer> hm =new HashMap<>();

       for(int i=0;i<players.size();i++){
           this.players.add(players.get(i));
           hm.put(players.get(i).getUserId(),0);
       }
    }

    public int getDiceRoll(){
       return generatePoints();
    }

    public boolean isComplete(){

        int currentPlayers = players.size();
        return currentPlayers < noOfPlayers;
    }

    public void startGame(){

       while(!isComplete()){
           Player player1 = players.poll();
           int diceValue = getDiceRoll();
       }
    }

    public void moveSteps(Player player, int moves){
       int oldPos = board.getPlayers().get(player.getUserId());
       int newPos = oldPos + moves;


    }


}
