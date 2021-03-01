
public class Piece {
	private String position;
	private String color;
	
	public Piece(String color) {
		setColor(color);
	}
	public void setPosition(String newPosition){
		this.position = newPosition;
		
	}
	public String getPosition(){
		return this.position;
		
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
	public boolean canMove(String newPosition){
		/*Piece[][] copy = Board.getBoard();
		String type = this.getClass().getSimpleName();
		int m=0,n=0;
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				if(Board.getStr_Board()[i][j].equals(newPosition)){
					m = i;
					n = j;
				}
			}	
		}
		if(type.equals("Knight")){
			Board.board[m][n]
		}*/
		
		
		return false;
	}
	//Hamleleri alfabetik sirada doner
	public String[] getAllMoves() {
		
		return new String[10];
	}

}
