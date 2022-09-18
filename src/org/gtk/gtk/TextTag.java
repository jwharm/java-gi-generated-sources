package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A tag that can be applied to text contained in a <code>GtkTextBuffer</code>.
 * <p>
 * You may wish to begin by reading the
 * {@link [text widget conceptual overview]}(section-text-widget.html),
 * which gives an overview of all the objects and data types
 * related to the text widget and how they work together.
 * <p>
 * Tags should be in the {@link org.gtk.gtk.TextTagTable} for a given<code>GtkTextBuffer</code> before using them with that buffer.
 * <p>
 * {@link org.gtk.gtk.TextBuffer<code>#createTag</code>  is the best way to create tags.
 * See &<code>#8220</code> gtk4-demo&<code>#8221</code>  for numerous examples.
 * <p>
 * For each property of <code>GtkTextTag</code>, there is a &<code>#8220</code> set&<code>#8221</code>  property, e.g.
 * &<code>#8220</code> font-set&<code>#8221</code>  corresponds to &<code>#8220</code> font&<code>#8221</code> . These &<code>#8220</code> set&<code>#8221</code>  properties reflect
 * whether a property has been set or not.
 * 
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
     * Creates a <code>GtkTextTag</code>.
     */
    public TextTag(java.lang.String name) {
        super(constructNew(name));
    }
    
    /**
     * Emits the {@link [signal@Gtk.TextTagTable::tag-changed] (ref=signal)} signal on the<code>GtkTextTagTable</code> where the tag is included.
     * <p>
     * The signal is already emitted when setting a <code>GtkTextTag</code> property.
     * This function is useful for a <code>GtkTextTag</code> subclass.
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
     * Sets the priority of a <code>GtkTextTag</code>.
     * 
     * Valid priorities start at 0 and go to one less than
     * {@link org.gtk.gtk.TextTagTable<code>#getSize</code> . Each tag in a table
     * has a unique priority; setting the priority of one tag shifts
     * the priorities of all the other tags in the table to maintain
     * a unique priority for each tag.
     * 
     * Higher priority tags &<code>#8220</code> win&<code>#8221</code>  if two tags both set the same text
     * attribute. When adding a tag to a tag table, it will be assigned
     * the highest priority in the table by default; so normally the
     * precedence of a set of tags is the order in which they were added
     * to the table, or created with {@link org.gtk.gtk.TextBuffer<code>#createTag</code> ,
     * which adds the tag to the buffer&<code>#8217</code> s table automatically.
     */
    public void setPriority(int priority) {
        gtk_h.gtk_text_tag_set_priority(handle(), priority);
    }
    
}
