package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkColumnViewColumn} represents the columns being added to {@code GtkColumnView}.
 * <p>
 * The main ingredient for a {@code GtkColumnViewColumn} is the {@code GtkListItemFactory}
 * that tells the columnview how to create cells for this column from items in
 * the model.
 * <p>
 * Columns have a title, and can optionally have a header menu set
 * with {@link ColumnViewColumn#setHeaderMenu}.
 * <p>
 * A sorter can be associated with a column using
 * {@link ColumnViewColumn#setSorter}, to let users influence sorting
 * by clicking on the column header.
 */
public class ColumnViewColumn extends org.gtk.gobject.Object {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkColumnViewColumn";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ColumnViewColumn proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ColumnViewColumn(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ColumnViewColumn if its GType is a (or inherits from) "GtkColumnViewColumn".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ColumnViewColumn} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkColumnViewColumn", a ClassCastException will be thrown.
     */
    public static ColumnViewColumn castFrom(org.gtk.gobject.Object gobject) {
            return new ColumnViewColumn(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@Nullable java.lang.String title, @Nullable org.gtk.gtk.ListItemFactory factory) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_column_view_column_new.invokeExact(
                    (Addressable) (title == null ? MemoryAddress.NULL : Interop.allocateNativeString(title)),
                    (Addressable) (factory == null ? MemoryAddress.NULL : factory.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        factory.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkColumnViewColumn} that uses the given {@code factory} for
     * mapping items to widgets.
     * <p>
     * You most likely want to call {@link ColumnView#appendColumn} next.
     * <p>
     * The function takes ownership of the argument, so you can write code like:
     * <pre>{@code c
     * column = gtk_column_view_column_new (_("Name"),
     *   gtk_builder_list_item_factory_new_from_resource ("/name.ui"));
     * }</pre>
     * @param title Title to use for this column
     * @param factory The factory to populate items with
     */
    public ColumnViewColumn(@Nullable java.lang.String title, @Nullable org.gtk.gtk.ListItemFactory factory) {
        super(constructNew(title, factory), Ownership.FULL);
    }
    
    /**
     * Gets the column view that's currently displaying this column.
     * <p>
     * If {@code self} has not been added to a column view yet, {@code null} is returned.
     * @return The column view displaying {@code self}.
     */
    public @Nullable org.gtk.gtk.ColumnView getColumnView() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_column_view_column_get_column_view.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ColumnView(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether this column should expand.
     * @return {@code true} if this column expands
     */
    public boolean getExpand() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_column_view_column_get_expand.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the factory that's currently used to populate list items for
     * this column.
     * @return The factory in use
     */
    public @Nullable org.gtk.gtk.ListItemFactory getFactory() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_column_view_column_get_factory.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ListItemFactory(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the fixed width of the column.
     * @return the fixed with of the column
     */
    public int getFixedWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_column_view_column_get_fixed_width.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the menu model that is used to create the context menu
     * for the column header.
     * @return the {@code GMenuModel}
     */
    public @Nullable org.gtk.gio.MenuModel getHeaderMenu() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_column_view_column_get_header_menu.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.MenuModel(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether this column is resizable.
     * @return {@code true} if this column is resizable
     */
    public boolean getResizable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_column_view_column_get_resizable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the sorter that is associated with the column.
     * @return the {@code GtkSorter} of {@code self}
     */
    public @Nullable org.gtk.gtk.Sorter getSorter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_column_view_column_get_sorter.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Sorter(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the title set with gtk_column_view_column_set_title().
     * @return The column's title
     */
    public @Nullable java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_column_view_column_get_title.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns whether this column is visible.
     * @return {@code true} if this column is visible
     */
    public boolean getVisible() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_column_view_column_get_visible.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the column to take available extra space.
     * <p>
     * The extra space is shared equally amongst all columns that
     * have the expand set to {@code true}.
     * @param expand {@code true} if this column should expand to fill available sace
     */
    public void setExpand(boolean expand) {
        try {
            DowncallHandles.gtk_column_view_column_set_expand.invokeExact(
                    handle(),
                    expand ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkListItemFactory} to use for populating list items for this
     * column.
     * @param factory the factory to use
     */
    public void setFactory(@Nullable org.gtk.gtk.ListItemFactory factory) {
        try {
            DowncallHandles.gtk_column_view_column_set_factory.invokeExact(
                    handle(),
                    (Addressable) (factory == null ? MemoryAddress.NULL : factory.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code fixed_width} is not -1, sets the fixed width of {@code column};
     * otherwise unsets it.
     * <p>
     * Setting a fixed width overrides the automatically calculated
     * width. Interactive resizing also sets the “fixed-width” property.
     * @param fixedWidth the new fixed width, or -1
     */
    public void setFixedWidth(int fixedWidth) {
        try {
            DowncallHandles.gtk_column_view_column_set_fixed_width.invokeExact(
                    handle(),
                    fixedWidth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the menu model that is used to create the context menu
     * for the column header.
     * @param menu a {@code GMenuModel}
     */
    public void setHeaderMenu(@Nullable org.gtk.gio.MenuModel menu) {
        try {
            DowncallHandles.gtk_column_view_column_set_header_menu.invokeExact(
                    handle(),
                    (Addressable) (menu == null ? MemoryAddress.NULL : menu.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether this column should be resizable by dragging.
     * @param resizable whether this column should be resizable
     */
    public void setResizable(boolean resizable) {
        try {
            DowncallHandles.gtk_column_view_column_set_resizable.invokeExact(
                    handle(),
                    resizable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Associates a sorter with the column.
     * <p>
     * If {@code sorter} is {@code null}, the column will not let users change
     * the sorting by clicking on its header.
     * <p>
     * This sorter can be made active by clicking on the column
     * header, or by calling {@link ColumnView#sortByColumn}.
     * <p>
     * See {@link ColumnView#getSorter} for the necessary steps
     * for setting up customizable sorting for {@link ColumnView}.
     * @param sorter the {@code GtkSorter} to associate with {@code column}
     */
    public void setSorter(@Nullable org.gtk.gtk.Sorter sorter) {
        try {
            DowncallHandles.gtk_column_view_column_set_sorter.invokeExact(
                    handle(),
                    (Addressable) (sorter == null ? MemoryAddress.NULL : sorter.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the title of this column.
     * <p>
     * The title is displayed in the header of a {@code GtkColumnView}
     * for this column and is therefore user-facing text that should
     * be translated.
     * @param title Title to use for this column
     */
    public void setTitle(@Nullable java.lang.String title) {
        try {
            DowncallHandles.gtk_column_view_column_set_title.invokeExact(
                    handle(),
                    (Addressable) (title == null ? MemoryAddress.NULL : Interop.allocateNativeString(title)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether this column should be visible in views.
     * @param visible whether this column should be visible
     */
    public void setVisible(boolean visible) {
        try {
            DowncallHandles.gtk_column_view_column_set_visible.invokeExact(
                    handle(),
                    visible ? 1 : 0);
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
            RESULT = (long) DowncallHandles.gtk_column_view_column_get_type.invokeExact();
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
         * A {@link ColumnViewColumn.Build} object constructs a {@link ColumnViewColumn} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ColumnViewColumn} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ColumnViewColumn} using {@link ColumnViewColumn#castFrom}.
         * @return A new instance of {@code ColumnViewColumn} with the properties 
         *         that were set in the Build object.
         */
        public ColumnViewColumn construct() {
            return ColumnViewColumn.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ColumnViewColumn.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The {@code GtkColumnView} this column is a part of.
         * @param columnView The value for the {@code column-view} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setColumnView(org.gtk.gtk.ColumnView columnView) {
            names.add("column-view");
            values.add(org.gtk.gobject.Value.create(columnView));
            return this;
        }
        
        /**
         * Column gets share of extra width allocated to the view.
         * @param expand The value for the {@code expand} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setExpand(boolean expand) {
            names.add("expand");
            values.add(org.gtk.gobject.Value.create(expand));
            return this;
        }
        
        /**
         * Factory for populating list items.
         * @param factory The value for the {@code factory} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFactory(org.gtk.gtk.ListItemFactory factory) {
            names.add("factory");
            values.add(org.gtk.gobject.Value.create(factory));
            return this;
        }
        
        /**
         * If not -1, this is the width that the column is allocated,
         * regardless of the size of its content.
         * @param fixedWidth The value for the {@code fixed-width} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFixedWidth(int fixedWidth) {
            names.add("fixed-width");
            values.add(org.gtk.gobject.Value.create(fixedWidth));
            return this;
        }
        
        /**
         * Menu model used to create the context menu for the column header.
         * @param headerMenu The value for the {@code header-menu} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHeaderMenu(org.gtk.gio.MenuModel headerMenu) {
            names.add("header-menu");
            values.add(org.gtk.gobject.Value.create(headerMenu));
            return this;
        }
        
        /**
         * Whether this column is resizable.
         * @param resizable The value for the {@code resizable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setResizable(boolean resizable) {
            names.add("resizable");
            values.add(org.gtk.gobject.Value.create(resizable));
            return this;
        }
        
        /**
         * Sorter for sorting items according to this column.
         * @param sorter The value for the {@code sorter} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSorter(org.gtk.gtk.Sorter sorter) {
            names.add("sorter");
            values.add(org.gtk.gobject.Value.create(sorter));
            return this;
        }
        
        /**
         * Title displayed in the header.
         * @param title The value for the {@code title} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTitle(java.lang.String title) {
            names.add("title");
            values.add(org.gtk.gobject.Value.create(title));
            return this;
        }
        
        /**
         * Whether this column is visible.
         * @param visible The value for the {@code visible} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setVisible(boolean visible) {
            names.add("visible");
            values.add(org.gtk.gobject.Value.create(visible));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_column_view_column_new = Interop.downcallHandle(
            "gtk_column_view_column_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_column_view_column_get_column_view = Interop.downcallHandle(
            "gtk_column_view_column_get_column_view",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_column_view_column_get_expand = Interop.downcallHandle(
            "gtk_column_view_column_get_expand",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_column_view_column_get_factory = Interop.downcallHandle(
            "gtk_column_view_column_get_factory",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_column_view_column_get_fixed_width = Interop.downcallHandle(
            "gtk_column_view_column_get_fixed_width",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_column_view_column_get_header_menu = Interop.downcallHandle(
            "gtk_column_view_column_get_header_menu",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_column_view_column_get_resizable = Interop.downcallHandle(
            "gtk_column_view_column_get_resizable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_column_view_column_get_sorter = Interop.downcallHandle(
            "gtk_column_view_column_get_sorter",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_column_view_column_get_title = Interop.downcallHandle(
            "gtk_column_view_column_get_title",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_column_view_column_get_visible = Interop.downcallHandle(
            "gtk_column_view_column_get_visible",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_column_view_column_set_expand = Interop.downcallHandle(
            "gtk_column_view_column_set_expand",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_column_view_column_set_factory = Interop.downcallHandle(
            "gtk_column_view_column_set_factory",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_column_view_column_set_fixed_width = Interop.downcallHandle(
            "gtk_column_view_column_set_fixed_width",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_column_view_column_set_header_menu = Interop.downcallHandle(
            "gtk_column_view_column_set_header_menu",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_column_view_column_set_resizable = Interop.downcallHandle(
            "gtk_column_view_column_set_resizable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_column_view_column_set_sorter = Interop.downcallHandle(
            "gtk_column_view_column_set_sorter",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_column_view_column_set_title = Interop.downcallHandle(
            "gtk_column_view_column_set_title",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_column_view_column_set_visible = Interop.downcallHandle(
            "gtk_column_view_column_set_visible",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_column_view_column_get_type = Interop.downcallHandle(
            "gtk_column_view_column_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
