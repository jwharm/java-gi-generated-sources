package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A plugin should provide a pointer to a function of this type in the
 * plugin_desc struct.
 * This function will be called by the loader at startup. One would then
 * register each {@link PluginFeature}.
 */
/**
 * Functional interface declaration of the {@code PluginInitFunc} callback.
 */
@FunctionalInterface
public interface PluginInitFunc {

    /**
     * A plugin should provide a pointer to a function of this type in the
     * plugin_desc struct.
     * This function will be called by the loader at startup. One would then
     * register each {@link PluginFeature}.
     */
    boolean run(org.gstreamer.gst.Plugin plugin);
    
    @ApiStatus.Internal default int upcall(MemoryAddress plugin) {
        var RESULT = run((org.gstreamer.gst.Plugin) Interop.register(plugin, org.gstreamer.gst.Plugin.fromAddress).marshal(plugin, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PluginInitFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
