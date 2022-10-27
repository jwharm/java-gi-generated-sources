package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Queries a widget for its preferred size request mode.
 */
@FunctionalInterface
public interface CustomRequestModeFunc {
        org.gtk.gtk.SizeRequestMode onCustomRequestModeFunc(@NotNull org.gtk.gtk.Widget widget);
}
