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
public class BuilderCScope extends org.gtk.gobject.Object implements org.gtk.gtk.BuilderScope {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkBuilderCScope";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a BuilderCScope proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BuilderCScope(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to BuilderCScope if its GType is a (or inherits from) "GtkBuilderCScope".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code BuilderCScope} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkBuilderCScope", a ClassCastException will be thrown.
     */
    public static BuilderCScope castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkBuilderCScope"))) {
            return new BuilderCScope(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkBuilderCScope");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
     * {@link Builder#createClosure} for any callback symbols that
     * are added. Using this method allows for better encapsulation as it
     * does not require that callback symbols be declared in the global
     * namespace.
     * @param callbackName The name of the callback, as expected in the XML
     * @param callbackSymbol The callback pointer
     */
    public void addCallbackSymbol(@NotNull java.lang.String callbackName, @NotNull org.gtk.gobject.Callback callbackSymbol) {
        throw new UnsupportedOperationException("Operation not supported yet");
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
    public void addCallbackSymbols(@NotNull java.lang.String firstCallbackName, @NotNull org.gtk.gobject.Callback firstCallbackSymbol, java.lang.Object... varargs) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Fetches a symbol previously added with
     * gtk_builder_cscope_add_callback_symbol().
     * @param callbackName The name of the callback
     * @return The callback symbol
     *   in {@code builder} for {@code callback_name}
     */
    public @Nullable org.gtk.gobject.Callback lookupCallbackSymbol(@NotNull java.lang.String callbackName) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_builder_cscope_new = Interop.downcallHandle(
            "gtk_builder_cscope_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_cscope_add_callback_symbol = Interop.downcallHandle(
            "gtk_builder_cscope_add_callback_symbol",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_cscope_add_callback_symbols = Interop.downcallHandle(
            "gtk_builder_cscope_add_callback_symbols",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_builder_cscope_lookup_callback_symbol = Interop.downcallHandle(
            "gtk_builder_cscope_lookup_callback_symbol",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
