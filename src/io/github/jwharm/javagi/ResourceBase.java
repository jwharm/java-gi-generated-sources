package io.github.jwharm.javagi;

import jdk.incubator.foreign.MemoryAddress;

public class ResourceBase implements NativeAddress {

    private Reference reference;

    public ResourceBase(Reference reference) {
        this.reference = reference;
    }

    public MemoryAddress handle() {
        return reference.handle();
    }

    public Reference getReference() {
        return this.reference;
    }
}
