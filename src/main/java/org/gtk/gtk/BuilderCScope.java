package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkBuilderScope} implementation for the C language.
 * <p>
 * {@code GtkBuilderCScope} instances use symbols explicitly added to {@code builder}
 * with prior calls to {@link BuilderCScope#addCallbackSymbol}.
 * If developers want to do that, they are encouraged to create their
 * own scopes for that purpose.
 * <p>
 * In the case that symbols are not explicitly added; GTK will uses
 * {@code GModule}’s introspective features (by opening the module {@code null}) to
 * look at the application’s symbol table. From here it tries to match
 * the signal function names given in the interface description with
 * symbols in the application.
 * <p>
 * Note that unless {@link BuilderCScope#addCallbackSymbol} is
 * called for all signal callbacks which are referenced by the loaded XML,
 * this functionality will require that {@code GModule} be supported on the platform.
 */
public class BuilderCScope extends org.gtk.gobject.GObject implements org.gtk.gtk.BuilderScope {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkBuilderCScope";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a BuilderCScope proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected BuilderCScope(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, BuilderCScope> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new BuilderCScope(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_builder_cscope_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkBuilderCScope} object to use with future
     * {@code GtkBuilder} instances.
     * <p>
     * Calling this function is only necessary if you want to add
     * custom callbacks via {@link BuilderCScope#addCallbackSymbol}.
     */
    public BuilderCScope() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Adds the {@code callback_symbol} to the scope of {@code builder} under the
     * given {@code callback_name}.
     * <p>
     * Using this function overrides the behavior of
     * {@link GtkBuilder#createClosure} for any callback symbols that
     * are added. Using this method allows for better encapsulation as it
     * does not require that callback symbols be declared in the global
     * namespace.
     * @param callbackName The name of the callback, as expected in the XML
     * @param callbackSymbol The callback pointer
     */
    public void addCallbackSymbol(java.lang.String callbackName, org.gtk.gobject.Callback callbackSymbol) {
        try {
            DowncallHandles.gtk_builder_cscope_add_callback_symbol.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(callbackName, null),
                    (Addressable) callbackSymbol.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A convenience function to add many callbacks.
     * <p>
     * This is equivalent to calling {@link BuilderCScope#addCallbackSymbol}
     * for each symbol.
     * @param firstCallbackName The name of the callback, as expected in the XML
     * @param firstCallbackSymbol The callback pointer
     * @param varargs A list of callback name and callback symbol pairs terminated with {@code null}
     */
    public void addCallbackSymbols(java.lang.String firstCallbackName, org.gtk.gobject.Callback firstCallbackSymbol, java.lang.Object... varargs) {
        try {
            DowncallHandles.gtk_builder_cscope_add_callback_symbols.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(firstCallbackName, null),
                    (Addressable) firstCallbackSymbol.toCallback(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fetches a symbol previously added with
     * gtk_builder_cscope_add_callback_symbol().
     * @param callbackName The name of the callback
     * @return The callback symbol
     *   in {@code builder} for {@code callback_name}
     */
    public @Nullable org.gtk.gobject.Callback lookupCallbackSymbol(java.lang.String callbackName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_builder_cscope_lookup_callback_symbol.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(callbackName, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_builder_cscope_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link BuilderCScope.Builder} object constructs a {@link BuilderCScope} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link BuilderCScope.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link BuilderCScope} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link BuilderCScope}.
         * @return A new instance of {@code BuilderCScope} with the properties 
         *         that were set in the Builder object.
         */
        public BuilderCScope build() {
            return (BuilderCScope) org.gtk.gobject.GObject.newWithProperties(
                BuilderCScope.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_builder_cscope_new = Interop.downcallHandle(
            "gtk_builder_cscope_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_cscope_add_callback_symbol = Interop.downcallHandle(
            "gtk_builder_cscope_add_callback_symbol",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_cscope_add_callback_symbols = Interop.downcallHandle(
            "gtk_builder_cscope_add_callback_symbols",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_builder_cscope_lookup_callback_symbol = Interop.downcallHandle(
            "gtk_builder_cscope_lookup_callback_symbol",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_cscope_get_type = Interop.downcallHandle(
            "gtk_builder_cscope_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
