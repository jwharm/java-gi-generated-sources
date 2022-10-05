package org.gtk.gio;

import io.github.jwharm.javagi.*;

/**
 * This is the function type of the callback used for the {@link org.gtk.glib.Source}
 * returned by g_datagram_based_create_source().
 */
@FunctionalInterface
public interface DatagramBasedSourceFunc {
        boolean onDatagramBasedSourceFunc(DatagramBased datagramBased, org.gtk.glib.IOCondition condition);
}