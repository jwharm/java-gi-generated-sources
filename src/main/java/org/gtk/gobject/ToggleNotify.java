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
/**
 * Functional interface declaration of the {@code ToggleNotify} callback.
 */
@FunctionalInterface
public interface ToggleNotify {

    /**
     * A callback function used for notification when the state
     * of a toggle reference changes.
     * <p>
     * See also: g_object_add_toggle_ref()
     */
    void run(org.gtk.gobject.GObject object, boolean isLastRef);
    
    @ApiStatus.Internal default void upcall(MemoryAddress data, MemoryAddress object, int isLastRef) {
        run((org.gtk.gobject.GObject) Interop.register(object, org.gtk.gobject.GObject.fromAddress).marshal(object, null), Marshal.integerToBoolean.marshal(isLastRef, null).booleanValue());
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ToggleNotify.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
