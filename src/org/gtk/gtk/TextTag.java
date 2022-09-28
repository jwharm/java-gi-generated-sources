package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A tag that can be applied to text contained in a {@code GtkTextBuffer}.
 * <p>
 * You may wish to begin by reading the
 * <a href="section-text-widget.html">text widget conceptual overview</a>,
 * which gives an overview of all the objects and data types
 * related to the text widget and how they work together.
 * <p>
 * Tags should be in the {@link TextTagTable} for a given
 * {@code GtkTextBuffer} before using them with that buffer.
 * <p>
 * {@link TextBuffer#createTag} is the best way to create tags.
 * See “gtk4-demo” for numerous examples.
 * <p>
 * For each property of {@code GtkTextTag}, there is a “set” property, e.g.
 * “font-set” corresponds to “font”. These “set” properties reflect
 * whether a property has been set or not.
 * <p>
 * They are maintained by GTK and you should not set them independently.
 */
public class TextTag extends org.gtk.gobject.Object {

    public TextTag(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TextTag */
    public static TextTag castFrom(org.gtk.gobject.Object gobject) {
        return new TextTag(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String name) {
        Reference RESULT = References.get(gtk_h.gtk_text_tag_new(Interop.allocateNativeString(name).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkTextTag}.
     */
    public TextTag(java.lang.String name) {
        super(constructNew(name));
    }
    
    /**
     * Emits the {@code Gtk.TextTagTable::tag-changed} signal on the
     * {@code GtkTextTagTable} where the tag is included.
     * <p>
     * The signal is already emitted when setting a {@code GtkTextTag} property.
     * This function is useful for a {@code GtkTextTag} subclass.
     */
    public void changed(boolean sizeChanged) {
        gtk_h.gtk_text_tag_changed(handle(), sizeChanged ? 1 : 0);
    }
    
    /**
     * Get the tag priority.
     */
    public int getPriority() {
        var RESULT = gtk_h.gtk_text_tag_get_priority(handle());
        return RESULT;
    }
    
    /**
     * Sets the priority of a {@code GtkTextTag}.
     * <p>
     * Valid priorities start at 0 and go to one less than
     * {@link TextTagTable#getSize}. Each tag in a table
     * has a unique priority; setting the priority of one tag shifts
     * the priorities of all the other tags in the table to maintain
     * a unique priority for each tag.
     * <p>
     * Higher priority tags “win” if two tags both set the same text
     * attribute. When adding a tag to a tag table, it will be assigned
     * the highest priority in the table by default; so normally the
     * precedence of a set of tags is the order in which they were added
     * to the table, or created with {@link TextBuffer#createTag},
     * which adds the tag to the buffer’s table automatically.
     */
    public void setPriority(int priority) {
        gtk_h.gtk_text_tag_set_priority(handle(), priority);
    }
    
}
