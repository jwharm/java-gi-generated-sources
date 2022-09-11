package org.gtk.gobject;

/**
 * A callback function used for notification when the state
 * of a toggle reference changes.
 * 
 * See also: g_object_add_toggle_ref()
 */
@FunctionalInterface
public interface ToggleNotify {
        void onToggleNotify(Object object, boolean isLastRef);
}
