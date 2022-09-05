package io.github.jwharm.javagi.interop;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemorySegment;

import java.lang.ref.Cleaner;

public class MemorySegmentProxy {

    private final static Cleaner cleaner = Cleaner.create();
    private MemorySegmentProxy.State state;
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

    public MemorySegmentProxy(MemorySegment segment) {
        state = new MemorySegmentProxy.State(segment);
        cleanable = cleaner.register(this, state);
    }

    public final MemoryAddress HANDLE() {
        return state.segment.address();
    }
}
