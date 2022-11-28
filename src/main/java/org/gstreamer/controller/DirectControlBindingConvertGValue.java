package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function to map a control-value to the target GValue.
 */
@FunctionalInterface
public interface DirectControlBindingConvertGValue {
        void onDirectControlBindingConvertGValue(@NotNull org.gstreamer.controller.DirectControlBinding self, double srcValue, @NotNull org.gtk.gobject.Value destValue);
}
