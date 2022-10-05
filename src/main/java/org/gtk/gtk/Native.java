package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * belongs, with {@link Gtk#Native_}.
 * <p>
 * In addition to a {@link org.gtk.gdk.Surface}, a {@code GtkNative} also provides
 * a {@link org.gtk.gsk.Renderer} for rendering on that surface. To get the
 * renderer, use {@link Native#getRenderer}.
 */
public interface Native extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle gtk_native_get_renderer = Interop.downcallHandle(
        "gtk_native_get_renderer",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the renderer that is used for this {@code GtkNative}.
     */
    public default org.gtk.gsk.Renderer getRenderer() {
        try {
            var RESULT = (MemoryAddress) gtk_native_get_renderer.invokeExact(handle());
            return new org.gtk.gsk.Renderer(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_native_get_surface = Interop.downcallHandle(
        "gtk_native_get_surface",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the surface of this {@code GtkNative}.
     */
    public default org.gtk.gdk.Surface getSurface() {
        try {
            var RESULT = (MemoryAddress) gtk_native_get_surface.invokeExact(handle());
            return new org.gtk.gdk.Surface(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_native_get_surface_transform = Interop.downcallHandle(
        "gtk_native_get_surface_transform",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the surface transform of {@code self}.
     * <p>
     * This is the translation from {@code self}'s surface coordinates into
     * {@code self}'s widget coordinates.
     */
    public default void getSurfaceTransform(PointerDouble x, PointerDouble y) {
        try {
            gtk_native_get_surface_transform.invokeExact(handle(), x.handle(), y.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_native_realize = Interop.downcallHandle(
        "gtk_native_realize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Realizes a {@code GtkNative}.
     * <p>
     * This should only be used by subclasses.
     */
    public default void realize() {
        try {
            gtk_native_realize.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_native_unrealize = Interop.downcallHandle(
        "gtk_native_unrealize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Unrealizes a {@code GtkNative}.
     * <p>
     * This should only be used by subclasses.
     */
    public default void unrealize() {
        try {
            gtk_native_unrealize.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_native_get_for_surface = Interop.downcallHandle(
        "gtk_native_get_for_surface",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the {@code GtkNative} associated with the surface.
     */
    public static Native getForSurface(org.gtk.gdk.Surface surface) {
        try {
            var RESULT = (MemoryAddress) gtk_native_get_for_surface.invokeExact(surface.handle());
            return new Native.NativeImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    class NativeImpl extends org.gtk.gobject.Object implements Native {
        public NativeImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
