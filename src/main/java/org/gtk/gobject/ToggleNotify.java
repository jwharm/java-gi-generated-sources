package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A callback function used for notification when the state
 * of a toggle reference changes.
 * <p>
 * See also: g_object_add_toggle_ref()
 */
@FunctionalInterface
public interface ToggleNotify {
    void run(org.gtk.gobject.GObject object, boolean isLastRef);

    @ApiStatus.Internal default void upcall(MemoryAddress data, MemoryAddress object, int isLastRef) {
        run((org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gtk.gobject.GObject.fromAddress).marshal(object, Ownership.NONE), Marshal.integerToBoolean.marshal(isLastRef, null).booleanValue());
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ToggleNotify.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
