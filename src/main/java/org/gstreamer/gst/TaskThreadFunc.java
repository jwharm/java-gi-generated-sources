package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Custom GstTask thread callback functions that can be installed.
 */
@FunctionalInterface
public interface TaskThreadFunc {
        void onTaskThreadFunc(@NotNull org.gstreamer.gst.Task task, @NotNull org.gtk.glib.Thread thread);
}
