package org.pango.cairo;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function type for rendering attributes of type {@link org.pango.AttrType#SHAPE}
 * with Pango's Cairo renderer.
 */
@FunctionalInterface
public interface ShapeRendererFunc {
    void run(org.cairographics.Context cr, org.pango.AttrShape attr, boolean doPath);

    @ApiStatus.Internal default void upcall(MemoryAddress cr, MemoryAddress attr, int doPath, MemoryAddress data) {
        run(org.cairographics.Context.fromAddress.marshal(cr, Ownership.NONE), org.pango.AttrShape.fromAddress.marshal(attr, Ownership.NONE), Marshal.integerToBoolean.marshal(doPath, null).booleanValue());
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ShapeRendererFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
