package ie.dit;

public class Tune{

	private int x;
	private int title;
	private int altTitle;
	private String notation;

	public Tune(int x, int title, int altTitle){
		this.x = x;
		this.title = title;
		this.altTitle = altTitle;
	}

	//for x : index
	public int getX(){
		return x;
	}

	//for title
	public int getTitle(){
		return title;
	}
	
	//for altTitle
	public int getAltTtitle(){
		return altTitle;
	}

	//for notation
	public String getNotation(){
		return notation;
	}


	public String toString(){
		return String.format(getX()+","+getTitle()+","+getAltTtitle());
	}

	// public interface player{
		public void play(){

			TuneBook.findTune();
		}
	
}