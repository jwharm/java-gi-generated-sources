package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkNotebookPage} is an auxiliary object used by {@code GtkNotebook}.
 */
public class NotebookPage extends org.gtk.gobject.GObject {
    
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
    protected NotebookPage(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, NotebookPage> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new NotebookPage(input, ownership);
    
    /**
     * Returns the notebook child to which {@code page} belongs.
     * @return the child to which {@code page} belongs
     */
    public org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_notebook_page_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_notebook_page_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link NotebookPage.Builder} object constructs a {@link NotebookPage} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link NotebookPage.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link NotebookPage} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link NotebookPage}.
         * @return A new instance of {@code NotebookPage} with the properties 
         *         that were set in the Builder object.
         */
        public NotebookPage build() {
            return (NotebookPage) org.gtk.gobject.GObject.newWithProperties(
                NotebookPage.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The child for this page.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
        
        /**
         * Whether the tab is detachable.
         * @param detachable The value for the {@code detachable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDetachable(boolean detachable) {
            names.add("detachable");
            values.add(org.gtk.gobject.Value.create(detachable));
            return this;
        }
        
        /**
         * The label widget displayed in the childs menu entry.
         * @param menu The value for the {@code menu} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMenu(org.gtk.gtk.Widget menu) {
            names.add("menu");
            values.add(org.gtk.gobject.Value.create(menu));
            return this;
        }
        
        /**
         * The text of the menu widget.
         * @param menuLabel The value for the {@code menu-label} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMenuLabel(java.lang.String menuLabel) {
            names.add("menu-label");
            values.add(org.gtk.gobject.Value.create(menuLabel));
            return this;
        }
        
        /**
         * The index of the child in the parent.
         * @param position The value for the {@code position} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPosition(int position) {
            names.add("position");
            values.add(org.gtk.gobject.Value.create(position));
            return this;
        }
        
        /**
         * Whether the tab is reorderable by user action.
         * @param reorderable The value for the {@code reorderable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setReorderable(boolean reorderable) {
            names.add("reorderable");
            values.add(org.gtk.gobject.Value.create(reorderable));
            return this;
        }
        
        /**
         * The tab widget for tihs page.
         * @param tab The value for the {@code tab} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTab(org.gtk.gtk.Widget tab) {
            names.add("tab");
            values.add(org.gtk.gobject.Value.create(tab));
            return this;
        }
        
        /**
         * Whether to expand the childs tab.
         * @param tabExpand The value for the {@code tab-expand} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTabExpand(boolean tabExpand) {
            names.add("tab-expand");
            values.add(org.gtk.gobject.Value.create(tabExpand));
            return this;
        }
        
        /**
         * Whether the childs tab should fill the allocated area.
         * @param tabFill The value for the {@code tab-fill} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTabFill(boolean tabFill) {
            names.add("tab-fill");
            values.add(org.gtk.gobject.Value.create(tabFill));
            return this;
        }
        
        /**
         * The text of the tab widget.
         * @param tabLabel The value for the {@code tab-label} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTabLabel(java.lang.String tabLabel) {
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
