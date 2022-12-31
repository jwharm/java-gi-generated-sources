package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that can be used with e.g. gst_registry_feature_filter()
 * to get a list of pluginfeature that match certain criteria.
 */
@FunctionalInterface
public interface PluginFeatureFilter {
    boolean run(org.gstreamer.gst.PluginFeature feature);

    @ApiStatus.Internal default int upcall(MemoryAddress feature, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.gst.PluginFeature) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(feature)), org.gstreamer.gst.PluginFeature.fromAddress).marshal(feature, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PluginFeatureFilter.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
