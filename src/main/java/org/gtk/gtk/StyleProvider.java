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
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, StyleProviderImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new StyleProviderImpl(input);
    
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
    
    /**
     * Functional interface declaration of the {@code GtkPrivateChanged} callback.
     */
    @FunctionalInterface
    public interface GtkPrivateChanged {
    
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceStyleProvider) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GtkPrivateChanged.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    public default Signal<StyleProvider.GtkPrivateChanged> onGtkPrivateChanged(StyleProvider.GtkPrivateChanged handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("gtk-private-changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
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
    
    /**
     * The StyleProviderImpl type represents a native instance of the StyleProvider interface.
     */
    class StyleProviderImpl extends org.gtk.gobject.GObject implements StyleProvider {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of StyleProvider for the provided memory address.
         * @param address the memory address of the instance
         */
        public StyleProviderImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_style_provider_get_type != null;
    }
}
