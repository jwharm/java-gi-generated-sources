package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code dispatch} function in {@link DBusSubtreeVTable}.
 * <p>
 * Subtrees are flat.  {@code node}, if non-{@code null}, is always exactly one
 * segment of the object path (ie: it never contains a slash).
 * @version 2.26
 */
@FunctionalInterface
public interface DBusSubtreeDispatchFunc {
        org.gtk.gio.DBusInterfaceVTable onDBusSubtreeDispatchFunc(@NotNull org.gtk.gio.DBusConnection connection, @NotNull java.lang.String sender, @NotNull java.lang.String objectPath, @NotNull java.lang.String interfaceName, @NotNull java.lang.String node, @NotNull java.lang.foreign.MemoryAddress outUserData);
}
