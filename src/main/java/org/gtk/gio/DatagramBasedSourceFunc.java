package org.gtk.gio;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * This is the function type of the callback used for the {@link org.gtk.glib.Source}
 * returned by g_datagram_based_create_source().
 */
@FunctionalInterface
public interface DatagramBasedSourceFunc {
        boolean onDatagramBasedSourceFunc(@NotNull DatagramBased datagramBased, @NotNull org.gtk.glib.IOCondition condition);
}
