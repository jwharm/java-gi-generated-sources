package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkBuilderScope` implementation for the C language.
 * 
 * `GtkBuilderCScope` instances use symbols explicitly added to @builder
 * with prior calls to [method@Gtk.BuilderCScope.add_callback_symbol].
 * If developers want to do that, they are encouraged to create their
 * own scopes for that purpose.
 * 
 * In the case that symbols are not explicitly added; GTK will uses
 * `GModule`’s introspective features (by opening the module %NULL) to
 * look at the application’s symbol table. From here it tries to match
 * the signal function names given in the interface description with
 * symbols in the application.
 * 
 * Note that unless [method@Gtk.BuilderCScope.add_callback_symbol] is
 * called for all signal callbacks which are referenced by the loaded XML,
 * this functionality will require that `GModule` be supported on the platform.
 */
public class BuilderCScope extends org.gtk.gobject.Object implements BuilderScope {

    public BuilderCScope(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to BuilderCScope */
    public static BuilderCScope castFrom(org.gtk.gobject.Object gobject) {
        return new BuilderCScope(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkBuilderCScope` object to use with future
     * `GtkBuilder` instances.
     * 
     * Calling this function is only necessary if you want to add
     * custom callbacks via [method@Gtk.BuilderCScope.add_callback_symbol].
     */
    public BuilderCScope() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_builder_cscope_new(), true));
    }
    
}
