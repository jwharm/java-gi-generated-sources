package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkBuilderListItemFactory</code> is a <code>GtkListItemFactory</code> that creates
 * widgets by instantiating <code>GtkBuilder</code> UI templates.
 * <p>
 * The templates must be extending <code>GtkListItem</code>, and typically use<code>GtkExpression</code>s to obtain data from the items in the model.
 * <p>
 * Example:<pre>xml
 *   &<code>#60</code> interface&<code>#62</code> 
 *     &<code>#60</code> template class=&<code>#34</code> GtkListItem&<code>#34</code> &<code>#62</code> 
 *       &<code>#60</code> property name=&<code>#34</code> child&<code>#34</code> &<code>#62</code> 
 *         &<code>#60</code> object class=&<code>#34</code> GtkLabel&<code>#34</code> &<code>#62</code> 
 *           &<code>#60</code> property name=&<code>#34</code> xalign&<code>#34</code> &<code>#62</code> 0&<code>#60</code> /property&<code>#62</code> 
 *           &<code>#60</code> binding name=&<code>#34</code> label&<code>#34</code> &<code>#62</code> 
 *             &<code>#60</code> lookup name=&<code>#34</code> name&<code>#34</code>  type=&<code>#34</code> SettingsKey&<code>#34</code> &<code>#62</code> 
 *               &<code>#60</code> lookup name=&<code>#34</code> item&<code>#34</code> &<code>#62</code> GtkListItem&<code>#60</code> /lookup&<code>#62</code> 
 *             &<code>#60</code> /lookup&<code>#62</code> 
 *           &<code>#60</code> /binding&<code>#62</code> 
 *         &<code>#60</code> /object&<code>#62</code> 
 *       &<code>#60</code> /property&<code>#62</code> 
 *     &<code>#60</code> /template&<code>#62</code> 
 *   &<code>#60</code> /interface&<code>#62</code> 
 * </pre>
 */
public class BuilderListItemFactory extends ListItemFactory {

    public BuilderListItemFactory(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to BuilderListItemFactory */
    public static BuilderListItemFactory castFrom(org.gtk.gobject.Object gobject) {
        return new BuilderListItemFactory(gobject.getReference());
    }
    
    private static Reference constructNewFromBytes(BuilderScope scope, org.gtk.glib.Bytes bytes) {
        Reference RESULT = References.get(gtk_h.gtk_builder_list_item_factory_new_from_bytes(scope.handle(), bytes.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkBuilderListItemFactory</code> that instantiates widgets
     * using @bytes as the data to pass to <code>GtkBuilder</code>.
     */
    public static BuilderListItemFactory newFromBytes(BuilderScope scope, org.gtk.glib.Bytes bytes) {
        return new BuilderListItemFactory(constructNewFromBytes(scope, bytes));
    }
    
    private static Reference constructNewFromResource(BuilderScope scope, java.lang.String resourcePath) {
        Reference RESULT = References.get(gtk_h.gtk_builder_list_item_factory_new_from_resource(scope.handle(), Interop.allocateNativeString(resourcePath).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkBuilderListItemFactory</code> that instantiates widgets
     * using data read from the given @resource_path to pass to <code>GtkBuilder</code>.
     */
    public static BuilderListItemFactory newFromResource(BuilderScope scope, java.lang.String resourcePath) {
        return new BuilderListItemFactory(constructNewFromResource(scope, resourcePath));
    }
    
    /**
     * Gets the data used as the <code>GtkBuilder</code> UI template for constructing
     * listitems.
     */
    public org.gtk.glib.Bytes getBytes() {
        var RESULT = gtk_h.gtk_builder_list_item_factory_get_bytes(handle());
        return new org.gtk.glib.Bytes(References.get(RESULT, false));
    }
    
    /**
     * If the data references a resource, gets the path of that resource.
     */
    public java.lang.String getResource() {
        var RESULT = gtk_h.gtk_builder_list_item_factory_get_resource(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the scope used when constructing listitems.
     */
    public BuilderScope getScope() {
        var RESULT = gtk_h.gtk_builder_list_item_factory_get_scope(handle());
        return new BuilderScope.BuilderScopeImpl(References.get(RESULT, false));
    }
    
}
