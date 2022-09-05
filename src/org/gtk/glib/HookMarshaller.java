package org.gtk.glib;

@FunctionalInterface
public interface HookMarshaller {

    /**
     * Defines the type of function used by g_hook_list_marshal().
     */
    public void onHookMarshaller(Hook hook, jdk.incubator.foreign.MemoryAddress marshalData);
}
