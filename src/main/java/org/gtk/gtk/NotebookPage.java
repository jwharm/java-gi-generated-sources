package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkNotebookPage} is an auxiliary object used by {@code GtkNotebook}.
 */
public class NotebookPage extends org.gtk.gobject.Object {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkNotebookPage";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a NotebookPage proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public NotebookPage(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to NotebookPage if its GType is a (or inherits from) "GtkNotebookPage".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code NotebookPage} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkNotebookPage", a ClassCastException will be thrown.
     */
    public static NotebookPage castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), NotebookPage.getType())) {
            return new NotebookPage(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkNotebookPage");
        }
    }
    
    /**
     * Returns the notebook child to which {@code page} belongs.
     * @return the child to which {@code page} belongs
     */
    public @NotNull org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_notebook_page_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_notebook_page_get_type.invokeExact();
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
         * A {@link NotebookPage.Build} object constructs a {@link NotebookPage} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link NotebookPage} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link NotebookPage} using {@link NotebookPage#castFrom}.
         * @return A new instance of {@code NotebookPage} with the properties 
         *         that were set in the Build object.
         */
        public NotebookPage construct() {
            return NotebookPage.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    NotebookPage.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The child for this page.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
        
        /**
         * Whether the tab is detachable.
         * @param detachable The value for the {@code detachable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDetachable(boolean detachable) {
            names.add("detachable");
            values.add(org.gtk.gobject.Value.create(detachable));
            return this;
        }
        
        /**
         * The label widget displayed in the childs menu entry.
         * @param menu The value for the {@code menu} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMenu(org.gtk.gtk.Widget menu) {
            names.add("menu");
            values.add(org.gtk.gobject.Value.create(menu));
            return this;
        }
        
        /**
         * The text of the menu widget.
         * @param menuLabel The value for the {@code menu-label} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMenuLabel(java.lang.String menuLabel) {
            names.add("menu-label");
            values.add(org.gtk.gobject.Value.create(menuLabel));
            return this;
        }
        
        /**
         * The index of the child in the parent.
         * @param position The value for the {@code position} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPosition(int position) {
            names.add("position");
            values.add(org.gtk.gobject.Value.create(position));
            return this;
        }
        
        /**
         * Whether the tab is reorderable by user action.
         * @param reorderable The value for the {@code reorderable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setReorderable(boolean reorderable) {
            names.add("reorderable");
            values.add(org.gtk.gobject.Value.create(reorderable));
            return this;
        }
        
        /**
         * The tab widget for tihs page.
         * @param tab The value for the {@code tab} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTab(org.gtk.gtk.Widget tab) {
            names.add("tab");
            values.add(org.gtk.gobject.Value.create(tab));
            return this;
        }
        
        /**
         * Whether to expand the childs tab.
         * @param tabExpand The value for the {@code tab-expand} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTabExpand(boolean tabExpand) {
            names.add("tab-expand");
            values.add(org.gtk.gobject.Value.create(tabExpand));
            return this;
        }
        
        /**
         * Whether the childs tab should fill the allocated area.
         * @param tabFill The value for the {@code tab-fill} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTabFill(boolean tabFill) {
            names.add("tab-fill");
            values.add(org.gtk.gobject.Value.create(tabFill));
            return this;
        }
        
        /**
         * The text of the tab widget.
         * @param tabLabel The value for the {@code tab-label} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTabLabel(java.lang.String tabLabel) {
            names.add("tab-label");
            values.add(org.gtk.gobject.Value.create(tabLabel));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_notebook_page_get_child = Interop.downcallHandle(
            "gtk_notebook_page_get_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_page_get_type = Interop.downcallHandle(
            "gtk_notebook_page_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
