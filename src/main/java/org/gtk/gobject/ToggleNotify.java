package org.gtk.gobject;

import io.github.jwharm.javagi.*;

/**
 * A callback function used for notification when the state
 * of a toggle reference changes.
 * <p>
 * See also: g_object_add_toggle_ref()
 */
@FunctionalInterface
public interface ToggleNotify {
        void onToggleNotify(Object object, boolean isLastRef);
}
