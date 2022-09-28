package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkStyleProvider} is an interface for style information used by
 * {@code GtkStyleContext}.
 * <p>
 * See {@link StyleContext#addProvider} and
 * {@link Gtk#StyleContext} for
 * adding {@code GtkStyleProviders}.
 * <p>
 * GTK uses the {@code GtkStyleProvider} implementation for CSS in
 * {@link CssProvider}.
 */
public interface StyleProvider extends io.github.jwharm.javagi.Proxy {

    @FunctionalInterface
    public interface GtkPrivateChangedHandler {
        void signalReceived(StyleProvider source);
    }
    
    public default SignalHandle onGtkPrivateChanged(GtkPrivateChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("gtk-private-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(StyleProvider.Callbacks.class, "signalStyleProviderGtkPrivateChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static void signalStyleProviderGtkPrivateChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (StyleProvider.GtkPrivateChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new StyleProvider.StyleProviderImpl(References.get(source)));
        }
        
    }
    
    class StyleProviderImpl extends org.gtk.gobject.Object implements StyleProvider {
        public StyleProviderImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
