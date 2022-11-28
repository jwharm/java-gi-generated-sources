package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * FIXME(2.0): remove, this is unused
 */
@FunctionalInterface
public interface ControlBindingConvert {
        void onControlBindingConvert(@NotNull org.gstreamer.gst.ControlBinding binding, double srcValue, @NotNull org.gtk.gobject.Value destValue);
}
