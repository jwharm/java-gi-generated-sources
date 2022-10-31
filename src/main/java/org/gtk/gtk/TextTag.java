package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTextTag";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public TextTag(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to TextTag if its GType is a (or inherits from) "GtkTextTag".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "TextTag" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkTextTag", a ClassCastException will be thrown.
     */
    public static TextTag castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkTextTag"))) {
            return new TextTag(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkTextTag");
        }
    }
    
    private static Refcounted constructNew(@Nullable java.lang.String name) {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_text_tag_new.invokeExact(
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name))), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkTextTag}.
     * @param name tag name
     */
    public TextTag(@Nullable java.lang.String name) {
        super(constructNew(name));
    }
    
    /**
     * Emits the {@code Gtk.TextTagTable::tag-changed} signal on the
     * {@code GtkTextTagTable} where the tag is included.
     * <p>
     * The signal is already emitted when setting a {@code GtkTextTag} property.
     * This function is useful for a {@code GtkTextTag} subclass.
     * @param sizeChanged whether the change affects the {@code GtkTextView} layout
     */
    public void changed(boolean sizeChanged) {
        try {
            DowncallHandles.gtk_text_tag_changed.invokeExact(
                    handle(),
                    sizeChanged ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the tag priority.
     * @return The tag’s priority.
     */
    public int getPriority() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_tag_get_priority.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param priority the new priority
     */
    public void setPriority(int priority) {
        try {
            DowncallHandles.gtk_text_tag_set_priority.invokeExact(
                    handle(),
                    priority);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_text_tag_new = Interop.downcallHandle(
            "gtk_text_tag_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_text_tag_changed = Interop.downcallHandle(
            "gtk_text_tag_changed",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_text_tag_get_priority = Interop.downcallHandle(
            "gtk_text_tag_get_priority",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_text_tag_set_priority = Interop.downcallHandle(
            "gtk_text_tag_set_priority",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
