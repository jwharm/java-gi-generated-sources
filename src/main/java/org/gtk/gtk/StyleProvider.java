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
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, StyleProviderImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new StyleProviderImpl(input, ownership);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_style_provider_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface GtkPrivateChanged {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceStyleProvider) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkPrivateChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public default Signal<StyleProvider.GtkPrivateChanged> onGtkPrivateChanged(StyleProvider.GtkPrivateChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("gtk-private-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_style_provider_get_type = Interop.downcallHandle(
            "gtk_style_provider_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class StyleProviderImpl extends org.gtk.gobject.GObject implements StyleProvider {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public StyleProviderImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
