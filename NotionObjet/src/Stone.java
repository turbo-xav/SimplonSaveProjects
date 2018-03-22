
public class Stone {
	private boolean firstPlayer;
    public Stone(boolean firstPlayer) {
            this.firstPlayer= firstPlayer;
    }
    public boolean isFirstPlayer() {
            return firstPlayer;
    }
    public void setFirstPlayer(boolean firstPlayer) {
            this.firstPlayer= firstPlayer;
    }
    public String toString() {
            return firstPlayer ? "O":"X";
    }
    
    public Stone() {
    	
    }
}
