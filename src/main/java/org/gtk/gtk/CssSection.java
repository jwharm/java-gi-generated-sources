package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gtk_css_section_new = Interop.downcallHandle(
        "gtk_css_section_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@Nullable org.gtk.gio.File file, @NotNull CssLocation start, @NotNull CssLocation end) {
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
    public CssSection(@Nullable org.gtk.gio.File file, @NotNull CssLocation start, @NotNull CssLocation end) {
        super(constructNew(file, start, end));
    }
    
    private static final MethodHandle gtk_css_section_get_end_location = Interop.downcallHandle(
        "gtk_css_section_get_end_location",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the location in the CSS document where this section ends.
     */
    public @NotNull CssLocation getEndLocation() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_css_section_get_end_location.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new CssLocation(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_css_section_get_file = Interop.downcallHandle(
        "gtk_css_section_get_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the file that {@code section} was parsed from.
     * <p>
     * If no such file exists, for example because the CSS was loaded via
     * {@link CssProvider#loadFromData}, then {@code NULL} is returned.
     */
    public @Nullable org.gtk.gio.File getFile() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_css_section_get_file.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_css_section_get_parent = Interop.downcallHandle(
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
    public @Nullable CssSection getParent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_css_section_get_parent.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new CssSection(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_css_section_get_start_location = Interop.downcallHandle(
        "gtk_css_section_get_start_location",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the location in the CSS document where this section starts.
     */
    public @NotNull CssLocation getStartLocation() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_css_section_get_start_location.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new CssLocation(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_css_section_print = Interop.downcallHandle(
        "gtk_css_section_print",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prints the {@code section} into {@code string} in a human-readable form.
     * <p>
     * This is a form like {@code gtk.css:32:1-23} to denote line 32, characters
     * 1 to 23 in the file {@code gtk.css}.
     */
    public @NotNull void print(@NotNull org.gtk.glib.String string) {
        try {
            gtk_css_section_print.invokeExact(handle(), string.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_css_section_ref = Interop.downcallHandle(
        "gtk_css_section_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increments the reference count on {@code section}.
     */
    public @NotNull CssSection ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_css_section_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new CssSection(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gtk_css_section_to_string = Interop.downcallHandle(
        "gtk_css_section_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prints the section into a human-readable text form using
     * {@link CssSection#print}.
     */
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_css_section_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_css_section_unref = Interop.downcallHandle(
        "gtk_css_section_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decrements the reference count on {@code section}, freeing the
     * structure if the reference count reaches 0.
     */
    public @NotNull void unref() {
        try {
            gtk_css_section_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
