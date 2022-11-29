import java.util.HashMap;
import java.util.Set;

public class Hashmatique{
    public static void main(String[] args){


        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Original Title 1", "Original Lyric 1");
        trackList.put("Original Title 2", "Original Lyric 1");
        trackList.put("Original Title 3", "Original Lyric 3");
        trackList.put("Original Title 4", "Original Lyric 4");

        String lyric = trackList.get("Original Title 1");
        System.out.println(lyric);

        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.println(key + " : " + trackList.get(key));
            System.out.println();
        }
    }
}