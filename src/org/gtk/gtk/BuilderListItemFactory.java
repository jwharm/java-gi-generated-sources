package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkBuilderListItemFactory` is a `GtkListItemFactory` that creates
 * widgets by instantiating `GtkBuilder` UI templates.
 * 
 * The templates must be extending `GtkListItem`, and typically use
 * `GtkExpression`s to obtain data from the items in the model.
 * 
 * Example:
 * ```xml
 *   <interface>
 *     <template class="GtkListItem">
 *       <property name="child">
 *         <object class="GtkLabel">
 *           <property name="xalign">0</property>
 *           <binding name="label">
 *             <lookup name="name" type="SettingsKey">
 *               <lookup name="item">GtkListItem</lookup>
 *             </lookup>
 *           </binding>
 *         </object>
 *       </property>
 *     </template>
 *   </interface>
 * ```
 */
public class BuilderListItemFactory extends ListItemFactory {

    public BuilderListItemFactory(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to BuilderListItemFactory */
    public static BuilderListItemFactory castFrom(org.gtk.gobject.Object gobject) {
        return new BuilderListItemFactory(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkBuilderListItemFactory` that instantiates widgets
     * using @bytes as the data to pass to `GtkBuilder`.
     */
    public static BuilderListItemFactory newFromBytes(BuilderScope scope, org.gtk.glib.Bytes bytes) {
        return new BuilderListItemFactory(References.get(gtk_h.gtk_builder_list_item_factory_new_from_bytes(scope.handle(), bytes.handle()), true));
    }
    
    /**
     * Creates a new `GtkBuilderListItemFactory` that instantiates widgets
     * using data read from the given @resource_path to pass to `GtkBuilder`.
     */
    public static BuilderListItemFactory newFromResource(BuilderScope scope, java.lang.String resourcePath) {
        return new BuilderListItemFactory(References.get(gtk_h.gtk_builder_list_item_factory_new_from_resource(scope.handle(), Interop.allocateNativeString(resourcePath).handle()), true));
    }
    
    /**
     * Gets the data used as the `GtkBuilder` UI template for constructing
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
