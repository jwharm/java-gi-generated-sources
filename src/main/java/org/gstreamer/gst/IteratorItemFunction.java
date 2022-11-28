package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The function that will be called after the next item of the iterator
 * has been retrieved. This function can be used to skip items or stop
 * the iterator.
 * <p>
 * The function will be called with the iterator lock held.
 */
@FunctionalInterface
public interface IteratorItemFunction {
        org.gstreamer.gst.IteratorItem onIteratorItemFunction(@NotNull org.gstreamer.gst.Iterator it, @NotNull org.gtk.gobject.Value item);
}
