package org.gtk.glib;

@FunctionalInterface
public interface HookCheckMarshaller {

    /**
     * Defines the type of function used by g_hook_list_marshal_check().
     */
    public boolean onHookCheckMarshaller(Hook hook, jdk.incubator.foreign.MemoryAddress marshalData);
}
