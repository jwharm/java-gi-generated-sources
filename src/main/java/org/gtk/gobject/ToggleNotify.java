package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A callback function used for notification when the state
 * of a toggle reference changes.
 * <p>
 * See also: g_object_add_toggle_ref()
 */
@FunctionalInterface
public interface ToggleNotify {
        void onToggleNotify(@NotNull org.gtk.gobject.Object object, boolean isLastRef);
}
