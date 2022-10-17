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
public class BuilderCScope extends org.gtk.gobject.Object implements BuilderScope {

    public BuilderCScope(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to BuilderCScope */
    public static BuilderCScope castFrom(org.gtk.gobject.Object gobject) {
        return new BuilderCScope(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_builder_cscope_new = Interop.downcallHandle(
        "gtk_builder_cscope_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_builder_cscope_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    
}
