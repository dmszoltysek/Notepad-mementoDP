package pl.edu.agh.mwo.aimo;

import java.util.LinkedList;

public class EditionHistory {
    LinkedList<Snapshot> snapshots = new LinkedList<>();
    LinkedList<Snapshot> redoList = new LinkedList<>();

    public void addSnapshot(Snapshot snapshot){
        snapshots.push(snapshot);
        redoList.clear();
    }

    public void undo(Note note){
        if (!snapshots.isEmpty()){
            redoList.push(note.createSnapshot());
            note.restore(snapshots.pop());
        }
        else{
            System.out.println("Cannot undo!");
        }
    }

    public void redo(Note note){
        if (!redoList.isEmpty()) {
            snapshots.push(note.createSnapshot());
            note.restore(redoList.pop());
        }
        else{
            System.out.println("Cannot redo");
        }
    }

    public void printSnapshots(){
        for (Snapshot s : snapshots){
            System.out.println(s.getSnapshot());
            System.out.println(s.getDate());
            System.out.println();
        }
    }
}
