package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type used for the various notification callbacks which can be registered
 * on closures.
 */
@FunctionalInterface
public interface ClosureNotify {
        void onClosureNotify(@NotNull Closure closure);
}
