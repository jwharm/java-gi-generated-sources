package org.gtk.gtk;

import io.github.jwharm.javagi.*;

/**
 * Queries a widget for its preferred size request mode.
 */
@FunctionalInterface
public interface CustomRequestModeFunc {
        SizeRequestMode onCustomRequestModeFunc(Widget widget);
}
