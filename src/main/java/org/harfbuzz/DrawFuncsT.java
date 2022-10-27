package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Glyph draw callbacks.
 * <p>
 * {@link DrawMoveToFuncT}, {@link DrawLineToFuncT} and
 * {@link DrawCubicToFuncT} calls are necessary to be defined but we translate
 * {@link DrawQuadraticToFuncT} calls to {@link DrawCubicToFuncT} if the
 * callback isn't defined.
 * @version 4.0.0
 */
public class DrawFuncsT extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public DrawFuncsT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
