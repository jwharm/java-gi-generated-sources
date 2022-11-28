package org.gstreamer.check;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface HarnessPrepareBufferFunc {
        org.gstreamer.gst.Buffer onHarnessPrepareBufferFunc(@NotNull org.gstreamer.check.Harness h);
}
