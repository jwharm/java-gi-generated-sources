package io.github.jwharm.javagi.interop;

import jdk.incubator.foreign.MemoryAddress;

import java.lang.ref.Cleaner;

public class Reference {

    private final static Cleaner cleaner = Cleaner.create();
    private Reference.State state;
    private Cleaner.Cleanable cleanable;

    private static class State implements Runnable {
        MemoryAddress address;
        boolean owned;

        State(MemoryAddress address, boolean owned) {
            this.address = address;
            this.owned = owned;
        }

        public void run() {
            if (owned) {
                io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_unref(address);
            }
        }
    }

    public Reference(MemoryAddress handle, boolean owned) {
        state = new Reference.State(handle, owned);
        cleanable = cleaner.register(this, state);
    }

    public final MemoryAddress HANDLE() {
        return state.address;
    }

    public void setOwnership(boolean owned) {
        state.owned = owned;
    }

    public Reference unowned() {
        setOwnership(false);
        return this;
    }

    public Reference owned() {
        setOwnership(true);
        return this;
    }
}
