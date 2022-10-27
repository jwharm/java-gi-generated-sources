package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface ScaleFormatValueFunc {
        java.lang.String onScaleFormatValueFunc(@NotNull org.gtk.gtk.Scale scale, double value);
}
