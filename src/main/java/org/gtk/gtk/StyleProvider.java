package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkStyleProvider} is an interface for style information used by
 * {@code GtkStyleContext}.
 * <p>
 * See {@link StyleContext#addProvider} and
 * {@link StyleContext#addProviderForDisplay} for
 * adding {@code GtkStyleProviders}.
 * <p>
 * GTK uses the {@code GtkStyleProvider} implementation for CSS in
 * {@link CssProvider}.
 */
public interface StyleProvider extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to StyleProvider if its GType is a (or inherits from) "GtkStyleProvider".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "StyleProvider" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkStyleProvider", a ClassCastException will be thrown.
     */
    public static StyleProvider castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkStyleProvider"))) {
            return new StyleProviderImpl(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkStyleProvider");
        }
    }
    
    @FunctionalInterface
    public interface GtkPrivateChanged {
        void signalReceived(StyleProvider source);
    }
    
    public default Signal<StyleProvider.GtkPrivateChanged> onGtkPrivateChanged(StyleProvider.GtkPrivateChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("gtk-private-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(StyleProvider.Callbacks.class, "signalStyleProviderGtkPrivateChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<StyleProvider.GtkPrivateChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class Callbacks {
        
        public static void signalStyleProviderGtkPrivateChanged(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (StyleProvider.GtkPrivateChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new StyleProvider.StyleProviderImpl(Refcounted.get(source)));
        }
    }
    
    class StyleProviderImpl extends org.gtk.gobject.Object implements StyleProvider {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public StyleProviderImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
