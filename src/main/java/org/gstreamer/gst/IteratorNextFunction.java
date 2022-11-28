package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The function that will be called when the next element of the iterator
 * should be retrieved.
 * <p>
 * Implementors of a {@link Iterator} should implement this
 * function and pass it to the constructor of the custom iterator.
 * The function will be called with the iterator lock held.
 */
@FunctionalInterface
public interface IteratorNextFunction {
        org.gstreamer.gst.IteratorResult onIteratorNextFunction(@NotNull org.gstreamer.gst.Iterator it, @NotNull org.gtk.gobject.Value result);
}
