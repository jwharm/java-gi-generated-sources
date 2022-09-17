package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GtkComboBoxText</code> is a simple variant of <code>GtkComboBox</code> for text-only
 * use cases.
 * <p>
 * !{@link [An example GtkComboBoxText]}(combo-box-text.png)
 * <p><code>GtkComboBoxText</code> hides the model-view complexity of <code>GtkComboBox</code>.
 * <p>
 * To create a <code>GtkComboBoxText</code>, use {@link [ctor@Gtk.ComboBoxText.new] (ref=ctor)} or
 * {@link [ctor@Gtk.ComboBoxText.new_with_entry] (ref=ctor)}.
 * <p>
 * You can add items to a <code>GtkComboBoxText</code> with
 * {@link org.gtk.gtk.ComboBoxText#appendText},
 * {@link org.gtk.gtk.ComboBoxText#insertText} or
 * {@link org.gtk.gtk.ComboBoxText#prependText} and remove options with
 * {@link org.gtk.gtk.ComboBoxText#remove}.
 * <p>
 * If the <code>GtkComboBoxText</code> contains an entry (via the
 * {@link [property@Gtk.ComboBox:has-entry] (ref=property)} property), its contents can be retrieved
 * using {@link org.gtk.gtk.ComboBoxText#getActiveText}.
 * <p>
 * You should not call {@link org.gtk.gtk.ComboBox#setModel} or attempt to pack more
 * cells into this combo box via its {@link [iface@Gtk.CellLayout] (ref=iface)} interface.
 * <p>
 * <h1>tkComboBoxText as GtkBuildable</h1>
 * <p>
 * The <code>GtkComboBoxText</code> implementation of the <code>GtkBuildable</code> interface supports
 * adding items directly using the &#60;items&#62; element and specifying &#60;item&#62;
 * elements for each item. Each &#60;item&#62; element can specify the &#8220;id&#8221;
 * corresponding to the appended text and also supports the regular
 * translation attributes &#8220;translatable&#8221;, &#8220;context&#8221; and &#8220;comments&#8221;.
 * <p>
 * Here is a UI definition fragment specifying <code>GtkComboBoxText</code> items:<pre>xml
 * &#60;object class=&#34;GtkComboBoxText&#34;&#62;
 *   &#60;items&#62;
 *     &#60;item translatable=&#34;yes&#34; id=&#34;factory&#34;&#62;Factory&#60;/item&#62;
 *     &#60;item translatable=&#34;yes&#34; id=&#34;home&#34;&#62;Home&#60;/item&#62;
 *     &#60;item translatable=&#34;yes&#34; id=&#34;subway&#34;&#62;Subway&#60;/item&#62;
 *   &#60;/items&#62;
 * &#60;/object&#62;
 * </pre>
 * <p>
 * <h1>SS nodes</h1>
 * <p><pre>
 * combobox
 * &#9584;&#9472;&#9472; box.linked
 *     &#9500;&#9472;&#9472; entry.combo
 *     &#9500;&#9472;&#9472; button.combo
 *     &#9584;&#9472;&#9472; window.popup
 * </pre>
 * <p><code>GtkComboBoxText</code> has a single CSS node with name combobox. It adds
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
     * Creates a new <code>GtkComboBoxText</code>.
     */
    public ComboBoxText() {
        super(constructNew());
    }
    
    private static Reference constructNewWithEntry() {
        Reference RESULT = References.get(gtk_h.gtk_combo_box_text_new_with_entry(), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkComboBoxText</code> with an entry.
     */
    public static ComboBoxText newWithEntry() {
        return new ComboBoxText(constructNewWithEntry());
    }
    
    /**
     * Appends @text to the list of strings stored in @combo_box.
     * 
     * If @id is non-<code>null</code> then it is used as the ID of the row.
     * 
     * This is the same as calling {@link org.gtk.gtk.ComboBoxText#insert}
     * with a position of -1.
     */
    public void append(java.lang.String id, java.lang.String text) {
        gtk_h.gtk_combo_box_text_append(handle(), Interop.allocateNativeString(id).handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Appends @text to the list of strings stored in @combo_box.
     * 
     * This is the same as calling {@link org.gtk.gtk.ComboBoxText#insertText}
     * with a position of -1.
     */
    public void appendText(java.lang.String text) {
        gtk_h.gtk_combo_box_text_append_text(handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Returns the currently active string in @combo_box.
     * 
     * If no row is currently selected, <code>null</code> is returned.
     * If @combo_box contains an entry, this function will
     * return its contents (which will not necessarily
     * be an item from the list).
     */
    public java.lang.String getActiveText() {
        var RESULT = gtk_h.gtk_combo_box_text_get_active_text(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Inserts @text at @position in the list of strings stored in @combo_box.
     * 
     * If @id is non-<code>null</code> then it is used as the ID of the row.
     * See {@link [property@Gtk.ComboBox:id-column] (ref=property)}.
     * 
     * If @position is negative then @text is appended.
     */
    public void insert(int position, java.lang.String id, java.lang.String text) {
        gtk_h.gtk_combo_box_text_insert(handle(), position, Interop.allocateNativeString(id).handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Inserts @text at @position in the list of strings stored in @combo_box.
     * 
     * If @position is negative then @text is appended.
     * 
     * This is the same as calling {@link org.gtk.gtk.ComboBoxText#insert}
     * with a <code>null</code> ID string.
     */
    public void insertText(int position, java.lang.String text) {
        gtk_h.gtk_combo_box_text_insert_text(handle(), position, Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Prepends @text to the list of strings stored in @combo_box.
     * 
     * If @id is non-<code>null</code> then it is used as the ID of the row.
     * 
     * This is the same as calling {@link org.gtk.gtk.ComboBoxText#insert}
     * with a position of 0.
     */
    public void prepend(java.lang.String id, java.lang.String text) {
        gtk_h.gtk_combo_box_text_prepend(handle(), Interop.allocateNativeString(id).handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Prepends @text to the list of strings stored in @combo_box.
     * 
     * This is the same as calling {@link org.gtk.gtk.ComboBoxText#insertText}
     * with a position of 0.
     */
    public void prependText(java.lang.String text) {
        gtk_h.gtk_combo_box_text_prepend_text(handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Removes the string at @position from @combo_box.
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
