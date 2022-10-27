package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is the function type of the callback used for the {@link org.gtk.glib.Source}
 * returned by g_datagram_based_create_source().
 * @version 2.48
 */
@FunctionalInterface
public interface DatagramBasedSourceFunc {
        boolean onDatagramBasedSourceFunc(@NotNull org.gtk.gio.DatagramBased datagramBased, @NotNull org.gtk.glib.IOCondition condition);
}
