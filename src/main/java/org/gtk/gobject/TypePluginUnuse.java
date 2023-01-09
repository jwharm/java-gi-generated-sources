package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code unuse_plugin} function of {@link TypePluginClass}.
 */
/**
 * Functional interface declaration of the {@code TypePluginUnuse} callback.
 */
@FunctionalInterface
public interface TypePluginUnuse {

    /**
     * The type of the {@code unuse_plugin} function of {@link TypePluginClass}.
     */
    void run(org.gtk.gobject.TypePlugin plugin);
    
    @ApiStatus.Internal default void upcall(MemoryAddress plugin) {
        run((org.gtk.gobject.TypePlugin) Interop.register(plugin, org.gtk.gobject.TypePlugin.fromAddress).marshal(plugin, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TypePluginUnuse.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
