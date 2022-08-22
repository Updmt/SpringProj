package alishev.course;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{

    List<String> playListOfClassicalMusic = new ArrayList<>();

    {
        playListOfClassicalMusic.add("Hungarian Rhapsody");
        playListOfClassicalMusic.add("Symphony no. 5 in C Minor, op. 67");
        playListOfClassicalMusic.add("Night on Bald Mountain");
    }

    @Override
    public List<String> getSong() {
        return playListOfClassicalMusic;
    }

    /*@Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }*/
}
