
public class RandomNumber {

	public int GetANumber_Between_1_and_10() {
		
		int computerNum = 1 + (int) ( Math.random() * 10 );
		return computerNum;
	}
}