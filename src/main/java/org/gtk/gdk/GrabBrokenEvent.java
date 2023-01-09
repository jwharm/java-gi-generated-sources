package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An event related to a broken windowing system grab.
 */
public class GrabBrokenEvent extends org.gtk.gdk.Event {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkGrabBrokenEvent";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a GrabBrokenEvent proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GrabBrokenEvent(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GrabBrokenEvent> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GrabBrokenEvent(input);
    
    /**
     * Extracts the grab surface from a grab broken event.
     * @return the grab surface of {@code event}
     */
    public org.gtk.gdk.Surface getGrabSurface() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_grab_broken_event_get_grab_surface.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Surface) Interop.register(RESULT, org.gtk.gdk.Surface.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Checks whether the grab broken event is for an implicit grab.
     * @return {@code true} if the an implicit grab was broken
     */
    public boolean getImplicit() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_grab_broken_event_get_implicit.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_grab_broken_event_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_grab_broken_event_get_grab_surface = Interop.downcallHandle(
                "gdk_grab_broken_event_get_grab_surface",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_grab_broken_event_get_implicit = Interop.downcallHandle(
                "gdk_grab_broken_event_get_implicit",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_grab_broken_event_get_type = Interop.downcallHandle(
                "gdk_grab_broken_event_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gdk_grab_broken_event_get_type != null;
    }
}
