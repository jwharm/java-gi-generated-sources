package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type used for the various notification callbacks which can be registered
 * on closures.
 */
@FunctionalInterface
public interface ClosureNotify {
        void onClosureNotify(@NotNull org.gtk.gobject.Closure closure);
}
