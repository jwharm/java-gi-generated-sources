package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface VideoConvertSampleCallback {
        void onVideoConvertSampleCallback(@NotNull org.gstreamer.gst.Sample sample, @NotNull org.gtk.glib.Error error);
}
