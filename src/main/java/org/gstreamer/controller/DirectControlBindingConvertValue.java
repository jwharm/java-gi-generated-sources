package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function to map a control-value to the target plain data type.
 */
@FunctionalInterface
public interface DirectControlBindingConvertValue {
        void onDirectControlBindingConvertValue(@NotNull org.gstreamer.controller.DirectControlBinding self, double srcValue, @Nullable java.lang.foreign.MemoryAddress destValue);
}
