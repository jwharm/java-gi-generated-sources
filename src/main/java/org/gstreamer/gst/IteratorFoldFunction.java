package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function to be passed to gst_iterator_fold().
 */
@FunctionalInterface
public interface IteratorFoldFunction {
        boolean onIteratorFoldFunction(@NotNull org.gtk.gobject.Value item, @NotNull org.gtk.gobject.Value ret);
}
