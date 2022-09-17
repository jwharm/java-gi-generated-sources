package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Defines a part of a CSS document.
 * 
 * Because sections are nested into one another, you can use
 * {@link [method@CssSection.get_parent]} to get the containing region.
 */
public class CssSection extends io.github.jwharm.javagi.ResourceBase {

    public CssSection(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew(org.gtk.gio.File file, CssLocation start, CssLocation end) {
        Reference RESULT = References.get(gtk_h.gtk_css_section_new(file.handle(), start.handle(), end.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkCssSection</code> referring to the section
     * in the given <code>file</code> from the <code>start</code> location to the<code>end</code> location.
     */
    public CssSection(org.gtk.gio.File file, CssLocation start, CssLocation end) {
        super(constructNew(file, start, end));
    }
    
    /**
     * Returns the location in the CSS document where this section ends.
     */
    public CssLocation getEndLocation() {
        var RESULT = gtk_h.gtk_css_section_get_end_location(handle());
        return new CssLocation(References.get(RESULT, false));
    }
    
    /**
     * Gets the file that @section was parsed from.
     * <p>
     * If no such file exists, for example because the CSS was loaded via
     * {@link org.gtk.gtk.CssProvider#loadFromData}, then <code>NULL</code> is returned.
     */
    public org.gtk.gio.File getFile() {
        var RESULT = gtk_h.gtk_css_section_get_file(handle());
        return new org.gtk.gio.File.FileImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets the parent section for the given <code>section</code>.
     * <p>
     * The parent section is the section that contains this <code>section</code>. A special
     * case are sections of  type <code>GTK_CSS_SECTION_DOCUMEN</code>T. Their parent will
     * either be <code>NULL</code> if they are the original CSS document that was loaded by
     * {@link org.gtk.gtk.CssProvider#loadFromFile} or a section of type<code>GTK_CSS_SECTION_IMPORT</code> if it was loaded with an <code>@import</code> rule from
     * a different file.
     */
    public CssSection getParent() {
        var RESULT = gtk_h.gtk_css_section_get_parent(handle());
        return new CssSection(References.get(RESULT, false));
    }
    
    /**
     * Returns the location in the CSS document where this section starts.
     */
    public CssLocation getStartLocation() {
        var RESULT = gtk_h.gtk_css_section_get_start_location(handle());
        return new CssLocation(References.get(RESULT, false));
    }
    
    /**
     * Prints the <code>section</code> into <code>string</code> in a human-readable form.
     * <p>
     * This is a form like <code>gtk.css:32:1-23</code> to denote line 32, characters
     * 1 to 23 in the file <code>gtk.css</code>.
     */
    public void print(org.gtk.glib.String string) {
        gtk_h.gtk_css_section_print(handle(), string.handle());
    }
    
    /**
     * Increments the reference count on <code>section</code>.
     */
    public CssSection ref() {
        var RESULT = gtk_h.gtk_css_section_ref(handle());
        return new CssSection(References.get(RESULT, true));
    }
    
    /**
     * Prints the section into a human-readable text form using
     * {@link org.gtk.gtk.CssSection#print}.
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.gtk_css_section_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Decrements the reference count on <code>section</code>, freeing the
     * structure if the reference count reaches 0.
     */
    public void unref() {
        gtk_h.gtk_css_section_unref(handle());
    }
    
}
