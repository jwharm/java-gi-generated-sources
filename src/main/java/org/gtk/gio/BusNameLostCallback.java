package org.gtk.gio;

import io.github.jwharm.javagi.*;

/**
 * Invoked when the name is lost or {@code connection} has been closed.
 */
@FunctionalInterface
public interface BusNameLostCallback {
        void onBusNameLostCallback(DBusConnection connection, java.lang.String name);
}
