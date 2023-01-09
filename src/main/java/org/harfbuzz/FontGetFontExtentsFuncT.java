package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This method should retrieve the extents for a font.
 */
/**
 * Functional interface declaration of the {@code FontGetFontExtentsFuncT} callback.
 */
@FunctionalInterface
public interface FontGetFontExtentsFuncT {

    /**
     * This method should retrieve the extents for a font.
     */
    org.harfbuzz.BoolT run(org.harfbuzz.FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, org.harfbuzz.FontExtentsT extents, @Nullable java.lang.foreign.MemoryAddress userData);
    
    @ApiStatus.Internal default int upcall(MemoryAddress font, MemoryAddress fontData, MemoryAddress extents, MemoryAddress userData) {
        var RESULT = run(org.harfbuzz.FontT.fromAddress.marshal(font, null), fontData, org.harfbuzz.FontExtentsT.fromAddress.marshal(extents, null), userData);
        return RESULT.getValue().intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FontGetFontExtentsFuncT.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
