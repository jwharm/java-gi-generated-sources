package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
 * @version 4.0.0
 */
@FunctionalInterface
public interface FontGetGlyphShapeFuncT {
    void run(org.harfbuzz.FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, org.harfbuzz.CodepointT glyph, org.harfbuzz.DrawFuncsT drawFuncs, @Nullable java.lang.foreign.MemoryAddress drawData, @Nullable java.lang.foreign.MemoryAddress userData);

    @ApiStatus.Internal default void upcall(MemoryAddress font, MemoryAddress fontData, int glyph, MemoryAddress drawFuncs, MemoryAddress drawData, MemoryAddress userData) {
        run(org.harfbuzz.FontT.fromAddress.marshal(font, Ownership.NONE), fontData, new org.harfbuzz.CodepointT(glyph), org.harfbuzz.DrawFuncsT.fromAddress.marshal(drawFuncs, Ownership.NONE), drawData, userData);
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FontGetGlyphShapeFuncT.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
