package org.gtk.glib;

@FunctionalInterface
public interface HookFunc {

    /**
     * Defines the type of a hook function that can be invoked
     * by g_hook_list_invoke().
     */
    public void onHookFunc(jdk.incubator.foreign.MemoryAddress data);
}
