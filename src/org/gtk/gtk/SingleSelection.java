package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkSingleSelection` is a `GtkSelectionModel` that allows selecting a single
 * item.
 * 
 * Note that the selection is *persistent* -- if the selected item is removed
 * and re-added in the same [signal@Gio.ListModel::items-changed] emission, it
 * stays selected. In particular, this means that changing the sort order of an
 * underlying sort model will preserve the selection.
 */
public class SingleSelection extends org.gtk.gobject.Object implements org.gtk.gio.ListModel, SelectionModel {

    public SingleSelection(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to SingleSelection */
    public static SingleSelection castFrom(org.gtk.gobject.Object gobject) {
        return new SingleSelection(gobject.getProxy());
    }
    
    /**
     * Creates a new selection to handle @model.
     */
    public SingleSelection(org.gtk.gio.ListModel model) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_single_selection_new(model.getProxy().unowned().HANDLE()), true));
    }
    
    /**
     * Checks if autoselect has been enabled or disabled via
     * gtk_single_selection_set_autoselect().
     */
    public boolean getAutoselect() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_single_selection_get_autoselect(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * If %TRUE, gtk_selection_model_unselect_item() is supported and allows
     * unselecting the selected item.
     */
    public boolean getCanUnselect() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_single_selection_get_can_unselect(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the model that @self is wrapping.
     */
    public org.gtk.gio.ListModel getModel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_single_selection_get_model(HANDLE());
        return new org.gtk.gio.ListModel.ListModelImpl(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the position of the selected item.
     * 
     * If no item is selected, %GTK_INVALID_LIST_POSITION is returned.
     */
    public int getSelected() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_single_selection_get_selected(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the selected item.
     * 
     * If no item is selected, %NULL is returned.
     */
    public org.gtk.gobject.Object getSelectedItem() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_single_selection_get_selected_item(HANDLE());
        return new org.gtk.gobject.Object(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Enables or disables autoselect.
     * 
     * If @autoselect is %TRUE, @self will enforce that an item is always
     * selected. It will select a new item when the currently selected
     * item is deleted and it will disallow unselecting the current item.
     */
    public void setAutoselect(boolean autoselect) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_single_selection_set_autoselect(HANDLE(), autoselect ? 1 : 0);
    }
    
    /**
     * If %TRUE, unselecting the current item via
     * gtk_selection_model_unselect_item() is supported.
     * 
     * Note that setting [property@Gtk.SingleSelection:autoselect] will
     * cause unselecting to not work, so it practically makes no sense
     * to set both at the same time the same time.
     */
    public void setCanUnselect(boolean canUnselect) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_single_selection_set_can_unselect(HANDLE(), canUnselect ? 1 : 0);
    }
    
    /**
     * Sets the model that @self should wrap.
     * 
     * If @model is %NULL, @self will be empty.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_single_selection_set_model(HANDLE(), model.HANDLE());
    }
    
    /**
     * Selects the item at the given position.
     * 
     * If the list does not have an item at @position or
     * %GTK_INVALID_LIST_POSITION is given, the behavior depends on the
     * value of the [property@Gtk.SingleSelection:autoselect] property:
     * If it is set, no change will occur and the old item will stay
     * selected. If it is unset, the selection will be unset and no item
     * will be selected.
     */
    public void setSelected(int position) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_single_selection_set_selected(HANDLE(), position);
    }
    
}