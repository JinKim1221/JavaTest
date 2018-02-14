package ie.dit;
import java.util.ArrayList;

public class TuneBook{

	ArrayList<Tune> tunes = new ArrayList<Tune>();

	public TuneBook(String abcTitle){
		loadTune();

			// int X = tune.getX();
			// int T = tune.getTitle();
			// int altTitle = tune.getAltTitle();
			// Stirng notation = tune.getNotation();


	}	

	public Tune findTune(Stirng title){

		int closestEd = Integer.MAX_VALUE;
		int cloestTune = tune.getX();

		for(Tune tune: tunes){
			if(tune.()==tune)
			{
				return tune;
			}
			if(tune.toString)
		}

		return tune;
	}

	public String toString(){
		StringBuffer sb =  new StringBuffer();
		for(String tune:tunes)
		{
			sb.append(tune.getX()+","+tune.getTitle()+","+tune.getAltTitle);
		}
		return sb.toString();
	}

	public void loadTune()
    {

        // Adapted from: https://docs.oracle.com/javase/tutorial/essential/io/charstreams.html
        BufferedReader inputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("hnj0.abc.txt"));
            
            String l;
            while ((l = inputStream.readLine()) != null) {
                words.add(l);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } 
        finally 
        {
            if (inputStream != null) {
                try
                {
                    inputStream.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}