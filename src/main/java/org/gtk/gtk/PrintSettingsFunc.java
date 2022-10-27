package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface PrintSettingsFunc {
        void onPrintSettingsFunc(@NotNull java.lang.String key, @NotNull java.lang.String value);
}
