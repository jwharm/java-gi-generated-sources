package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function prototype for when a miniobject has lost its last refcount.
 * Implementation of the mini object are allowed to revive the
 * passed object by doing a gst_mini_object_ref(). If the object is not
 * revived after the dispose function, the function should return {@code true}
 * and the memory associated with the object is freed.
 */
@FunctionalInterface
public interface MiniObjectDisposeFunction {
        boolean onMiniObjectDisposeFunction(@NotNull org.gstreamer.gst.MiniObject obj);
}
