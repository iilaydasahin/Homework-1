
public class Board {
	private Piece[][] board = new Piece[8][8];
	private static String[][] str_board = new String[8][8];;
	
	//construct an empty board
	//set all to null
	
	public Board(){
		char letter = 'a';
		
		for(int i = 0; i < 8; i++){
			letter = 'a';
			for(int j = 0; j < 8; j++){
				str_board[i][j] = letter +"" + (8-i);
				letter++;
			}	
		}
	}
	public void putPiece(Piece p, String pos){
		int m=0,n=0;
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				if(str_board[i][j].equals(pos)){
					m = i;
					n = j;
				}
			}	
		}
		board[m][n] = p;
		
	}
	public Piece getPiece(String pos){
		int m=0,n=0;
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				if(str_board[i][j].equals(pos)){
					m = i;
					n = j;
				}
			}	
		}
		
		return board[m][n];
		
	}
	public boolean check(String color){
		return false;
		
	}
	public boolean isEmpty(String pos) {
		int m=0,n=0;
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				if(str_board[i][j].equals(pos)){
					m = i;
					n = j;
				}
			}	
		}
		if(board[m][n] != null)
			return false;
		return true;
		
	}
	public String checkMate(String string) {
		
		return null;
	}
	public Piece[][] getBoard() {
		return board;
	}
	public void setBoard(Piece[][] board) {
		this.board = board;
	}
	public static String[][] getStr_Board() {
		return str_board;
	}
	
}

