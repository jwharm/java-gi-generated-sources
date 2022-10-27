package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Checks whether the given {@code option_key} is supported when saving.
 */
@FunctionalInterface
public interface PixbufModuleSaveOptionSupportedFunc {
        boolean onPixbufModuleSaveOptionSupportedFunc(@NotNull java.lang.String optionKey);
}
