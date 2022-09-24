package org.gtk.gio;

import io.github.jwharm.javagi.*;

/**
 * Invoked when the name being watched is known to have to have an owner.
 */
@FunctionalInterface
public interface BusNameAppearedCallback {
        void onBusNameAppearedCallback(DBusConnection connection, java.lang.String name, java.lang.String nameOwner);
}
