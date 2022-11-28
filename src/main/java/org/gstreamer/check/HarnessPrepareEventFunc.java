package org.gstreamer.check;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface HarnessPrepareEventFunc {
        org.gstreamer.gst.Event onHarnessPrepareEventFunc(@NotNull org.gstreamer.check.Harness h);
}
