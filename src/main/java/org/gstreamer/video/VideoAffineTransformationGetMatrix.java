package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface VideoAffineTransformationGetMatrix {
    boolean run(org.gstreamer.video.VideoAffineTransformationMeta meta, PointerFloat matrix);

    @ApiStatus.Internal default int upcall(MemoryAddress meta, MemoryAddress matrix) {
        var RESULT = run(org.gstreamer.video.VideoAffineTransformationMeta.fromAddress.marshal(meta, Ownership.NONE), new PointerFloat(matrix));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(VideoAffineTransformationGetMatrix.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
