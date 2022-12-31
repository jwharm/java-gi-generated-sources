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
@FunctionalInterface
public interface DrawingAreaDrawFunc {
    void run(org.gtk.gtk.DrawingArea drawingArea, org.cairographics.Context cr, int width, int height);

    @ApiStatus.Internal default void upcall(MemoryAddress drawingArea, MemoryAddress cr, int width, int height, MemoryAddress userData) {
        run((org.gtk.gtk.DrawingArea) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drawingArea)), org.gtk.gtk.DrawingArea.fromAddress).marshal(drawingArea, Ownership.NONE), org.cairographics.Context.fromAddress.marshal(cr, Ownership.NONE), width, height);
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DrawingAreaDrawFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
