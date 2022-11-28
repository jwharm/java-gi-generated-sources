package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Handler will be invoked synchronously, when a new message has been injected
 * into the bus. This function is mostly used internally. Only one sync handler
 * can be attached to a given bus.
 * <p>
 * If the handler returns {@link BusSyncReply#DROP}, it should unref the message, else the
 * message should not be unreffed by the sync handler.
 */
@FunctionalInterface
public interface BusSyncHandler {
        org.gstreamer.gst.BusSyncReply onBusSyncHandler(@NotNull org.gstreamer.gst.Bus bus, @NotNull org.gstreamer.gst.Message message);
}
