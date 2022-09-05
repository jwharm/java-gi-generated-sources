package org.gtk.glib;

@FunctionalInterface
public interface HookFindFunc {

    /**
     * Defines the type of the function passed to g_hook_find().
     */
    public boolean onHookFindFunc(Hook hook, jdk.incubator.foreign.MemoryAddress data);
}
