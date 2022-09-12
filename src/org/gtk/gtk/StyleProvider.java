package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkStyleProvider` is an interface for style information used by
 * `GtkStyleContext`.
 * 
 * See [method@Gtk.StyleContext.add_provider] and
 * [func@Gtk.StyleContext.add_provider_for_display] for
 * adding `GtkStyleProviders`.
 * 
 * GTK uses the `GtkStyleProvider` implementation for CSS in
 * [class@Gtk.CssProvider].
 */
public interface StyleProvider extends io.github.jwharm.javagi.NativeAddress {

    @FunctionalInterface
    public interface GtkPrivateChangedHandler {
        void signalReceived(StyleProvider source);
    }
    
    public default SignalHandle onGtkPrivateChanged(GtkPrivateChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalStyleProviderGtkPrivateChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("gtk-private-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class StyleProviderImpl extends org.gtk.gobject.Object implements StyleProvider {
        public StyleProviderImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
