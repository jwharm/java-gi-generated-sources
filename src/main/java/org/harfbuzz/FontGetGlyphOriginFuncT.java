package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
 * <p>
 * This method should retrieve the (X,Y) coordinates (in font units) of the
 * origin for a glyph. Each coordinate must be returned in an {@link PositionT}
 * output parameter.
 */
/**
 * Functional interface declaration of the {@code FontGetGlyphOriginFuncT} callback.
 */
@FunctionalInterface
public interface FontGetGlyphOriginFuncT {

    /**
     * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
     * <p>
     * This method should retrieve the (X,Y) coordinates (in font units) of the
     * origin for a glyph. Each coordinate must be returned in an {@link PositionT}
     * output parameter.
     */
    org.harfbuzz.BoolT run(org.harfbuzz.FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, org.harfbuzz.CodepointT glyph, org.harfbuzz.PositionT x, org.harfbuzz.PositionT y, @Nullable java.lang.foreign.MemoryAddress userData);
    
    @ApiStatus.Internal default int upcall(MemoryAddress font, MemoryAddress fontData, int glyph, MemoryAddress x, MemoryAddress y, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            org.harfbuzz.PositionT xALIAS = new org.harfbuzz.PositionT(x.get(Interop.valueLayout.C_INT, 0));
            org.harfbuzz.PositionT yALIAS = new org.harfbuzz.PositionT(y.get(Interop.valueLayout.C_INT, 0));
            var RESULT = run(org.harfbuzz.FontT.fromAddress.marshal(font, null), fontData, new org.harfbuzz.CodepointT(glyph), xALIAS, yALIAS, userData);
            x.set(Interop.valueLayout.C_INT, 0, xALIAS.getValue());
            y.set(Interop.valueLayout.C_INT, 0, yALIAS.getValue());
            return RESULT.getValue().intValue();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FontGetGlyphOriginFuncT.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
