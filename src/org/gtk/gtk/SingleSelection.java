package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkSingleSelection} is a {@code GtkSelectionModel} that allows selecting a single
 * item.
 * <p>
 * Note that the selection is <strong>persistent</strong> -- if the selected item is removed
 * and re-added in the same {@code Gio.ListModel::items-changed} emission, it
 * stays selected. In particular, this means that changing the sort order of an
 * underlying sort model will preserve the selection.
 */
public class SingleSelection extends org.gtk.gobject.Object implements org.gtk.gio.ListModel, SelectionModel {

    public SingleSelection(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SingleSelection */
    public static SingleSelection castFrom(org.gtk.gobject.Object gobject) {
        return new SingleSelection(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.gio.ListModel model) {
        Reference RESULT = References.get(gtk_h.gtk_single_selection_new(model.getReference().unowned().handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new selection to handle {@code model}.
     */
    public SingleSelection(org.gtk.gio.ListModel model) {
        super(constructNew(model));
    }
    
    /**
     * Checks if autoselect has been enabled or disabled via
     * gtk_single_selection_set_autoselect().
     */
    public boolean getAutoselect() {
        var RESULT = gtk_h.gtk_single_selection_get_autoselect(handle());
        return (RESULT != 0);
    }
    
    /**
     * If <code>true</code>, gtk_selection_model_unselect_item() is supported and allows
     * unselecting the selected item.
     */
    public boolean getCanUnselect() {
        var RESULT = gtk_h.gtk_single_selection_get_can_unselect(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the model that {@code self} is wrapping.
     */
    public org.gtk.gio.ListModel getModel() {
        var RESULT = gtk_h.gtk_single_selection_get_model(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets the position of the selected item.
     * <p>
     * If no item is selected, {@code GTK_INVALID_LIST_POSITION} is returned.
     */
    public int getSelected() {
        var RESULT = gtk_h.gtk_single_selection_get_selected(handle());
        return RESULT;
    }
    
    /**
     * Gets the selected item.
     * <p>
     * If no item is selected, <code>null</code> is returned.
     */
    public org.gtk.gobject.Object getSelectedItem() {
        var RESULT = gtk_h.gtk_single_selection_get_selected_item(handle());
        return new org.gtk.gobject.Object(References.get(RESULT, false));
    }
    
    /**
     * Enables or disables autoselect.
     * <p>
     * If {@code autoselect} is <code>true</code>, {@code self} will enforce that an item is always
     * selected. It will select a new item when the currently selected
     * item is deleted and it will disallow unselecting the current item.
     */
    public void setAutoselect(boolean autoselect) {
        gtk_h.gtk_single_selection_set_autoselect(handle(), autoselect ? 1 : 0);
    }
    
    /**
     * If <code>true</code>, unselecting the current item via
     * gtk_selection_model_unselect_item() is supported.
     * <p>
     * Note that setting {@code Gtk.SingleSelection:autoselect} will
     * cause unselecting to not work, so it practically makes no sense
     * to set both at the same time the same time.
     */
    public void setCanUnselect(boolean canUnselect) {
        gtk_h.gtk_single_selection_set_can_unselect(handle(), canUnselect ? 1 : 0);
    }
    
    /**
     * Sets the model that {@code self} should wrap.
     * <p>
     * If {@code model} is <code>null</code>, {@code self} will be empty.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        gtk_h.gtk_single_selection_set_model(handle(), model.handle());
    }
    
    /**
     * Selects the item at the given position.
     * <p>
     * If the list does not have an item at {@code position} or
     * {@code GTK_INVALID_LIST_POSITION} is given, the behavior depends on the
     * value of the {@code Gtk.SingleSelection:autoselect} property:
     * If it is set, no change will occur and the old item will stay
     * selected. If it is unset, the selection will be unset and no item
     * will be selected.
     */
    public void setSelected(int position) {
        gtk_h.gtk_single_selection_set_selected(handle(), position);
    }
    
}
