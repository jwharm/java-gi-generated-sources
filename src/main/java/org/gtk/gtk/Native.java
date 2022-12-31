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
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, NativeImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new NativeImpl(input, ownership);
    
    /**
     * Returns the renderer that is used for this {@code GtkNative}.
     * @return the renderer for {@code self}
     */
    default org.gtk.gsk.Renderer getRenderer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_native_get_renderer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gsk.Renderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gsk.Renderer.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the surface of this {@code GtkNative}.
     * @return the surface of {@code self}
     */
    default org.gtk.gdk.Surface getSurface() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_native_get_surface.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Surface) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Surface.fromAddress).marshal(RESULT, Ownership.NONE);
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
        MemorySegment xPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        try {
            DowncallHandles.gtk_native_get_surface_transform.invokeExact(
                    handle(),
                    (Addressable) xPOINTER.address(),
                    (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(xPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        y.set(yPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
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
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_native_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Finds the {@code GtkNative} associated with the surface.
     * @param surface a {@code GdkSurface}
     * @return the {@code GtkNative} that is associated with {@code surface}
     */
    public static @Nullable org.gtk.gtk.Native getForSurface(org.gtk.gdk.Surface surface) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_native_get_for_surface.invokeExact(
                    surface.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Native) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Native.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_native_get_renderer = Interop.downcallHandle(
            "gtk_native_get_renderer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_native_get_surface = Interop.downcallHandle(
            "gtk_native_get_surface",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_native_get_surface_transform = Interop.downcallHandle(
            "gtk_native_get_surface_transform",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_native_realize = Interop.downcallHandle(
            "gtk_native_realize",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_native_unrealize = Interop.downcallHandle(
            "gtk_native_unrealize",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_native_get_type = Interop.downcallHandle(
            "gtk_native_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_native_get_for_surface = Interop.downcallHandle(
            "gtk_native_get_for_surface",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    class NativeImpl extends org.gtk.gobject.GObject implements Native {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public NativeImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
