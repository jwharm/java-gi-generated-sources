package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code set_property} function of {@link ObjectClass}.
 */
@FunctionalInterface
public interface ObjectSetPropertyFunc {
        void onObjectSetPropertyFunc(@NotNull Object object, @NotNull int propertyId, @NotNull Value value, @NotNull ParamSpec pspec);
}
