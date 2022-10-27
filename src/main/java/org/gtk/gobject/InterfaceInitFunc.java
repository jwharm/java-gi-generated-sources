package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A callback function used by the type system to initialize a new
 * interface.
 * <p>
 * This function should initialize all internal data and* allocate any
 * resources required by the interface.
 * <p>
 * The members of {@code iface_data} are guaranteed to have been filled with
 * zeros before this function is called.
 */
@FunctionalInterface
public interface InterfaceInitFunc {
        void onInterfaceInitFunc(@NotNull org.gtk.gobject.TypeInterface gIface);
}
