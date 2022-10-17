package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code finalize} function of {@link ObjectClass}.
 */
@FunctionalInterface
public interface ObjectFinalizeFunc {
        void onObjectFinalizeFunc(@NotNull Object object);
}
