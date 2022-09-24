package org.gtk.gio;

import io.github.jwharm.javagi.*;

/**
 * Invoked when a connection to a message bus has been obtained.
 */
@FunctionalInterface
public interface BusAcquiredCallback {
        void onBusAcquiredCallback(DBusConnection connection, java.lang.String name);
}
