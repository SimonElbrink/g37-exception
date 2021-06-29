package se.lexicon.simon.data;

public interface Sequencer {

    int getNextInSequence();

    int getCurrentSequenceNumber();

    void setSequencer(int sequencer);

    void resetSequencer();
}
