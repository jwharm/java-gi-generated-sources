package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkListBoxRow} is the kind of widget that can be added to a {@code GtkListBox}.
 */
public class ListBoxRow extends Widget implements Accessible, Actionable, Buildable, ConstraintTarget {

    public ListBoxRow(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ListBoxRow */
    public static ListBoxRow castFrom(org.gtk.gobject.Object gobject) {
        return new ListBoxRow(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_list_box_row_new = Interop.downcallHandle(
        "gtk_list_box_row_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_list_box_row_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkListBoxRow}.
     */
    public ListBoxRow() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_list_box_row_changed = Interop.downcallHandle(
        "gtk_list_box_row_changed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Marks {@code row} as changed, causing any state that depends on this
     * to be updated.
     * <p>
     * This affects sorting, filtering and headers.
     * <p>
     * Note that calls to this method must be in sync with the data
     * used for the row functions. For instance, if the list is
     * mirroring some external data set, and <strong>two</strong> rows changed in the
     * external data set then when you call gtk_list_box_row_changed()
     * on the first row the sort function must only read the new data
     * for the first of the two changed rows, otherwise the resorting
     * of the rows will be wrong.
     * <p>
     * This generally means that if you don’t fully control the data
     * model you have to duplicate the data that affects the listbox
     * row functions into the row widgets themselves. Another alternative
     * is to call {@link ListBox#invalidateSort} on any model change,
     * but that is more expensive.
     */
    public @NotNull void changed() {
        try {
            gtk_list_box_row_changed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_list_box_row_get_activatable = Interop.downcallHandle(
        "gtk_list_box_row_get_activatable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the row is activatable.
     */
    public boolean getActivatable() {
        int RESULT;
        try {
            RESULT = (int) gtk_list_box_row_get_activatable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_list_box_row_get_child = Interop.downcallHandle(
        "gtk_list_box_row_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child widget of {@code row}.
     */
    public @Nullable Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_list_box_row_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_list_box_row_get_header = Interop.downcallHandle(
        "gtk_list_box_row_get_header",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the current header of the {@code row}.
     * <p>
     * This can be used
     * in a {@code Gtk.ListBoxUpdateHeaderFunc} to see if
     * there is a header set already, and if so to update
     * the state of it.
     */
    public @Nullable Widget getHeader() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_list_box_row_get_header.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_list_box_row_get_index = Interop.downcallHandle(
        "gtk_list_box_row_get_index",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current index of the {@code row} in its {@code GtkListBox} container.
     */
    public int getIndex() {
        int RESULT;
        try {
            RESULT = (int) gtk_list_box_row_get_index.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_list_box_row_get_selectable = Interop.downcallHandle(
        "gtk_list_box_row_get_selectable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the row can be selected.
     */
    public boolean getSelectable() {
        int RESULT;
        try {
            RESULT = (int) gtk_list_box_row_get_selectable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_list_box_row_is_selected = Interop.downcallHandle(
        "gtk_list_box_row_is_selected",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the child is currently selected in its
     * {@code GtkListBox} container.
     */
    public boolean isSelected() {
        int RESULT;
        try {
            RESULT = (int) gtk_list_box_row_is_selected.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_list_box_row_set_activatable = Interop.downcallHandle(
        "gtk_list_box_row_set_activatable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Set whether the row is activatable.
     */
    public @NotNull void setActivatable(@NotNull boolean activatable) {
        try {
            gtk_list_box_row_set_activatable.invokeExact(handle(), activatable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_list_box_row_set_child = Interop.downcallHandle(
        "gtk_list_box_row_set_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the child widget of {@code self}.
     */
    public @NotNull void setChild(@Nullable Widget child) {
        try {
            gtk_list_box_row_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_list_box_row_set_header = Interop.downcallHandle(
        "gtk_list_box_row_set_header",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the current header of the {@code row}.
     * <p>
     * This is only allowed to be called
     * from a {@code Gtk.ListBoxUpdateHeaderFunc}.
     * It will replace any existing header in the row,
     * and be shown in front of the row in the listbox.
     */
    public @NotNull void setHeader(@Nullable Widget header) {
        try {
            gtk_list_box_row_set_header.invokeExact(handle(), header.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_list_box_row_set_selectable = Interop.downcallHandle(
        "gtk_list_box_row_set_selectable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Set whether the row can be selected.
     */
    public @NotNull void setSelectable(@NotNull boolean selectable) {
        try {
            gtk_list_box_row_set_selectable.invokeExact(handle(), selectable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(ListBoxRow source);
    }
    
    /**
     * This is a keybinding signal, which will cause this row to be activated.
     * <p>
     * If you want to be notified when the user activates a row (by key or not),
     * use the {@code Gtk.ListBox::row-activated} signal on the row’s parent
     * {@code GtkListBox}.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ListBoxRow.Callbacks.class, "signalListBoxRowActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalListBoxRowActivate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ListBoxRow.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ListBoxRow(Refcounted.get(source)));
        }
        
    }
}
