package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Whenever {@code drawing_area} needs to redraw, this function will be called.
 * <p>
 * This function should exclusively redraw the contents of the drawing area
 * and must not call any widget functions that cause changes.
 */
/**
 * Functional interface declaration of the {@code DrawingAreaDrawFunc} callback.
 */
@FunctionalInterface
public interface DrawingAreaDrawFunc {

    /**
     * Whenever {@code drawing_area} needs to redraw, this function will be called.
     * <p>
     * This function should exclusively redraw the contents of the drawing area
     * and must not call any widget functions that cause changes.
     */
    void run(org.gtk.gtk.DrawingArea drawingArea, org.cairographics.Context cr, int width, int height);
    
    @ApiStatus.Internal default void upcall(MemoryAddress drawingArea, MemoryAddress cr, int width, int height, MemoryAddress userData) {
        run((org.gtk.gtk.DrawingArea) Interop.register(drawingArea, org.gtk.gtk.DrawingArea.fromAddress).marshal(drawingArea, null), org.cairographics.Context.fromAddress.marshal(cr, null), width, height);
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DrawingAreaDrawFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
