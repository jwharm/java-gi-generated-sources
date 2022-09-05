package io.github.jwharm.javagi.interop;

import jdk.incubator.foreign.MemoryAddress;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public class ProxyFactory {

    private static final Set<Proxy> cache = Collections.newSetFromMap(
            new WeakHashMap<Proxy, Boolean>()
    );

    /**
     * Retrieve the Proxy instance for this memory address from the cache,
     * or add a new instance to the cache if it did not yet exist. Ownership
     * of an existing Proxy instance remains unchanged. For new instances,
     * ownership is set to false.
     */
    public static Proxy get(MemoryAddress address) {
        for (Proxy p : cache) {
            if (p.HANDLE().equals(address)) {
                return p;
            }
        }
        Proxy proxy = new Proxy(address, false);
        cache.add(proxy);
        return proxy;
    }

    /**
     * Retrieve the Proxy instance for this memory address from the
     * cache, or add a new instance to the cache if it did not yet exist.
     * Ownership is updated to the given value.
     */
    public static Proxy get(MemoryAddress address, boolean owned) {
        Proxy proxy = get(address);
        proxy.setOwnership(owned);
        return proxy;
    }
}
