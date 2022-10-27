package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Whenever {@code row} changes or which row is before {@code row} changes this
 * is called, which lets you update the header on {@code row}.
 * <p>
 * You may remove or set a new one via {@link ListBoxRow#setHeader}
 * or just change the state of the current header widget.
 */
@FunctionalInterface
public interface ListBoxUpdateHeaderFunc {
        void onListBoxUpdateHeaderFunc(@NotNull org.gtk.gtk.ListBoxRow row, @Nullable org.gtk.gtk.ListBoxRow before);
}
