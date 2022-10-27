package org.gtk.gmodule;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of the module function called when it is unloaded.
 * If a module contains a function named g_module_unload() it is called
 * automatically when the module is unloaded.
 * It is passed the {@link Module} structure.
 */
@FunctionalInterface
public interface ModuleUnload {
        void onModuleUnload(@NotNull org.gtk.gmodule.Module module);
}
