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
@FunctionalInterface
public interface PluginInitFunc {
    boolean run(org.gstreamer.gst.Plugin plugin);

    @ApiStatus.Internal default int upcall(MemoryAddress plugin) {
        var RESULT = run((org.gstreamer.gst.Plugin) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(plugin)), org.gstreamer.gst.Plugin.fromAddress).marshal(plugin, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PluginInitFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
