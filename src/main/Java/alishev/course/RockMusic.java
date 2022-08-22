package alishev.course;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    List<String> playListOfRockMusic = new ArrayList<>();

    {
        playListOfRockMusic.add("Wind cries Mary");
        playListOfRockMusic.add("Paint it black");
        playListOfRockMusic.add("Can't seem to make you mine");
    }
    @Override
    public List<String> getSong() {
        return playListOfRockMusic;
    }
}
