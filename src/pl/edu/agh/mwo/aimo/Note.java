package pl.edu.agh.mwo.aimo;

public class Note {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    public Snapshot createSnapshot(){
        return new Snapshot(getText());
    }

    public void restore(Snapshot snapshot){
        text = snapshot.getSnapshot();
    }
}
