package org.gtk.gobject;

import io.github.jwharm.javagi.*;

/**
 * The type of the {@code finalize} function of {@link ObjectClass}.
 */
@FunctionalInterface
public interface ObjectFinalizeFunc {
        void onObjectFinalizeFunc(Object object);
}
