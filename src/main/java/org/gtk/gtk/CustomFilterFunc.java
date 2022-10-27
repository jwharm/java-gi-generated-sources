package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * User function that is called to determine if the {@code item} should be matched.
 * <p>
 * If the filter matches the item, this function must return {@code true}. If the
 * item should be filtered out, {@code false} must be returned.
 */
@FunctionalInterface
public interface CustomFilterFunc {
        boolean onCustomFilterFunc(@NotNull org.gtk.gobject.Object item);
}
