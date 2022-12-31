package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that can be used with e.g. gst_registry_plugin_filter()
 * to get a list of plugins that match certain criteria.
 */
@FunctionalInterface
public interface PluginFilter {
    boolean run(org.gstreamer.gst.Plugin plugin);

    @ApiStatus.Internal default int upcall(MemoryAddress plugin, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.gst.Plugin) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(plugin)), org.gstreamer.gst.Plugin.fromAddress).marshal(plugin, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PluginFilter.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
