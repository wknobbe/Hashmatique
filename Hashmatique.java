import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Fun Song", "F is for friends...");
        trackList.put("Ring Around", "Ring around the rosey...");
        trackList.put("Happy Birthday", "Happy Birthday to you...");
        trackList.put("I Love You", "I love you, you love me, we're a happy family...");
        Set<String> keys = trackList.keySet();
        for (String key : keys){
            System.out.println("Track: " + key + ", Lyrics: " + trackList.get(key));
        }
    }
}