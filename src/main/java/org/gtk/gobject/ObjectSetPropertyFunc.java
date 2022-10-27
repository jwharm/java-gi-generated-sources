package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code set_property} function of {@link ObjectClass}.
 */
@FunctionalInterface
public interface ObjectSetPropertyFunc {
        void onObjectSetPropertyFunc(@NotNull org.gtk.gobject.Object object, int propertyId, @NotNull org.gtk.gobject.Value value, @NotNull org.gtk.gobject.ParamSpec pspec);
}
