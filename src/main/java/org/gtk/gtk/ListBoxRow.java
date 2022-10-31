package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkListBoxRow} is the kind of widget that can be added to a {@code GtkListBox}.
 */
public class ListBoxRow extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkListBoxRow";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gtk.Widget parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gtk.Widget(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public ListBoxRow(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ListBoxRow if its GType is a (or inherits from) "GtkListBoxRow".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ListBoxRow" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkListBoxRow", a ClassCastException will be thrown.
     */
    public static ListBoxRow castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkListBoxRow"))) {
            return new ListBoxRow(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkListBoxRow");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_list_box_row_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkListBoxRow}.
     */
    public ListBoxRow() {
        super(constructNew());
    }
    
    /**
     * Marks {@code row} as changed, causing any state that depends on this
     * to be updated.
     * <p>
     * This affects sorting, filtering and headers.
     * <p>
     * Note that calls to this method must be in sync with the data
     * used for the row functions. For instance, if the list is
     * mirroring some external data set, and <em>two</em> rows changed in the
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
    public void changed() {
        try {
            DowncallHandles.gtk_list_box_row_changed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets whether the row is activatable.
     * @return {@code true} if the row is activatable
     */
    public boolean getActivatable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_list_box_row_get_activatable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the child widget of {@code row}.
     * @return the child widget of {@code row}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_list_box_row_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the current header of the {@code row}.
     * <p>
     * This can be used
     * in a {@code Gtk.ListBoxUpdateHeaderFunc} to see if
     * there is a header set already, and if so to update
     * the state of it.
     * @return the current header
     */
    public @Nullable org.gtk.gtk.Widget getHeader() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_list_box_row_get_header.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the current index of the {@code row} in its {@code GtkListBox} container.
     * @return the index of the {@code row}, or -1 if the {@code row} is not in a listbox
     */
    public int getIndex() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_list_box_row_get_index.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets whether the row can be selected.
     * @return {@code true} if the row is selectable
     */
    public boolean getSelectable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_list_box_row_get_selectable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the child is currently selected in its
     * {@code GtkListBox} container.
     * @return {@code true} if {@code row} is selected
     */
    public boolean isSelected() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_list_box_row_is_selected.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Set whether the row is activatable.
     * @param activatable {@code true} to mark the row as activatable
     */
    public void setActivatable(boolean activatable) {
        try {
            DowncallHandles.gtk_list_box_row_set_activatable.invokeExact(
                    handle(),
                    activatable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the child widget of {@code self}.
     * @param child the child widget
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_list_box_row_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the current header of the {@code row}.
     * <p>
     * This is only allowed to be called
     * from a {@code Gtk.ListBoxUpdateHeaderFunc}.
     * It will replace any existing header in the row,
     * and be shown in front of the row in the listbox.
     * @param header the header
     */
    public void setHeader(@Nullable org.gtk.gtk.Widget header) {
        try {
            DowncallHandles.gtk_list_box_row_set_header.invokeExact(
                    handle(),
                    (Addressable) (header == null ? MemoryAddress.NULL : header.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set whether the row can be selected.
     * @param selectable {@code true} to mark the row as selectable
     */
    public void setSelectable(boolean selectable) {
        try {
            DowncallHandles.gtk_list_box_row_set_selectable.invokeExact(
                    handle(),
                    selectable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Activate {
        void signalReceived(ListBoxRow source);
    }
    
    /**
     * This is a keybinding signal, which will cause this row to be activated.
     * <p>
     * If you want to be notified when the user activates a row (by key or not),
     * use the {@code Gtk.ListBox::row-activated} signal on the row’s parent
     * {@code GtkListBox}.
     */
    public Signal<ListBoxRow.Activate> onActivate(ListBoxRow.Activate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ListBoxRow.Callbacks.class, "signalListBoxRowActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ListBoxRow.Activate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_list_box_row_new = Interop.downcallHandle(
            "gtk_list_box_row_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_list_box_row_changed = Interop.downcallHandle(
            "gtk_list_box_row_changed",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_list_box_row_get_activatable = Interop.downcallHandle(
            "gtk_list_box_row_get_activatable",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_list_box_row_get_child = Interop.downcallHandle(
            "gtk_list_box_row_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_list_box_row_get_header = Interop.downcallHandle(
            "gtk_list_box_row_get_header",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_list_box_row_get_index = Interop.downcallHandle(
            "gtk_list_box_row_get_index",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_list_box_row_get_selectable = Interop.downcallHandle(
            "gtk_list_box_row_get_selectable",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_list_box_row_is_selected = Interop.downcallHandle(
            "gtk_list_box_row_is_selected",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_list_box_row_set_activatable = Interop.downcallHandle(
            "gtk_list_box_row_set_activatable",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_list_box_row_set_child = Interop.downcallHandle(
            "gtk_list_box_row_set_child",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_list_box_row_set_header = Interop.downcallHandle(
            "gtk_list_box_row_set_header",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_list_box_row_set_selectable = Interop.downcallHandle(
            "gtk_list_box_row_set_selectable",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
    
    private static class Callbacks {
        
        public static void signalListBoxRowActivate(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (ListBoxRow.Activate) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ListBoxRow(Refcounted.get(source)));
        }
    }
}
