package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link UnicodeFuncsT} structure.
 * <p>
 * This method should retrieve the General Category property for
 * a specified Unicode code point.
 */
/**
 * Functional interface declaration of the {@code UnicodeGeneralCategoryFuncT} callback.
 */
@FunctionalInterface
public interface UnicodeGeneralCategoryFuncT {

    /**
     * A virtual method for the {@link UnicodeFuncsT} structure.
     * <p>
     * This method should retrieve the General Category property for
     * a specified Unicode code point.
     */
    org.harfbuzz.UnicodeGeneralCategoryT run(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.CodepointT unicode, @Nullable java.lang.foreign.MemoryAddress userData);
    
    @ApiStatus.Internal default int upcall(MemoryAddress ufuncs, int unicode, MemoryAddress userData) {
        var RESULT = run(org.harfbuzz.UnicodeFuncsT.fromAddress.marshal(ufuncs, null), new org.harfbuzz.CodepointT(unicode), userData);
        return RESULT.getValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UnicodeGeneralCategoryFuncT.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
