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

    public ColumnViewColumn(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ColumnViewColumn */
    public static ColumnViewColumn castFrom(org.gtk.gobject.Object gobject) {
        return new ColumnViewColumn(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_column_view_column_new = Interop.downcallHandle(
        "gtk_column_view_column_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@Nullable java.lang.String title, @Nullable ListItemFactory factory) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_column_view_column_new.invokeExact(Interop.allocateNativeString(title), factory.refcounted().unowned().handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkColumnViewColumn} that uses the given {@code factory} for
     * mapping items to widgets.
     * <p>
     * You most likely want to call {@link ColumnView#appendColumn} next.
     * <p>
     * The function takes ownership of the argument, so you can write code like:
     * 
     * <pre>{@code c
     * column = gtk_column_view_column_new (_("Name"),
     *   gtk_builder_list_item_factory_new_from_resource ("/name.ui"));
     * }</pre>
     */
    public ColumnViewColumn(@Nullable java.lang.String title, @Nullable ListItemFactory factory) {
        super(constructNew(title, factory));
    }
    
    private static final MethodHandle gtk_column_view_column_get_column_view = Interop.downcallHandle(
        "gtk_column_view_column_get_column_view",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the column view that's currently displaying this column.
     * <p>
     * If {@code self} has not been added to a column view yet, {@code null} is returned.
     */
    public @Nullable ColumnView getColumnView() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_column_view_column_get_column_view.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ColumnView(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_column_view_column_get_expand = Interop.downcallHandle(
        "gtk_column_view_column_get_expand",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether this column should expand.
     */
    public boolean getExpand() {
        int RESULT;
        try {
            RESULT = (int) gtk_column_view_column_get_expand.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_column_view_column_get_factory = Interop.downcallHandle(
        "gtk_column_view_column_get_factory",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the factory that's currently used to populate list items for
     * this column.
     */
    public @Nullable ListItemFactory getFactory() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_column_view_column_get_factory.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ListItemFactory(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_column_view_column_get_fixed_width = Interop.downcallHandle(
        "gtk_column_view_column_get_fixed_width",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the fixed width of the column.
     */
    public int getFixedWidth() {
        int RESULT;
        try {
            RESULT = (int) gtk_column_view_column_get_fixed_width.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_column_view_column_get_header_menu = Interop.downcallHandle(
        "gtk_column_view_column_get_header_menu",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the menu model that is used to create the context menu
     * for the column header.
     */
    public @Nullable org.gtk.gio.MenuModel getHeaderMenu() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_column_view_column_get_header_menu.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.MenuModel(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_column_view_column_get_resizable = Interop.downcallHandle(
        "gtk_column_view_column_get_resizable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether this column is resizable.
     */
    public boolean getResizable() {
        int RESULT;
        try {
            RESULT = (int) gtk_column_view_column_get_resizable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_column_view_column_get_sorter = Interop.downcallHandle(
        "gtk_column_view_column_get_sorter",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the sorter that is associated with the column.
     */
    public @Nullable Sorter getSorter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_column_view_column_get_sorter.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Sorter(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_column_view_column_get_title = Interop.downcallHandle(
        "gtk_column_view_column_get_title",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the title set with gtk_column_view_column_set_title().
     */
    public @Nullable java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_column_view_column_get_title.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_column_view_column_get_visible = Interop.downcallHandle(
        "gtk_column_view_column_get_visible",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether this column is visible.
     */
    public boolean getVisible() {
        int RESULT;
        try {
            RESULT = (int) gtk_column_view_column_get_visible.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_column_view_column_set_expand = Interop.downcallHandle(
        "gtk_column_view_column_set_expand",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the column to take available extra space.
     * <p>
     * The extra space is shared equally amongst all columns that
     * have the expand set to {@code true}.
     */
    public @NotNull void setExpand(@NotNull boolean expand) {
        try {
            gtk_column_view_column_set_expand.invokeExact(handle(), expand ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_column_view_column_set_factory = Interop.downcallHandle(
        "gtk_column_view_column_set_factory",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code GtkListItemFactory} to use for populating list items for this
     * column.
     */
    public @NotNull void setFactory(@Nullable ListItemFactory factory) {
        try {
            gtk_column_view_column_set_factory.invokeExact(handle(), factory.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_column_view_column_set_fixed_width = Interop.downcallHandle(
        "gtk_column_view_column_set_fixed_width",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If {@code fixed_width} is not -1, sets the fixed width of {@code column};
     * otherwise unsets it.
     * <p>
     * Setting a fixed width overrides the automatically calculated
     * width. Interactive resizing also sets the “fixed-width” property.
     */
    public @NotNull void setFixedWidth(@NotNull int fixedWidth) {
        try {
            gtk_column_view_column_set_fixed_width.invokeExact(handle(), fixedWidth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_column_view_column_set_header_menu = Interop.downcallHandle(
        "gtk_column_view_column_set_header_menu",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the menu model that is used to create the context menu
     * for the column header.
     */
    public @NotNull void setHeaderMenu(@Nullable org.gtk.gio.MenuModel menu) {
        try {
            gtk_column_view_column_set_header_menu.invokeExact(handle(), menu.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_column_view_column_set_resizable = Interop.downcallHandle(
        "gtk_column_view_column_set_resizable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether this column should be resizable by dragging.
     */
    public @NotNull void setResizable(@NotNull boolean resizable) {
        try {
            gtk_column_view_column_set_resizable.invokeExact(handle(), resizable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_column_view_column_set_sorter = Interop.downcallHandle(
        "gtk_column_view_column_set_sorter",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public @NotNull void setSorter(@Nullable Sorter sorter) {
        try {
            gtk_column_view_column_set_sorter.invokeExact(handle(), sorter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_column_view_column_set_title = Interop.downcallHandle(
        "gtk_column_view_column_set_title",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the title of this column.
     * <p>
     * The title is displayed in the header of a {@code GtkColumnView}
     * for this column and is therefore user-facing text that should
     * be translated.
     */
    public @NotNull void setTitle(@Nullable java.lang.String title) {
        try {
            gtk_column_view_column_set_title.invokeExact(handle(), Interop.allocateNativeString(title));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_column_view_column_set_visible = Interop.downcallHandle(
        "gtk_column_view_column_set_visible",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether this column should be visible in views.
     */
    public @NotNull void setVisible(@NotNull boolean visible) {
        try {
            gtk_column_view_column_set_visible.invokeExact(handle(), visible ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
