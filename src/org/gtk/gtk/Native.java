package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkNative` is the interface implemented by all widgets that have
 * their own `GdkSurface`.
 * 
 * The obvious example of a `GtkNative` is `GtkWindow`.
 * 
 * Every widget that is not itself a `GtkNative` is contained in one,
 * and you can get it with [method@Gtk.Widget.get_native].
 * 
 * To get the surface of a `GtkNative`, use [method@Gtk.Native.get_surface].
 * It is also possible to find the `GtkNative` to which a surface
 * belongs, with [func@Gtk.Native.get_for_surface].
 * 
 * In addition to a [class@Gdk.Surface], a `GtkNative` also provides
 * a [class@Gsk.Renderer] for rendering on that surface. To get the
 * renderer, use [method@Gtk.Native.get_renderer].
 */
public interface Native extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Returns the renderer that is used for this `GtkNative`.
     */
    public default org.gtk.gsk.Renderer getRenderer() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_native_get_renderer(HANDLE());
        return new org.gtk.gsk.Renderer(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns the surface of this `GtkNative`.
     */
    public default org.gtk.gdk.Surface getSurface() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_native_get_surface(HANDLE());
        return new org.gtk.gdk.Surface(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Realizes a `GtkNative`.
     * 
     * This should only be used by subclasses.
     */
    public default void realize() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_native_realize(HANDLE());
    }
    
    /**
     * Unrealizes a `GtkNative`.
     * 
     * This should only be used by subclasses.
     */
    public default void unrealize() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_native_unrealize(HANDLE());
    }
    
    class NativeImpl extends org.gtk.gobject.Object implements Native {
        public NativeImpl(io.github.jwharm.javagi.interop.Proxy proxy) {
            super(proxy);
        }
    }
}
