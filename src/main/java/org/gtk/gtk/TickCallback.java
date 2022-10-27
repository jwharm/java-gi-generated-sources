package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Callback type for adding a function to update animations. See gtk_widget_add_tick_callback().
 */
@FunctionalInterface
public interface TickCallback {
        boolean onTickCallback(@NotNull org.gtk.gtk.Widget widget, @NotNull org.gtk.gdk.FrameClock frameClock);
}
