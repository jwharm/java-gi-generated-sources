package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface PacketizeFunc {
        boolean onPacketizeFunc(@NotNull org.gstreamer.mpegts.Section section);
}
