package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that is called by gst_iterator_foreach() for every element.
 */
@FunctionalInterface
public interface IteratorForeachFunction {
        void onIteratorForeachFunction(@NotNull org.gtk.gobject.Value item);
}
