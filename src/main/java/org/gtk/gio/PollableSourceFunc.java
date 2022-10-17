package org.gtk.gio;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * This is the function type of the callback used for the {@link org.gtk.glib.Source}
 * returned by g_pollable_input_stream_create_source() and
 * g_pollable_output_stream_create_source().
 */
@FunctionalInterface
public interface PollableSourceFunc {
        boolean onPollableSourceFunc(@NotNull org.gtk.gobject.Object pollableStream);
}
