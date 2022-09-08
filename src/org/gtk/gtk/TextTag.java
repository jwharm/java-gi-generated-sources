package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A tag that can be applied to text contained in a `GtkTextBuffer`.
 * 
 * You may wish to begin by reading the
 * [text widget conceptual overview](section-text-widget.html),
 * which gives an overview of all the objects and data types
 * related to the text widget and how they work together.
 * 
 * Tags should be in the [class@Gtk.TextTagTable] for a given
 * `GtkTextBuffer` before using them with that buffer.
 * 
 * [method@Gtk.TextBuffer.create_tag] is the best way to create tags.
 * See “gtk4-demo” for numerous examples.
 * 
 * For each property of `GtkTextTag`, there is a “set” property, e.g.
 * “font-set” corresponds to “font”. These “set” properties reflect
 * whether a property has been set or not.
 * 
 * They are maintained by GTK and you should not set them independently.
 */
public class TextTag extends org.gtk.gobject.Object {

    public TextTag(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TextTag */
    public static TextTag castFrom(org.gtk.gobject.Object gobject) {
        return new TextTag(gobject.getReference());
    }
    
    /**
     * Creates a `GtkTextTag`.
     */
    public TextTag(java.lang.String name) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_tag_new(Interop.allocateNativeString(name).HANDLE()), true));
    }
    
    /**
     * Emits the [signal@Gtk.TextTagTable::tag-changed] signal on the
     * `GtkTextTagTable` where the tag is included.
     * 
     * The signal is already emitted when setting a `GtkTextTag` property.
     * This function is useful for a `GtkTextTag` subclass.
     */
    public void changed(boolean sizeChanged) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_tag_changed(HANDLE(), sizeChanged ? 1 : 0);
    }
    
    /**
     * Get the tag priority.
     */
    public int getPriority() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_tag_get_priority(HANDLE());
        return RESULT;
    }
    
    /**
     * Sets the priority of a `GtkTextTag`.
     * 
     * Valid priorities start at 0 and go to one less than
     * [method@Gtk.TextTagTable.get_size]. Each tag in a table
     * has a unique priority; setting the priority of one tag shifts
     * the priorities of all the other tags in the table to maintain
     * a unique priority for each tag.
     * 
     * Higher priority tags “win” if two tags both set the same text
     * attribute. When adding a tag to a tag table, it will be assigned
     * the highest priority in the table by default; so normally the
     * precedence of a set of tags is the order in which they were added
     * to the table, or created with [method@Gtk.TextBuffer.create_tag],
     * which adds the tag to the buffer’s table automatically.
     */
    public void setPriority(int priority) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_tag_set_priority(HANDLE(), priority);
    }
    
}
