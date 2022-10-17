package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code get_property} function of {@link ObjectClass}.
 */
@FunctionalInterface
public interface ObjectGetPropertyFunc {
        void onObjectGetPropertyFunc(@NotNull Object object, @NotNull int propertyId, @NotNull Value value, @NotNull ParamSpec pspec);
}
