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
public class CssSection extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCssSection";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link CssSection}
     * @return A new, uninitialized @{link CssSection}
     */
    public static CssSection allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        CssSection newInstance = new CssSection(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a CssSection proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CssSection(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CssSection> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CssSection(input);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.gio.File file, org.gtk.gtk.CssLocation start, org.gtk.gtk.CssLocation end) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_css_section_new.invokeExact(
                    (Addressable) (file == null ? MemoryAddress.NULL : file.handle()),
                    start.handle(),
                    end.handle());
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
    public CssSection(@Nullable org.gtk.gio.File file, org.gtk.gtk.CssLocation start, org.gtk.gtk.CssLocation end) {
        super(constructNew(file, start, end));
        this.takeOwnership();
    }
    
    /**
     * Returns the location in the CSS document where this section ends.
     * @return The end location of
     *   this section
     */
    public org.gtk.gtk.CssLocation getEndLocation() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_css_section_get_end_location.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.CssLocation.fromAddress.marshal(RESULT, null);
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
        return (org.gtk.gio.File) Interop.register(RESULT, org.gtk.gio.File.fromAddress).marshal(RESULT, null);
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
        return org.gtk.gtk.CssSection.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the location in the CSS document where this section starts.
     * @return The start location of
     *   this section
     */
    public org.gtk.gtk.CssLocation getStartLocation() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_css_section_get_start_location.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.CssLocation.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Prints the {@code section} into {@code string} in a human-readable form.
     * <p>
     * This is a form like {@code gtk.css:32:1-23} to denote line 32, characters
     * 1 to 23 in the file {@code gtk.css}.
     * @param string a {@code GString} to print to
     */
    public void print(org.gtk.glib.GString string) {
        try {
            DowncallHandles.gtk_css_section_print.invokeExact(
                    handle(),
                    string.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increments the reference count on {@code section}.
     * @return the CSS section itself.
     */
    public org.gtk.gtk.CssSection ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_css_section_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.gtk.CssSection.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Prints the section into a human-readable text form using
     * {@link CssSection#print}.
     * @return A new string.
     */
    public java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_css_section_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
        this.yieldOwnership();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_css_section_new = Interop.downcallHandle(
                "gtk_css_section_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_css_section_get_end_location = Interop.downcallHandle(
                "gtk_css_section_get_end_location",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_css_section_get_file = Interop.downcallHandle(
                "gtk_css_section_get_file",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_css_section_get_parent = Interop.downcallHandle(
                "gtk_css_section_get_parent",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_css_section_get_start_location = Interop.downcallHandle(
                "gtk_css_section_get_start_location",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_css_section_print = Interop.downcallHandle(
                "gtk_css_section_print",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_css_section_ref = Interop.downcallHandle(
                "gtk_css_section_ref",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_css_section_to_string = Interop.downcallHandle(
                "gtk_css_section_to_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_css_section_unref = Interop.downcallHandle(
                "gtk_css_section_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
    }
}
