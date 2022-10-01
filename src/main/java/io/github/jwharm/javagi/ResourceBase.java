package io.github.jwharm.javagi;

import java.lang.foreign.MemoryAddress;

public class ResourceBase implements Proxy {

    private Refcounted ref;

    public ResourceBase(Refcounted ref) {
        this.ref = ref;
    }

    public MemoryAddress handle() {
        return this.ref.handle();
    }

    public Refcounted refcounted() {
        return this.ref;
    }
}
