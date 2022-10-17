package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Queries a widget for its preferred size request mode.
 */
@FunctionalInterface
public interface CustomRequestModeFunc {
        SizeRequestMode onCustomRequestModeFunc(@NotNull Widget widget);
}
