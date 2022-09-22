package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkComboBoxText} is a simple variant of {@code GtkComboBox} for text-only
 * use cases.
 * <p>
 * <img src="./doc-files/combo-box-text.png" alt="An example GtkComboBoxText">
 * <p>
 * {@code GtkComboBoxText} hides the model-view complexity of {@code GtkComboBox}.
 * <p>
 * To create a {@code GtkComboBoxText}, use {@link ComboBoxText#ComboBoxText} or
 * {@link ComboBoxText#newWithEntry}.
 * <p>
 * You can add items to a {@code GtkComboBoxText} with
 * {@link ComboBoxText#appendText},
 * {@link ComboBoxText#insertText} or
 * {@link ComboBoxText#prependText} and remove options with
 * {@link ComboBoxText#remove}.
 * <p>
 * If the {@code GtkComboBoxText} contains an entry (via the
 * {@code Gtk.ComboBox:has-entry} property), its contents can be retrieved
 * using {@link ComboBoxText#getActiveText}.
 * <p>
 * You should not call {@link ComboBox#setModel} or attempt to pack more
 * cells into this combo box via its {@code Gtk.CellLayout} interface.
 * <p>
 * <h1>GtkComboBoxText as GtkBuildable</h1>
 * <p>
 * The {@code GtkComboBoxText} implementation of the {@code GtkBuildable} interface supports
 * adding items directly using the &lt;items> element and specifying <item&gt;
 * elements for each item. Each &lt;item&gt; element can specify the “id”
 * corresponding to the appended text and also supports the regular
 * translation attributes “translatable”, “context” and “comments”.
 * <p>
 * Here is a UI definition fragment specifying {@code GtkComboBoxText} items:
 * <pre>{@code xml
 * <object class="GtkComboBoxText">
 *   <items>
 *     <item translatable="yes" id="factory">Factory</item>
 *     <item translatable="yes" id="home">Home</item>
 *     <item translatable="yes" id="subway">Subway</item>
 *   </items>
 * </object>
 * }</pre>
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * <pre>{@code 
 * combobox
 * ╰── box.linked
 *     ├── entry.combo
 *     ├── button.combo
 *     ╰── window.popup
 * }</pre>
 * <p>
 * {@code GtkComboBoxText} has a single CSS node with name combobox. It adds
 * the style class .combo to the main CSS nodes of its entry and button
 * children, and the .linked class to the node of its internal box.
 */
public class ComboBoxText extends ComboBox implements Accessible, Buildable, CellEditable, CellLayout, ConstraintTarget {

    public ComboBoxText(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ComboBoxText */
    public static ComboBoxText castFrom(org.gtk.gobject.Object gobject) {
        return new ComboBoxText(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_combo_box_text_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkComboBoxText}.
     */
    public ComboBoxText() {
        super(constructNew());
    }
    
    private static Reference constructNewWithEntry() {
        Reference RESULT = References.get(gtk_h.gtk_combo_box_text_new_with_entry(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkComboBoxText} with an entry.
     */
    public static ComboBoxText newWithEntry() {
        return new ComboBoxText(constructNewWithEntry());
    }
    
    /**
     * Appends {@code text} to the list of strings stored in {@code combo_box}.
     * <p>
     * If {@code id} is non-<code>null</code> then it is used as the ID of the row.
     * <p>
     * This is the same as calling {@link ComboBoxText#insert}
     * with a position of -1.
     */
    public void append(java.lang.String id, java.lang.String text) {
        gtk_h.gtk_combo_box_text_append(handle(), Interop.allocateNativeString(id).handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Appends {@code text} to the list of strings stored in {@code combo_box}.
     * <p>
     * This is the same as calling {@link ComboBoxText#insertText}
     * with a position of -1.
     */
    public void appendText(java.lang.String text) {
        gtk_h.gtk_combo_box_text_append_text(handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Returns the currently active string in {@code combo_box}.
     * <p>
     * If no row is currently selected, <code>null</code> is returned.
     * If {@code combo_box} contains an entry, this function will
     * return its contents (which will not necessarily
     * be an item from the list).
     */
    public java.lang.String getActiveText() {
        var RESULT = gtk_h.gtk_combo_box_text_get_active_text(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Inserts {@code text} at {@code position} in the list of strings stored in {@code combo_box}.
     * <p>
     * If {@code id} is non-<code>null</code> then it is used as the ID of the row.
     * See {@code Gtk.ComboBox:id-column}.
     * <p>
     * If {@code position} is negative then {@code text} is appended.
     */
    public void insert(int position, java.lang.String id, java.lang.String text) {
        gtk_h.gtk_combo_box_text_insert(handle(), position, Interop.allocateNativeString(id).handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Inserts {@code text} at {@code position} in the list of strings stored in {@code combo_box}.
     * <p>
     * If {@code position} is negative then {@code text} is appended.
     * <p>
     * This is the same as calling {@link ComboBoxText#insert}
     * with a <code>null</code> ID string.
     */
    public void insertText(int position, java.lang.String text) {
        gtk_h.gtk_combo_box_text_insert_text(handle(), position, Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Prepends {@code text} to the list of strings stored in {@code combo_box}.
     * <p>
     * If {@code id} is non-<code>null</code> then it is used as the ID of the row.
     * <p>
     * This is the same as calling {@link ComboBoxText#insert}
     * with a position of 0.
     */
    public void prepend(java.lang.String id, java.lang.String text) {
        gtk_h.gtk_combo_box_text_prepend(handle(), Interop.allocateNativeString(id).handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Prepends {@code text} to the list of strings stored in {@code combo_box}.
     * <p>
     * This is the same as calling {@link ComboBoxText#insertText}
     * with a position of 0.
     */
    public void prependText(java.lang.String text) {
        gtk_h.gtk_combo_box_text_prepend_text(handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Removes the string at {@code position} from {@code combo_box}.
     */
    public void remove(int position) {
        gtk_h.gtk_combo_box_text_remove(handle(), position);
    }
    
    /**
     * Removes all the text entries from the combo box.
     */
    public void removeAll() {
        gtk_h.gtk_combo_box_text_remove_all(handle());
    }
    
}
