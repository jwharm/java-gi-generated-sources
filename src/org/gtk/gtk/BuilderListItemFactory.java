package org.gtk.gtk;

import org.gtk.gobject.*;
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

    public BuilderListItemFactory(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to BuilderListItemFactory */
    public static BuilderListItemFactory castFrom(org.gtk.gobject.Object gobject) {
        return new BuilderListItemFactory(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkBuilderListItemFactory` that instantiates widgets
     * using @bytes as the data to pass to `GtkBuilder`.
     */
    public BuilderListItemFactory(BuilderScope scope, org.gtk.glib.Bytes bytes) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_builder_list_item_factory_new_from_bytes(scope.HANDLE(), bytes.HANDLE()), true));
    }
    
    /**
     * Creates a new `GtkBuilderListItemFactory` that instantiates widgets
     * using data read from the given @resource_path to pass to `GtkBuilder`.
     */
    public BuilderListItemFactory(BuilderScope scope, java.lang.String resourcePath) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_builder_list_item_factory_new_from_resource(scope.HANDLE(), Interop.getAllocator().allocateUtf8String(resourcePath)), true));
    }
    
    /**
     * Gets the data used as the `GtkBuilder` UI template for constructing
     * listitems.
     */
    public org.gtk.glib.Bytes getBytes() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_builder_list_item_factory_get_bytes(HANDLE());
        return new org.gtk.glib.Bytes(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * If the data references a resource, gets the path of that resource.
     */
    public java.lang.String getResource() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_builder_list_item_factory_get_resource(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the scope used when constructing listitems.
     */
    public BuilderScope getScope() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_builder_list_item_factory_get_scope(HANDLE());
        return new BuilderScope.BuilderScopeImpl(ProxyFactory.getProxy(RESULT, false));
    }
    
}
