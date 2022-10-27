package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A callback function used by the type system to finalize an interface.
 * <p>
 * This function should destroy any internal data and release any resources
 * allocated by the corresponding GInterfaceInitFunc() function.
 */
@FunctionalInterface
public interface InterfaceFinalizeFunc {
        void onInterfaceFinalizeFunc(@NotNull org.gtk.gobject.TypeInterface gIface);
}
