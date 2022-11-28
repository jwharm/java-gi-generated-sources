package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of function passed to gst_bus_add_watch() or
 * gst_bus_add_watch_full(), which is called from the mainloop when a message
 * is available on the bus.
 * <p>
 * The message passed to the function will be unreffed after execution of this
 * function so it should not be freed in the function.
 * <p>
 * Note that this function is used as a {@link org.gtk.glib.SourceFunc} which means that returning
 * {@code false} will remove the {@link org.gtk.glib.Source} from the mainloop.
 */
@FunctionalInterface
public interface BusFunc {
        boolean onBusFunc(@NotNull org.gstreamer.gst.Bus bus, @NotNull org.gstreamer.gst.Message message);
}
