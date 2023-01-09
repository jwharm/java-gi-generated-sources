package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
 * @version 4.0.0
 */
/**
 * Functional interface declaration of the {@code FontGetGlyphShapeFuncT} callback.
 */
@FunctionalInterface
public interface FontGetGlyphShapeFuncT {

    /**
     * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
     * @version 4.0.0
     */
    void run(org.harfbuzz.FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, org.harfbuzz.CodepointT glyph, org.harfbuzz.DrawFuncsT drawFuncs, @Nullable java.lang.foreign.MemoryAddress drawData, @Nullable java.lang.foreign.MemoryAddress userData);
    
    @ApiStatus.Internal default void upcall(MemoryAddress font, MemoryAddress fontData, int glyph, MemoryAddress drawFuncs, MemoryAddress drawData, MemoryAddress userData) {
        run(org.harfbuzz.FontT.fromAddress.marshal(font, null), fontData, new org.harfbuzz.CodepointT(glyph), org.harfbuzz.DrawFuncsT.fromAddress.marshal(drawFuncs, null), drawData, userData);
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FontGetGlyphShapeFuncT.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
