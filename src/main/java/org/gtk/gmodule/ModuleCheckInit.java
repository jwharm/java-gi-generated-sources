package org.gtk.gmodule;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of the module initialization function.
 * If a module contains a function named g_module_check_init() it is called
 * automatically when the module is loaded. It is passed the {@link Module} structure
 * and should return {@code null} on success or a string describing the initialization
 * error.
 */
@FunctionalInterface
public interface ModuleCheckInit {
        java.lang.String onModuleCheckInit(@NotNull org.gtk.gmodule.Module module);
}
