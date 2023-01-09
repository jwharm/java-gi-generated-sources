package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Functional interface declaration of the {@code VideoAffineTransformationGetMatrix} callback.
 */
@FunctionalInterface
public interface VideoAffineTransformationGetMatrix {

    boolean run(org.gstreamer.video.VideoAffineTransformationMeta meta, PointerFloat matrix);
    
    @ApiStatus.Internal default int upcall(MemoryAddress meta, MemoryAddress matrix) {
        var RESULT = run(org.gstreamer.video.VideoAffineTransformationMeta.fromAddress.marshal(meta, null), new PointerFloat(matrix));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), VideoAffineTransformationGetMatrix.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
