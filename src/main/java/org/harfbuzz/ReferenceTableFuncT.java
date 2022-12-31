package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Callback function for hb_face_create_for_tables().
 * @version 0.9.2
 */
@FunctionalInterface
public interface ReferenceTableFuncT {
    org.harfbuzz.BlobT run(org.harfbuzz.FaceT face, org.harfbuzz.TagT tag, @Nullable java.lang.foreign.MemoryAddress userData);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress face, int tag, MemoryAddress userData) {
        var RESULT = run(org.harfbuzz.FaceT.fromAddress.marshal(face, Ownership.NONE), new org.harfbuzz.TagT(tag), userData);
        return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReferenceTableFuncT.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
