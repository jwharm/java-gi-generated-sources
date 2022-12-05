package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An event caused by a pointing device moving between surfaces.
 */
public class CrossingEvent extends org.gtk.gdk.Event {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkCrossingEvent";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CrossingEvent proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CrossingEvent(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to CrossingEvent if its GType is a (or inherits from) "GdkCrossingEvent".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CrossingEvent} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkCrossingEvent", a ClassCastException will be thrown.
     */
    public static CrossingEvent castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), CrossingEvent.getType())) {
            return new CrossingEvent(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkCrossingEvent");
        }
    }
    
    /**
     * Extracts the notify detail from a crossing event.
     * @return the notify detail of {@code event}
     */
    public @NotNull org.gtk.gdk.NotifyType getDetail() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_crossing_event_get_detail.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.NotifyType.of(RESULT);
    }
    
    /**
     * Checks if the {@code event} surface is the focus surface.
     * @return {@code true} if the surface is the focus surface
     */
    public boolean getFocus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_crossing_event_get_focus.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Extracts the crossing mode from a crossing event.
     * @return the mode of {@code event}
     */
    public @NotNull org.gtk.gdk.CrossingMode getMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_crossing_event_get_mode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.CrossingMode.of(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_crossing_event_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gdk.Event.Build {
        
         /**
         * A {@link CrossingEvent.Build} object constructs a {@link CrossingEvent} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link CrossingEvent} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CrossingEvent} using {@link CrossingEvent#castFrom}.
         * @return A new instance of {@code CrossingEvent} with the properties 
         *         that were set in the Build object.
         */
        public CrossingEvent construct() {
            return CrossingEvent.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    CrossingEvent.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_crossing_event_get_detail = Interop.downcallHandle(
            "gdk_crossing_event_get_detail",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_crossing_event_get_focus = Interop.downcallHandle(
            "gdk_crossing_event_get_focus",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_crossing_event_get_mode = Interop.downcallHandle(
            "gdk_crossing_event_get_mode",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_crossing_event_get_type = Interop.downcallHandle(
            "gdk_crossing_event_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
