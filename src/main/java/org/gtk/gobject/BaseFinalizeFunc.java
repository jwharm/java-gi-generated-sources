package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A callback function used by the type system to finalize those portions
 * of a derived types class structure that were setup from the corresponding
 * GBaseInitFunc() function.
 * <p>
 * Class finalization basically works the inverse way in which class
 * initialization is performed.
 * <p>
 * See GClassInitFunc() for a discussion of the class initialization process.
 */
@FunctionalInterface
public interface BaseFinalizeFunc {
        void onBaseFinalizeFunc(@NotNull org.gtk.gobject.TypeClass gClass);
}
