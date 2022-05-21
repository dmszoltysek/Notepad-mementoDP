package pl.edu.agh.mwo.aimo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EditionHistory history = new EditionHistory();
        Note note = new Note();

        note.setText("I ");
        history.addSnapshot(note.createSnapshot());
        note.setText("I am");
        history.addSnapshot(note.createSnapshot());
        note.setText("I am text");
        history.addSnapshot(note.createSnapshot());
        note.setText("I am text editor.");

        history.printSnapshots();

        System.out.println(note.getText());
        history.undo(note);
        System.out.println(note.getText());
        history.undo(note);
        System.out.println(note.getText());
        history.undo(note);
        System.out.println(note.getText());

        //output: cannot undo
        history.undo(note);
        System.out.println(note.getText());

        //empty list
        history.printSnapshots();

        history.redo(note);
        System.out.println(note.getText());

        history.redo(note);
        System.out.println(note.getText());
        history.redo(note);
        System.out.println(note.getText());

        //output: cannot redo
        history.redo(note);

        System.out.println(note.getText());
        history.addSnapshot(note.createSnapshot());



        note.setText("I am text editor. Hello!");
        history.addSnapshot(note.createSnapshot());

        note.setText("I am text editor. Hello! Hello!");
        System.out.println(note.getText());

        history.printSnapshots();



        history.undo(note);
        System.out.println(note.getText());
        history.undo(note);
        System.out.println(note.getText());
        history.undo(note);
        System.out.println(note.getText());

        history.redo(note);
        System.out.println(note.getText());

        history.printSnapshots();
    }
}
