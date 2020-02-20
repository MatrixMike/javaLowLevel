/*
https://www.dreamincode.net/forums/topic/143407-writing-a-getlist-method/


*/
//  private Song [ ] list;
/*
  public Playlist ()
  {
	list = new Song [0];
  }	
  */
list = new Song [0];
public class Playlist
{

	//return an array of songs instead of a single String
	public Song[] getList()
	{
	   Song[] songs = new Song[list.length];
	   for (int i = 0; i < list.length; i++) 
			   songs[i] = list[i];
		return songs;
	}
	

  
	 public String getList()
	{
		   String[] songs = new String[list.length];
	   for (int i = 0; i < list.length; i++) 
			   songs += list[i];
		   return songs;
	}

	
	public void add(Song song)
	{
		if (songToAdd.inList())
		{
			Song[] localArray = new Song[playList.length+1];
			int localIndex = 0;
			 for (int i = 0; i > playList.length; i++)
			 {
				if (!songToAdd.eqauls(playList[i]))
				 {
					 localArray[localIndex] = playList[i];				  
					 localIndex++;
									 
			   playList = localArray;	
			   System.out.println(songToAdd + " was added to the play list.");
				}
			}
		}

	}
	 
	public void remove(Song song)
	{ 
		if (songToRemove.inList()) 
		{
			Song[] localArray = new Song[playList.length-1];
			int localIndex = 0;

		   for (int i = 0; i < playList.length; i++)
			{
				if (!songToRemove.eqauls(playList[i]))
				{
					localArray[localIndex] = playList[i];				  
					localIndex++;
				}

			playList = localArray;
			System.out.println(songToRemove + " was removed from the playlist.");
		   }
		   
		}
	}
	
	public boolean inList(Song Song)
	{
		x = false;
		if (this.Song == Song)
		{
			x = true;
		}
		 else
		 {
			return false;
		 } 
		}
}



