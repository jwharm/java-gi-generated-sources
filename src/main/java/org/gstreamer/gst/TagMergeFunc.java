package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function for merging multiple values of a tag used when registering
 * tags.
 */
@FunctionalInterface
public interface TagMergeFunc {
        void onTagMergeFunc(@NotNull org.gtk.gobject.Value dest, @NotNull org.gtk.gobject.Value src);
}
