package se.lexicon.simon.data;

/**
 * Using singleton pattern in this class
 */
public class PersonSequencer implements Sequencer {

    private static int sequencer;

    private static final PersonSequencer INSTANCE;

    //Static instantiation Block
    static{
        INSTANCE = new PersonSequencer();
    }

    //Private constructor
    private PersonSequencer(){
        sequencer = 0;
    }

    //Getter for PersonSequencer instance = To access this single instance from anywhere.
    public static PersonSequencer getInstance(){
        return INSTANCE;
    }

    @Override
    public int getNextInSequence() {
        return ++sequencer;
    }

    @Override
    public int getCurrentSequenceNumber() {
        return sequencer;
    }

    @Override
    public void setSequencer(int sequencer) {
        PersonSequencer.sequencer = sequencer;
    }

    @Override
    public void resetSequencer() {
        PersonSequencer.sequencer = 0;

    }
}
