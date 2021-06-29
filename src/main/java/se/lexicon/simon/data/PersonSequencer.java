package se.lexicon.simon.data;

/**
 * Using singleton pattern in this class
 */
public class PersonSequencer implements Sequencer {

    private static int sequencer;
    private static PersonSequencer personSequencer;

    static{
        personSequencer = new PersonSequencer();
    }

    private PersonSequencer(){
        sequencer = 0;
    }

    public static PersonSequencer getInstance(){
        return personSequencer;
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
