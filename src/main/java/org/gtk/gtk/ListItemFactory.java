package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkListItemFactory} creates widgets for the items taken from a {@code GListModel}.
 * <p>
 * This is one of the core concepts of handling list widgets such
 * as {@link ListView}.
 * <p>
 * The {@code GtkListItemFactory} is tasked with creating widgets for items
 * taken from the model when the views need them and updating them as
 * the items displayed by the view change.
 * <p>
 * A view is usually only able to display anything after both a factory
 * and a model have been set on the view. So it is important that you do
 * not skip this step when setting up your first view.
 * <p>
 * Because views do not display the whole list at once but only a few
 * items, they only need to maintain a few widgets at a time. They will
 * instruct the {@code GtkListItemFactory} to create these widgets and bind them
 * to the items that are currently displayed.
 * <p>
 * As the list model changes or the user scrolls to the list, the items will
 * change and the view will instruct the factory to bind the widgets to those
 * new items.
 * <p>
 * The actual widgets used for displaying those widgets is provided by you.
 * <p>
 * When the factory needs widgets created, it will create a {@code GtkListItem}
 * and hand it to your code to set up a widget for. This list item will provide
 * various properties with information about what item to display and provide
 * you with some opportunities to configure its behavior. See the
 * {@link ListItem} documentation for further details.
 * <p>
 * Various implementations of {@code GtkListItemFactory} exist to allow you different
 * ways to provide those widgets. The most common implementations are
 * {@link BuilderListItemFactory} which takes a {@code GtkBuilder} .ui file
 * and then creates widgets and manages everything automatically from the
 * information in that file and {@link SignalListItemFactory} which allows
 * you to connect to signals with your own code and retain full control over
 * how the widgets are setup and managed.
 * <p>
 * A {@code GtkListItemFactory} is supposed to be final - that means its behavior should
 * not change and the first widget created from it should behave the same way as
 * the last widget created from it.
 * If you intend to do changes to the behavior, it is recommended that you create
 * a new {@code GtkListItemFactory} which will allow the views to recreate its widgets.
 * <p>
 * Once you have chosen your factory and created it, you need to set it
 * on the view widget you want to use it with, such as via
 * {@link ListView#setFactory}. Reusing factories across different
 * views is allowed, but very uncommon.
 */
public class ListItemFactory extends org.gtk.gobject.Object {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkListItemFactory";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ListItemFactory proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ListItemFactory(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ListItemFactory if its GType is a (or inherits from) "GtkListItemFactory".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ListItemFactory} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkListItemFactory", a ClassCastException will be thrown.
     */
    public static ListItemFactory castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), ListItemFactory.getType())) {
            return new ListItemFactory(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkListItemFactory");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_list_item_factory_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link ListItemFactory.Build} object constructs a {@link ListItemFactory} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ListItemFactory} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ListItemFactory} using {@link ListItemFactory#castFrom}.
         * @return A new instance of {@code ListItemFactory} with the properties 
         *         that were set in the Build object.
         */
        public ListItemFactory construct() {
            return ListItemFactory.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ListItemFactory.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_list_item_factory_get_type = Interop.downcallHandle(
            "gtk_list_item_factory_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
