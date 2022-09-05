package org.gtk.gobject;

@FunctionalInterface
public interface ToggleNotify {

    /**
     * A callback function used for notification when the state
     * of a toggle reference changes.
     * 
     * See also: g_object_add_toggle_ref()
     */
    public void onToggleNotify(jdk.incubator.foreign.MemoryAddress data, Object object, boolean isLastRef);
}
