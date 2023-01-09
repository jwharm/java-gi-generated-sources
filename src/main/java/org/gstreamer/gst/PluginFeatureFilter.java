package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that can be used with e.g. gst_registry_feature_filter()
 * to get a list of pluginfeature that match certain criteria.
 */
/**
 * Functional interface declaration of the {@code PluginFeatureFilter} callback.
 */
@FunctionalInterface
public interface PluginFeatureFilter {

    /**
     * A function that can be used with e.g. gst_registry_feature_filter()
     * to get a list of pluginfeature that match certain criteria.
     */
    boolean run(org.gstreamer.gst.PluginFeature feature);
    
    @ApiStatus.Internal default int upcall(MemoryAddress feature, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.gst.PluginFeature) Interop.register(feature, org.gstreamer.gst.PluginFeature.fromAddress).marshal(feature, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PluginFeatureFilter.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
