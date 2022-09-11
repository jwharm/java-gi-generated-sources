package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkListBoxRow` is the kind of widget that can be added to a `GtkListBox`.
 */
public class ListBoxRow extends Widget implements Accessible, Actionable, Buildable, ConstraintTarget {

    public ListBoxRow(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ListBoxRow */
    public static ListBoxRow castFrom(org.gtk.gobject.Object gobject) {
        return new ListBoxRow(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkListBoxRow`.
     */
    public ListBoxRow() {
        super(References.get(gtk_h.gtk_list_box_row_new(), false));
    }
    
    /**
     * Marks @row as changed, causing any state that depends on this
     * to be updated.
     * 
     * This affects sorting, filtering and headers.
     * 
     * Note that calls to this method must be in sync with the data
     * used for the row functions. For instance, if the list is
     * mirroring some external data set, and *two* rows changed in the
     * external data set then when you call gtk_list_box_row_changed()
     * on the first row the sort function must only read the new data
     * for the first of the two changed rows, otherwise the resorting
     * of the rows will be wrong.
     * 
     * This generally means that if you don’t fully control the data
     * model you have to duplicate the data that affects the listbox
     * row functions into the row widgets themselves. Another alternative
     * is to call [method@Gtk.ListBox.invalidate_sort] on any model change,
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
        return (RESULT != 0);
    }
    
    /**
     * Gets the child widget of @row.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_list_box_row_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns the current header of the @row.
     * 
     * This can be used
     * in a [callback@Gtk.ListBoxUpdateHeaderFunc] to see if
     * there is a header set already, and if so to update
     * the state of it.
     */
    public Widget getHeader() {
        var RESULT = gtk_h.gtk_list_box_row_get_header(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the current index of the @row in its `GtkListBox` container.
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
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the child is currently selected in its
     * `GtkListBox` container.
     */
    public boolean isSelected() {
        var RESULT = gtk_h.gtk_list_box_row_is_selected(handle());
        return (RESULT != 0);
    }
    
    /**
     * Set whether the row is activatable.
     */
    public void setActivatable(boolean activatable) {
        gtk_h.gtk_list_box_row_set_activatable(handle(), activatable ? 1 : 0);
    }
    
    /**
     * Sets the child widget of @self.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_list_box_row_set_child(handle(), child.handle());
    }
    
    /**
     * Sets the current header of the @row.
     * 
     * This is only allowed to be called
     * from a [callback@Gtk.ListBoxUpdateHeaderFunc].
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
     * 
     * If you want to be notified when the user activates a row (by key or not),
     * use the [signal@Gtk.ListBox::row-activated] signal on the row’s parent
     * `GtkListBox`.
     */
    public void onActivate(ActivateHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalListBoxRowActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
