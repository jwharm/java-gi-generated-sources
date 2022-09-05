package org.gtk.glib;

@FunctionalInterface
public interface HookCheckFunc {

    /**
     * Defines the type of a hook function that can be invoked
     * by g_hook_list_invoke_check().
     */
    public boolean onHookCheckFunc(jdk.incubator.foreign.MemoryAddress data);
}
