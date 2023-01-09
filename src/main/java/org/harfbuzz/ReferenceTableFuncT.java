package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Callback function for hb_face_create_for_tables().
 * @version 0.9.2
 */
/**
 * Functional interface declaration of the {@code ReferenceTableFuncT} callback.
 */
@FunctionalInterface
public interface ReferenceTableFuncT {

    /**
     * Callback function for hb_face_create_for_tables().
     * @version 0.9.2
     */
    org.harfbuzz.BlobT run(org.harfbuzz.FaceT face, org.harfbuzz.TagT tag, @Nullable java.lang.foreign.MemoryAddress userData);
    
    @ApiStatus.Internal default Addressable upcall(MemoryAddress face, int tag, MemoryAddress userData) {
        var RESULT = run(org.harfbuzz.FaceT.fromAddress.marshal(face, null), new org.harfbuzz.TagT(tag), userData);
        RESULT.yieldOwnership();
        return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReferenceTableFuncT.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
