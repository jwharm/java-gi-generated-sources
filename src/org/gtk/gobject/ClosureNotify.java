package org.gtk.gobject;

@FunctionalInterface
public interface ClosureNotify {

    /**
     * The type used for the various notification callbacks which can be registered
     * on closures.
     */
    public void onClosureNotify(jdk.incubator.foreign.MemoryAddress data, Closure closure);
}
