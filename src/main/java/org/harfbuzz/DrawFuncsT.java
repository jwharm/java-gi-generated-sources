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
    
    private static final java.lang.String C_TYPE_NAME = "hb_draw_funcs_t";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static DrawFuncsT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DrawFuncsT newInstance = new DrawFuncsT(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public DrawFuncsT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
