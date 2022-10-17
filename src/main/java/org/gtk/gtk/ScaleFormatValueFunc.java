package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface ScaleFormatValueFunc {
        java.lang.String onScaleFormatValueFunc(@NotNull Scale scale, @NotNull double value);
}
