package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
 * <p>
 * This method should retrieve the advance for a specified glyph. The
 * method must return an {@link PositionT}.
 */
/**
 * Functional interface declaration of the {@code FontGetGlyphAdvanceFuncT} callback.
 */
@FunctionalInterface
public interface FontGetGlyphAdvanceFuncT {

    /**
     * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
     * <p>
     * This method should retrieve the advance for a specified glyph. The
     * method must return an {@link PositionT}.
     */
    org.harfbuzz.PositionT run(org.harfbuzz.FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, org.harfbuzz.CodepointT glyph, @Nullable java.lang.foreign.MemoryAddress userData);
    
    @ApiStatus.Internal default int upcall(MemoryAddress font, MemoryAddress fontData, int glyph, MemoryAddress userData) {
        var RESULT = run(org.harfbuzz.FontT.fromAddress.marshal(font, null), fontData, new org.harfbuzz.CodepointT(glyph), userData);
        return RESULT.getValue().intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FontGetGlyphAdvanceFuncT.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
