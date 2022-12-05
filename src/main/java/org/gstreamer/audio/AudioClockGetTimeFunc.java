package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This function will be called whenever the current clock time needs to be
 * calculated. If this function returns {@code GST_CLOCK_TIME_NONE}, the last reported
 * time will be returned by the clock.
 */
@FunctionalInterface
public interface AudioClockGetTimeFunc {
        org.gstreamer.gst.ClockTime onAudioClockGetTimeFunc(@NotNull org.gstreamer.gst.Clock clock);
}
