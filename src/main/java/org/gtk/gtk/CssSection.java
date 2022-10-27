package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines a part of a CSS document.
 * <p>
 * Because sections are nested into one another, you can use
 * {@code CssSection#getParent} to get the containing region.
 */
public class CssSection extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public CssSection(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gio.File file, @NotNull org.gtk.gtk.CssLocation start, @NotNull org.gtk.gtk.CssLocation end) {
        java.util.Objects.requireNonNullElse(file, MemoryAddress.NULL);
        java.util.Objects.requireNonNull(start, "Parameter 'start' must not be null");
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_css_section_new.invokeExact(file.handle(), start.handle(), end.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCssSection} referring to the section
     * in the given {@code file} from the {@code start} location to the
     * {@code end} location.
     * @param file The file this section refers to
     * @param start The start location
     * @param end The end location
     */
    public CssSection(@Nullable org.gtk.gio.File file, @NotNull org.gtk.gtk.CssLocation start, @NotNull org.gtk.gtk.CssLocation end) {
        super(constructNew(file, start, end));
    }
    
    /**
     * Returns the location in the CSS document where this section ends.
     * @return The end location of
     *   this section
     */
    public @NotNull org.gtk.gtk.CssLocation getEndLocation() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_css_section_get_end_location.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.CssLocation(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the file that {@code section} was parsed from.
     * <p>
     * If no such file exists, for example because the CSS was loaded via
     * {@link CssProvider#loadFromData}, then {@code NULL} is returned.
     * @return the {@code GFile} from which the {@code section}
     *   was parsed
     */
    public @Nullable org.gtk.gio.File getFile() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_css_section_get_file.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the parent section for the given {@code section}.
     * <p>
     * The parent section is the section that contains this {@code section}. A special
     * case are sections of  type {@code GTK_CSS_SECTION_DOCUMEN}T. Their parent will
     * either be {@code NULL} if they are the original CSS document that was loaded by
     * {@link CssProvider#loadFromFile} or a section of type
     * {@code GTK_CSS_SECTION_IMPORT} if it was loaded with an {@code @import} rule from
     * a different file.
     * @return the parent section
     */
    public @Nullable org.gtk.gtk.CssSection getParent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_css_section_get_parent.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.CssSection(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the location in the CSS document where this section starts.
     * @return The start location of
     *   this section
     */
    public @NotNull org.gtk.gtk.CssLocation getStartLocation() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_css_section_get_start_location.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.CssLocation(Refcounted.get(RESULT, false));
    }
    
    /**
     * Prints the {@code section} into {@code string} in a human-readable form.
     * <p>
     * This is a form like {@code gtk.css:32:1-23} to denote line 32, characters
     * 1 to 23 in the file {@code gtk.css}.
     * @param string a {@code GString} to print to
     */
    public void print(@NotNull org.gtk.glib.String string) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        try {
            DowncallHandles.gtk_css_section_print.invokeExact(handle(), string.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increments the reference count on {@code section}.
     * @return the CSS section itself.
     */
    public @NotNull org.gtk.gtk.CssSection ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_css_section_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.CssSection(Refcounted.get(RESULT, true));
    }
    
    /**
     * Prints the section into a human-readable text form using
     * {@link CssSection#print}.
     * @return A new string.
     */
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_css_section_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Decrements the reference count on {@code section}, freeing the
     * structure if the reference count reaches 0.
     */
    public void unref() {
        try {
            DowncallHandles.gtk_css_section_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_css_section_new = Interop.downcallHandle(
            "gtk_css_section_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_css_section_get_end_location = Interop.downcallHandle(
            "gtk_css_section_get_end_location",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_css_section_get_file = Interop.downcallHandle(
            "gtk_css_section_get_file",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_css_section_get_parent = Interop.downcallHandle(
            "gtk_css_section_get_parent",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_css_section_get_start_location = Interop.downcallHandle(
            "gtk_css_section_get_start_location",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_css_section_print = Interop.downcallHandle(
            "gtk_css_section_print",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_css_section_ref = Interop.downcallHandle(
            "gtk_css_section_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_css_section_to_string = Interop.downcallHandle(
            "gtk_css_section_to_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_css_section_unref = Interop.downcallHandle(
            "gtk_css_section_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
}
