package io.github.jwharm.javagi;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemorySegment;

import java.lang.ref.Cleaner;

public class MemorySegmentReference {

    private final static Cleaner cleaner = Cleaner.create();
    private MemorySegmentReference.State state;
    private Cleaner.Cleanable cleanable;

    private static class State implements Runnable {
        MemorySegment segment;

        State(MemorySegment segment) {
            this.segment = segment;
        }

        public void run() {
            segment.unload();
        }
    }

    public MemorySegmentReference(MemorySegment segment) {
        state = new MemorySegmentReference.State(segment);
        cleanable = cleaner.register(this, state);
    }

    public final MemoryAddress handle() {
        return state.segment.address();
    }
}
