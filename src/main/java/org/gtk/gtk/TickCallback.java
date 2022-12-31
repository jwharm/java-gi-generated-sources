package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Callback type for adding a function to update animations. See gtk_widget_add_tick_callback().
 */
@FunctionalInterface
public interface TickCallback {
    boolean run(org.gtk.gtk.Widget widget, org.gtk.gdk.FrameClock frameClock);

    @ApiStatus.Internal default int upcall(MemoryAddress widget, MemoryAddress frameClock, MemoryAddress userData) {
        var RESULT = run((org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(widget)), org.gtk.gtk.Widget.fromAddress).marshal(widget, Ownership.NONE), (org.gtk.gdk.FrameClock) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(frameClock)), org.gtk.gdk.FrameClock.fromAddress).marshal(frameClock, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TickCallback.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
