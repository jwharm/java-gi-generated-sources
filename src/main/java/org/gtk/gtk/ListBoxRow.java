package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_list_box_row_new(), false);
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
    public void changed() {
        gtk_h.gtk_list_box_row_changed(handle());
    }
    
    /**
     * Gets whether the row is activatable.
     */
    public boolean getActivatable() {
        var RESULT = gtk_h.gtk_list_box_row_get_activatable(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the child widget of {@code row}.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_list_box_row_get_child(handle());
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the current header of the {@code row}.
     * <p>
     * This can be used
     * in a {@code Gtk.ListBoxUpdateHeaderFunc} to see if
     * there is a header set already, and if so to update
     * the state of it.
     */
    public Widget getHeader() {
        var RESULT = gtk_h.gtk_list_box_row_get_header(handle());
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the current index of the {@code row} in its {@code GtkListBox} container.
     */
    public int getIndex() {
        var RESULT = gtk_h.gtk_list_box_row_get_index(handle());
        return RESULT;
    }
    
    /**
     * Gets whether the row can be selected.
     */
    public boolean getSelectable() {
        var RESULT = gtk_h.gtk_list_box_row_get_selectable(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns whether the child is currently selected in its
     * {@code GtkListBox} container.
     */
    public boolean isSelected() {
        var RESULT = gtk_h.gtk_list_box_row_is_selected(handle());
        return RESULT != 0;
    }
    
    /**
     * Set whether the row is activatable.
     */
    public void setActivatable(boolean activatable) {
        gtk_h.gtk_list_box_row_set_activatable(handle(), activatable ? 1 : 0);
    }
    
    /**
     * Sets the child widget of {@code self}.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_list_box_row_set_child(handle(), child.handle());
    }
    
    /**
     * Sets the current header of the {@code row}.
     * <p>
     * This is only allowed to be called
     * from a {@code Gtk.ListBoxUpdateHeaderFunc}.
     * It will replace any existing header in the row,
     * and be shown in front of the row in the listbox.
     */
    public void setHeader(Widget header) {
        gtk_h.gtk_list_box_row_set_header(handle(), header.handle());
    }
    
    /**
     * Set whether the row can be selected.
     */
    public void setSelectable(boolean selectable) {
        gtk_h.gtk_list_box_row_set_selectable(handle(), selectable ? 1 : 0);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("activate").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ListBoxRow.Callbacks.class, "signalListBoxRowActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
