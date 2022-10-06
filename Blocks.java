import java.util.ArrayList;
/**
 * 
 * 
 * @author lyont
 * 
 * the first part is standard for a class
 */
class Blocks {
	private int number;
	private String miner;
	
	private static ArrayList<Blocks> blocks;
	
	public Blocks(){
		
	}
	public Blocks(int number){
		this.number=number;
	}
	public Blocks(int number,String miner){
		this.number=number;
		this.miner = miner;
	}
	public int getNumber() {
		return number; 
	}
	public String getMiner() {
		return miner; 
	}
	public ArrayList<Blocks> getBlocks() {
		return blocks; 
	}
	/** This is the beginning of HE-DOUBLE HOCKEY STICKS @author lyont
	 * 
	 * 
	 */
	
	public static void calUniqMiners() {
		int result;
		System.out.println();
		
	}
	
	public static int blockDiff(Blocks A, Blocks B) {
		return 0;
	}
	
	public static int getBlockByNumber(int num) {
		return 0;
	}
	
	
	public String toString() {
		
		if (number != 0 && miner != null) {
		return "Block Number: " +number + " Miner Address: "+ miner;
		}
		else if (number != 0) {
			return "Block Number: " +number;
		}
		return "Empty Block";
	}
	
	public static void readFile(String filename) {
		
	}
}
