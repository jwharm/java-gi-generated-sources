package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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
public interface Native extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Returns the renderer that is used for this {@code GtkNative}.
     */
    public default org.gtk.gsk.Renderer getRenderer() {
        var RESULT = gtk_h.gtk_native_get_renderer(handle());
        return new org.gtk.gsk.Renderer(References.get(RESULT, false));
    }
    
    /**
     * Returns the surface of this {@code GtkNative}.
     */
    public default org.gtk.gdk.Surface getSurface() {
        var RESULT = gtk_h.gtk_native_get_surface(handle());
        return new org.gtk.gdk.Surface(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the surface transform of {@code self}.
     * <p>
     * This is the translation from {@code self}'s surface coordinates into
     * {@code self}'s widget coordinates.
     */
    public default void getSurfaceTransform(PointerDouble x, PointerDouble y) {
        gtk_h.gtk_native_get_surface_transform(handle(), x.handle(), y.handle());
    }
    
    /**
     * Realizes a {@code GtkNative}.
     * <p>
     * This should only be used by subclasses.
     */
    public default void realize() {
        gtk_h.gtk_native_realize(handle());
    }
    
    /**
     * Unrealizes a {@code GtkNative}.
     * <p>
     * This should only be used by subclasses.
     */
    public default void unrealize() {
        gtk_h.gtk_native_unrealize(handle());
    }
    
    /**
     * Finds the {@code GtkNative} associated with the surface.
     */
    public static Native getForSurface(org.gtk.gdk.Surface surface) {
        var RESULT = gtk_h.gtk_native_get_for_surface(surface.handle());
        return new Native.NativeImpl(References.get(RESULT, false));
    }
    
    class NativeImpl extends org.gtk.gobject.Object implements Native {
        public NativeImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
