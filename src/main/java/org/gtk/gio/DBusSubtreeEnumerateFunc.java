package org.gtk.gio;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code enumerate} function in {@link DBusSubtreeVTable}.
 * <p>
 * This function is called when generating introspection data and also
 * when preparing to dispatch incoming messages in the event that the
 * {@link DBusSubtreeFlags#DISPATCH_TO_UNENUMERATED_NODES} flag is not
 * specified (ie: to verify that the object path is valid).
 * <p>
 * Hierarchies are not supported; the items that you return should not
 * contain the {@code /} character.
 * <p>
 * The return value will be freed with g_strfreev().
 */
@FunctionalInterface
public interface DBusSubtreeEnumerateFunc {
        void onDBusSubtreeEnumerateFunc(@NotNull DBusConnection connection, @NotNull java.lang.String sender, @NotNull java.lang.String objectPath);
}
