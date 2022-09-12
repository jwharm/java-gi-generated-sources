package io.github.jwharm.javagi;

import jdk.incubator.foreign.MemoryAddress;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public class References {

    private static final Set<Reference> cache = Collections.newSetFromMap(
            new WeakHashMap<Reference, Boolean>()
    );

    /**
     * Retrieve the Reference instance for this memory address from the cache,
     * or add a new instance to the cache if it did not yet exist. Ownership
     * of an existing Reference instance remains unchanged. For new instances,
     * ownership is set to false.
     */
    public static Reference get(MemoryAddress address) {
        for (Reference ref : cache) {
            if (ref.handle().equals(address)) {
                return ref;
            }
        }
        Reference reference = new Reference(address, false);
        cache.add(reference);
        return reference;
    }

    /**
     * Retrieve the Reference for this memory address from the cache,
     * or add a new instance to the cache if it did not yet exist.
     * Ownership is updated to the given value.
     */
    public static Reference get(MemoryAddress address, boolean owned) {
        Reference reference = get(address);
        reference.setOwnership(owned);
        return reference;
    }
}
