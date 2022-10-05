package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Defines a part of a CSS document.
 * <p>
 * Because sections are nested into one another, you can use
 * {@link CssSection#getParent} to get the containing region.
 */
public class CssSection extends io.github.jwharm.javagi.ResourceBase {

    public CssSection(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle gtk_css_section_new = Interop.downcallHandle(
        "gtk_css_section_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(org.gtk.gio.File file, CssLocation start, CssLocation end) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_css_section_new.invokeExact(file.handle(), start.handle(), end.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkCssSection} referring to the section
     * in the given {@code file} from the {@code start} location to the
     * {@code end} location.
     */
    public CssSection(org.gtk.gio.File file, CssLocation start, CssLocation end) {
        super(constructNew(file, start, end));
    }
    
    static final MethodHandle gtk_css_section_get_end_location = Interop.downcallHandle(
        "gtk_css_section_get_end_location",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the location in the CSS document where this section ends.
     */
    public CssLocation getEndLocation() {
        try {
            var RESULT = (MemoryAddress) gtk_css_section_get_end_location.invokeExact(handle());
            return new CssLocation(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_css_section_get_file = Interop.downcallHandle(
        "gtk_css_section_get_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the file that {@code section} was parsed from.
     * <p>
     * If no such file exists, for example because the CSS was loaded via
     * {@link CssProvider#loadFromData}, then {@code NULL} is returned.
     */
    public org.gtk.gio.File getFile() {
        try {
            var RESULT = (MemoryAddress) gtk_css_section_get_file.invokeExact(handle());
            return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_css_section_get_parent = Interop.downcallHandle(
        "gtk_css_section_get_parent",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the parent section for the given {@code section}.
     * <p>
     * The parent section is the section that contains this {@code section}. A special
     * case are sections of  type {@code GTK_CSS_SECTION_DOCUMEN}T. Their parent will
     * either be {@code NULL} if they are the original CSS document that was loaded by
     * {@link CssProvider#loadFromFile} or a section of type
     * {@code GTK_CSS_SECTION_IMPORT} if it was loaded with an {@code @import} rule from
     * a different file.
     */
    public CssSection getParent() {
        try {
            var RESULT = (MemoryAddress) gtk_css_section_get_parent.invokeExact(handle());
            return new CssSection(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_css_section_get_start_location = Interop.downcallHandle(
        "gtk_css_section_get_start_location",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the location in the CSS document where this section starts.
     */
    public CssLocation getStartLocation() {
        try {
            var RESULT = (MemoryAddress) gtk_css_section_get_start_location.invokeExact(handle());
            return new CssLocation(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_css_section_print = Interop.downcallHandle(
        "gtk_css_section_print",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prints the {@code section} into {@code string} in a human-readable form.
     * <p>
     * This is a form like {@code gtk.css:32:1-23} to denote line 32, characters
     * 1 to 23 in the file {@code gtk.css}.
     */
    public void print(org.gtk.glib.String string) {
        try {
            gtk_css_section_print.invokeExact(handle(), string.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_css_section_ref = Interop.downcallHandle(
        "gtk_css_section_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increments the reference count on {@code section}.
     */
    public CssSection ref() {
        try {
            var RESULT = (MemoryAddress) gtk_css_section_ref.invokeExact(handle());
            return new CssSection(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_css_section_to_string = Interop.downcallHandle(
        "gtk_css_section_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prints the section into a human-readable text form using
     * {@link CssSection#print}.
     */
    public java.lang.String toString() {
        try {
            var RESULT = (MemoryAddress) gtk_css_section_to_string.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_css_section_unref = Interop.downcallHandle(
        "gtk_css_section_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decrements the reference count on {@code section}, freeing the
     * structure if the reference count reaches 0.
     */
    public void unref() {
        try {
            gtk_css_section_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
