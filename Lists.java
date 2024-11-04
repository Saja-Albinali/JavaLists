import java.util.List;
import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        List<String> playList = new ArrayList<>();
        playList.add("wildflower");
        playList.add("Love of my life");
        playList.add("Dancing queen");
        playList.add("Fernando");
        playList.add("Happy");

        playList.remove(2);

        for(int i=0; i< playList.size();i++){
            System.out.println(playList.get(i));
        }
    }
}
