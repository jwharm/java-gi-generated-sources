package io.github.jwharm.javagi;

import java.lang.foreign.MemoryAddress;

public class ResourceBase implements Proxy {

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
