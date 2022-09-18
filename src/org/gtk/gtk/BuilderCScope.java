package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GtkBuilderScope</code> implementation for the C language.
 * <p><code>GtkBuilderCScope</code> instances use symbols explicitly added to @builder
 * with prior calls to {@link org.gtk.gtk.BuilderCScope<code>#addCallbackSymbol</code> .
 * If developers want to do that, they are encouraged to create their
 * own scopes for that purpose.
 * <p>
 * In the case that symbols are not explicitly added; GTK will uses<code>GModule</code>&<code>#8217</code> s introspective features (by opening the module <code>null</code>  to
 * look at the application&<code>#8217</code> s symbol table. From here it tries to match
 * the signal function names given in the interface description with
 * symbols in the application.
 * <p>
 * Note that unless {@link org.gtk.gtk.BuilderCScope<code>#addCallbackSymbol</code>  is
 * called for all signal callbacks which are referenced by the loaded XML,
 * this functionality will require that <code>GModule</code> be supported on the platform.
 */
public class BuilderCScope extends org.gtk.gobject.Object implements BuilderScope {

    public BuilderCScope(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to BuilderCScope */
    public static BuilderCScope castFrom(org.gtk.gobject.Object gobject) {
        return new BuilderCScope(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_builder_cscope_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkBuilderCScope</code> object to use with future<code>GtkBuilder</code> instances.
     * 
     * Calling this function is only necessary if you want to add
     * custom callbacks via {@link org.gtk.gtk.BuilderCScope<code>#addCallbackSymbol</code> .
     */
    public BuilderCScope() {
        super(constructNew());
    }
    
}
