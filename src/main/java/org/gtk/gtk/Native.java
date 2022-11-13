package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkNative} is the interface implemented by all widgets that have
 * their own {@code GdkSurface}.
 * <p>
 * The obvious example of a {@code GtkNative} is {@code GtkWindow}.
 * <p>
 * Every widget that is not itself a {@code GtkNative} is contained in one,
 * and you can get it with {@link Widget#getNative}.
 * <p>
 * To get the surface of a {@code GtkNative}, use {@link Native#getSurface}.
 * It is also possible to find the {@code GtkNative} to which a surface
 * belongs, with {@link Native#getForSurface}.
 * <p>
 * In addition to a {@link org.gtk.gdk.Surface}, a {@code GtkNative} also provides
 * a {@link org.gtk.gsk.Renderer} for rendering on that surface. To get the
 * renderer, use {@link Native#getRenderer}.
 */
public interface Native extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to Native if its GType is a (or inherits from) "GtkNative".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Native} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkNative", a ClassCastException will be thrown.
     */
    public static Native castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkNative"))) {
            return new NativeImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkNative");
        }
    }
    
    /**
     * Returns the renderer that is used for this {@code GtkNative}.
     * @return the renderer for {@code self}
     */
    default @NotNull org.gtk.gsk.Renderer getRenderer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_native_get_renderer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.Renderer(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the surface of this {@code GtkNative}.
     * @return the surface of {@code self}
     */
    default @NotNull org.gtk.gdk.Surface getSurface() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_native_get_surface.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Surface(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the surface transform of {@code self}.
     * <p>
     * This is the translation from {@code self}'s surface coordinates into
     * {@code self}'s widget coordinates.
     * @param x return location for the x coordinate
     * @param y return location for the y coordinate
     */
    default void getSurfaceTransform(Out<Double> x, Out<Double> y) {
        java.util.Objects.requireNonNull(x, "Parameter 'x' must not be null");
        java.util.Objects.requireNonNull(y, "Parameter 'y' must not be null");
        MemorySegment xPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        try {
            DowncallHandles.gtk_native_get_surface_transform.invokeExact(
                    handle(),
                    (Addressable) xPOINTER.address(),
                    (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(xPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        y.set(yPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
    }
    
    /**
     * Realizes a {@code GtkNative}.
     * <p>
     * This should only be used by subclasses.
     */
    default void realize() {
        try {
            DowncallHandles.gtk_native_realize.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unrealizes a {@code GtkNative}.
     * <p>
     * This should only be used by subclasses.
     */
    default void unrealize() {
        try {
            DowncallHandles.gtk_native_unrealize.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finds the {@code GtkNative} associated with the surface.
     * @param surface a {@code GdkSurface}
     * @return the {@code GtkNative} that is associated with {@code surface}
     */
    public static @Nullable org.gtk.gtk.Native getForSurface(@NotNull org.gtk.gdk.Surface surface) {
        java.util.Objects.requireNonNull(surface, "Parameter 'surface' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_native_get_for_surface.invokeExact(
                    surface.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Native.NativeImpl(RESULT, Ownership.NONE);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_native_get_renderer = Interop.downcallHandle(
            "gtk_native_get_renderer",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_native_get_surface = Interop.downcallHandle(
            "gtk_native_get_surface",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_native_get_surface_transform = Interop.downcallHandle(
            "gtk_native_get_surface_transform",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_native_realize = Interop.downcallHandle(
            "gtk_native_realize",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_native_unrealize = Interop.downcallHandle(
            "gtk_native_unrealize",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_native_get_for_surface = Interop.downcallHandle(
            "gtk_native_get_for_surface",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
    
    class NativeImpl extends org.gtk.gobject.Object implements Native {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public NativeImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
