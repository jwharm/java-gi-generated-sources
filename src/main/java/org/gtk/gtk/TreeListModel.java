package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkTreeListModel} is a list model that can create child models on demand.
 */
public class TreeListModel extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public TreeListModel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TreeListModel */
    public static TreeListModel castFrom(org.gtk.gobject.Object gobject) {
        return new TreeListModel(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_tree_list_model_new = Interop.downcallHandle(
        "gtk_tree_list_model_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull org.gtk.gio.ListModel root, @NotNull boolean passthrough, @NotNull boolean autoexpand, @NotNull TreeListModelCreateModelFunc createFunc) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_tree_list_model_new.invokeExact(root.refcounted().unowned().handle(), passthrough ? 1 : 0, autoexpand ? 1 : 0, 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTreeListModelCreateModelFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(createFunc)), 
                    Interop.cbDestroyNotifySymbol()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new empty {@code GtkTreeListModel} displaying {@code root}
     * with all rows collapsed.
     */
    public TreeListModel(@NotNull org.gtk.gio.ListModel root, @NotNull boolean passthrough, @NotNull boolean autoexpand, @NotNull TreeListModelCreateModelFunc createFunc) {
        super(constructNew(root, passthrough, autoexpand, createFunc));
    }
    
    private static final MethodHandle gtk_tree_list_model_get_autoexpand = Interop.downcallHandle(
        "gtk_tree_list_model_get_autoexpand",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the model is set to automatically expand new rows
     * that get added.
     * <p>
     * This can be either rows added by changes to the underlying
     * models or via {@link TreeListRow#setExpanded}.
     */
    public boolean getAutoexpand() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_list_model_get_autoexpand.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_tree_list_model_get_child_row = Interop.downcallHandle(
        "gtk_tree_list_model_get_child_row",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the row item corresponding to the child at index {@code position} for
     * {@code self}'s root model.
     * <p>
     * If {@code position} is greater than the number of children in the root model,
     * {@code null} is returned.
     * <p>
     * Do not confuse this function with {@link TreeListModel#getRow}.
     */
    public @Nullable TreeListRow getChildRow(@NotNull int position) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_tree_list_model_get_child_row.invokeExact(handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TreeListRow(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gtk_tree_list_model_get_model = Interop.downcallHandle(
        "gtk_tree_list_model_get_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the root model that {@code self} was created with.
     */
    public @NotNull org.gtk.gio.ListModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_tree_list_model_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_tree_list_model_get_passthrough = Interop.downcallHandle(
        "gtk_tree_list_model_get_passthrough",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the model is passing through original row items.
     * <p>
     * If this function returns {@code false}, the {@code GListModel} functions for {@code self}
     * return custom {@code GtkTreeListRow} objects. You need to call
     * {@link TreeListRow#getItem} on these objects to get the original
     * item.
     * <p>
     * If {@code true}, the values of the child models are passed through in their
     * original state. You then need to call {@link TreeListModel#getRow}
     * to get the custom {@code GtkTreeListRow}s.
     */
    public boolean getPassthrough() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_list_model_get_passthrough.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_tree_list_model_get_row = Interop.downcallHandle(
        "gtk_tree_list_model_get_row",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the row object for the given row.
     * <p>
     * If {@code position} is greater than the number of items in {@code self},
     * {@code null} is returned.
     * <p>
     * The row object can be used to expand and collapse rows as
     * well as to inspect its position in the tree. See its
     * documentation for details.
     * <p>
     * This row object is persistent and will refer to the current
     * item as long as the row is present in {@code self}, independent of
     * other rows being added or removed.
     * <p>
     * If {@code self} is set to not be passthrough, this function is
     * equivalent to calling g_list_model_get_item().
     * <p>
     * Do not confuse this function with {@link TreeListModel#getChildRow}.
     */
    public @Nullable TreeListRow getRow(@NotNull int position) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_tree_list_model_get_row.invokeExact(handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TreeListRow(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gtk_tree_list_model_set_autoexpand = Interop.downcallHandle(
        "gtk_tree_list_model_set_autoexpand",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the model should autoexpand.
     * <p>
     * If set to {@code true}, the model will recursively expand all rows that
     * get added to the model. This can be either rows added by changes
     * to the underlying models or via {@link TreeListRow#setExpanded}.
     */
    public @NotNull void setAutoexpand(@NotNull boolean autoexpand) {
        try {
            gtk_tree_list_model_set_autoexpand.invokeExact(handle(), autoexpand ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
