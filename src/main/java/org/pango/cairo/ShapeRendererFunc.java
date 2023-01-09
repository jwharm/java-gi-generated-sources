package org.pango.cairo;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function type for rendering attributes of type {@link org.pango.AttrType#SHAPE}
 * with Pango's Cairo renderer.
 */
/**
 * Functional interface declaration of the {@code ShapeRendererFunc} callback.
 */
@FunctionalInterface
public interface ShapeRendererFunc {

    /**
     * Function type for rendering attributes of type {@link org.pango.AttrType#SHAPE}
     * with Pango's Cairo renderer.
     */
    void run(org.cairographics.Context cr, org.pango.AttrShape attr, boolean doPath);
    
    @ApiStatus.Internal default void upcall(MemoryAddress cr, MemoryAddress attr, int doPath, MemoryAddress data) {
        run(org.cairographics.Context.fromAddress.marshal(cr, null), org.pango.AttrShape.fromAddress.marshal(attr, null), Marshal.integerToBoolean.marshal(doPath, null).booleanValue());
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ShapeRendererFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
