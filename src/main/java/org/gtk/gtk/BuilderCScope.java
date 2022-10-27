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
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
    ).withName("GtkBuilderCScope");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public BuilderCScope(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to BuilderCScope */
    public static BuilderCScope castFrom(org.gtk.gobject.Object gobject) {
        return new BuilderCScope(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_builder_cscope_new.invokeExact(), true);
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
        super(constructNew());
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
     */
    public void addCallbackSymbols(@NotNull java.lang.String firstCallbackName, @NotNull org.gtk.gobject.Callback firstCallbackSymbol) {
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
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_builder_cscope_add_callback_symbol = Interop.downcallHandle(
            "gtk_builder_cscope_add_callback_symbol",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_builder_cscope_add_callback_symbols = Interop.downcallHandle(
            "gtk_builder_cscope_add_callback_symbols",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_builder_cscope_lookup_callback_symbol = Interop.downcallHandle(
            "gtk_builder_cscope_lookup_callback_symbol",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
