package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkTreeExpander} is a widget that provides an expander for a list.
 * <p>
 * It is typically placed as a bottommost child into a {@code GtkListView}
 * to allow users to expand and collapse children in a list with a
 * {@link TreeListModel}. {@code GtkTreeExpander} provides the common UI
 * elements, gestures and keybindings for this purpose.
 * <p>
 * On top of this, the "listitem.expand", "listitem.collapse" and
 * "listitem.toggle-expand" actions are provided to allow adding custom
 * UI for managing expanded state.
 * <p>
 * The {@code GtkTreeListModel} must be set to not be passthrough. Then it
 * will provide {@link TreeListRow} items which can be set via
 * {@link TreeExpander#setListRow} on the expander.
 * The expander will then watch that row item automatically.
 * {@link TreeExpander#setChild} sets the widget that displays
 * the actual row contents.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * treeexpander
 * ├── [indent]*
 * ├── [expander]
 * ╰── <child>
 * }</pre>
 * <p>
 * {@code GtkTreeExpander} has zero or one CSS nodes with the name "expander" that
 * should display the expander icon. The node will be {@code :checked} when it
 * is expanded. If the node is not expandable, an "indent" node will be
 * displayed instead.
 * <p>
 * For every level of depth, another "indent" node is prepended.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkTreeExpander} uses the {@link AccessibleRole#GROUP} role. The expander icon
 * is represented as a {@link AccessibleRole#BUTTON}, labelled by the expander's
 * child, and toggling it will change the {@link AccessibleState#EXPANDED} state.
 */
public class TreeExpander extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeExpander";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a TreeExpander proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TreeExpander(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to TreeExpander if its GType is a (or inherits from) "GtkTreeExpander".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TreeExpander} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkTreeExpander", a ClassCastException will be thrown.
     */
    public static TreeExpander castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), TreeExpander.getType())) {
            return new TreeExpander(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkTreeExpander");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_expander_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkTreeExpander}
     */
    public TreeExpander() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Gets the child widget displayed by {@code self}.
     * @return The child displayed by {@code self}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_expander_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * TreeExpander indents the child by the width of an expander-icon if it is not expandable.
     * @return TRUE if the child should be indented when not expandable. Otherwise FALSE.
     */
    public boolean getIndentForIcon() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_expander_get_indent_for_icon.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Forwards the item set on the {@code GtkTreeListRow} that {@code self} is managing.
     * <p>
     * This call is essentially equivalent to calling:
     * <pre>{@code c
     * gtk_tree_list_row_get_item (gtk_tree_expander_get_list_row (@self));
     * }</pre>
     * @return The item of the row
     */
    public @Nullable org.gtk.gobject.Object getItem() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_expander_get_item.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the list row managed by {@code self}.
     * @return The list row displayed by {@code self}
     */
    public @Nullable org.gtk.gtk.TreeListRow getListRow() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_expander_get_list_row.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TreeListRow(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the content widget to display.
     * @param child a {@code GtkWidget}
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_tree_expander_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets if the TreeExpander should indent the child by the width of an expander-icon when it is not expandable.
     * @param indentForIcon TRUE if the child should be indented without expander. Otherwise FALSE.
     */
    public void setIndentForIcon(boolean indentForIcon) {
        try {
            DowncallHandles.gtk_tree_expander_set_indent_for_icon.invokeExact(
                    handle(),
                    indentForIcon ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the tree list row that this expander should manage.
     * @param listRow a {@code GtkTreeListRow}
     */
    public void setListRow(@Nullable org.gtk.gtk.TreeListRow listRow) {
        try {
            DowncallHandles.gtk_tree_expander_set_list_row.invokeExact(
                    handle(),
                    (Addressable) (listRow == null ? MemoryAddress.NULL : listRow.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_tree_expander_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link TreeExpander.Build} object constructs a {@link TreeExpander} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link TreeExpander} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TreeExpander} using {@link TreeExpander#castFrom}.
         * @return A new instance of {@code TreeExpander} with the properties 
         *         that were set in the Build object.
         */
        public TreeExpander construct() {
            return TreeExpander.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    TreeExpander.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The child widget with the actual contents.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
        
        /**
         * TreeExpander indents the child by the width of an expander-icon if it is not expandable.
         * @param indentForIcon The value for the {@code indent-for-icon} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIndentForIcon(boolean indentForIcon) {
            names.add("indent-for-icon");
            values.add(org.gtk.gobject.Value.create(indentForIcon));
            return this;
        }
        
        /**
         * The item held by this expander's row.
         * @param item The value for the {@code item} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setItem(org.gtk.gobject.Object item) {
            names.add("item");
            values.add(org.gtk.gobject.Value.create(item));
            return this;
        }
        
        /**
         * The list row to track for expander state.
         * @param listRow The value for the {@code list-row} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setListRow(org.gtk.gtk.TreeListRow listRow) {
            names.add("list-row");
            values.add(org.gtk.gobject.Value.create(listRow));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_tree_expander_new = Interop.downcallHandle(
            "gtk_tree_expander_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_expander_get_child = Interop.downcallHandle(
            "gtk_tree_expander_get_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_expander_get_indent_for_icon = Interop.downcallHandle(
            "gtk_tree_expander_get_indent_for_icon",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_expander_get_item = Interop.downcallHandle(
            "gtk_tree_expander_get_item",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_expander_get_list_row = Interop.downcallHandle(
            "gtk_tree_expander_get_list_row",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_expander_set_child = Interop.downcallHandle(
            "gtk_tree_expander_set_child",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_expander_set_indent_for_icon = Interop.downcallHandle(
            "gtk_tree_expander_set_indent_for_icon",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_expander_set_list_row = Interop.downcallHandle(
            "gtk_tree_expander_set_list_row",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_expander_get_type = Interop.downcallHandle(
            "gtk_tree_expander_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
