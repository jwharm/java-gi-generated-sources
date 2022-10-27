package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This function type is used by g_vfs_register_uri_scheme() to make it
 * possible for a client to associate an URI scheme to a different {@link File}
 * implementation.
 * <p>
 * The client should return a reference to the new file that has been
 * created for {@code uri}, or {@code null} to continue with the default implementation.
 * @version 2.50
 */
@FunctionalInterface
public interface VfsFileLookupFunc {
        org.gtk.gio.File onVfsFileLookupFunc(@NotNull org.gtk.gio.Vfs vfs, @NotNull java.lang.String identifier);
}
