package io.github.jwharm.javagi.interop;

import jdk.incubator.foreign.MemoryAddress;

public class ResourceBase implements NativeAddress {

    private Reference reference;

    public ResourceBase(Reference reference) {
        this.reference = reference;
    }

    public MemoryAddress HANDLE() {
        return reference.HANDLE();
    }

    public Reference getReference() {
        return this.reference;
    }
}
