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
public class DrawFuncsT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_draw_funcs_t";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DrawFuncsT}
     * @return A new, uninitialized @{link DrawFuncsT}
     */
    public static DrawFuncsT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DrawFuncsT newInstance = new DrawFuncsT(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DrawFuncsT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DrawFuncsT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DrawFuncsT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DrawFuncsT(input);
}
