package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is the function type of the callback used for the {@link org.gtk.glib.Source}
 * returned by g_socket_create_source().
 * @version 2.22
 */
@FunctionalInterface
public interface SocketSourceFunc {
        boolean onSocketSourceFunc(@NotNull org.gtk.gio.Socket socket, @NotNull org.gtk.glib.IOCondition condition);
}
