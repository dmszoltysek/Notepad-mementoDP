package pl.edu.agh.mwo.aimo;

import java.time.LocalDateTime;

public class Snapshot {
    private final String text;
    private final LocalDateTime creationDate = LocalDateTime.now();

    public Snapshot(String text){
        this.text = text;
    }

    public String getSnapshot(){
        return text;
    }

    public LocalDateTime getDate(){
        return creationDate;
    }
}
