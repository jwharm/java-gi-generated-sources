package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Renders text in a cell
 * <p>
 * A {@code GtkCellRendererText} renders a given text in its cell, using the font, color and
 * style information provided by its properties. The text will be ellipsized if it is
 * too long and the {@code GtkCellRendererText:ellipsize} property allows it.
 * <p>
 * If the {@code GtkCellRenderer:mode} is {@link CellRendererMode#EDITABLE},
 * the {@code GtkCellRendererText} allows to edit its text using an entry.
 */
public class CellRendererText extends org.gtk.gtk.CellRenderer {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellRendererText";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.CellRenderer.getMemoryLayout().withName("parent")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gtk.gtk.CellRenderer parent$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return new org.gtk.gtk.CellRenderer(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public CellRendererText(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to CellRendererText if its GType is a (or inherits from) "GtkCellRendererText".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "CellRendererText" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCellRendererText", a ClassCastException will be thrown.
     */
    public static CellRendererText castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkCellRendererText"))) {
            return new CellRendererText(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkCellRendererText");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_cell_renderer_text_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellRendererText}. Adjust how text is drawn using
     * object properties. Object properties can be
     * set globally (with g_object_set()). Also, with {@code GtkTreeViewColumn},
     * you can bind a property to a value in a {@code GtkTreeModel}. For example,
     * you can bind the “text” property on the cell renderer to a string
     * value in the model, thus rendering a different string in each row
     * of the {@code GtkTreeView}.
     */
    public CellRendererText() {
        super(constructNew());
    }
    
    /**
     * Sets the height of a renderer to explicitly be determined by the “font” and
     * “y_pad” property set on it.  Further changes in these properties do not
     * affect the height, so they must be accompanied by a subsequent call to this
     * function.  Using this function is inflexible, and should really only be used
     * if calculating the size of a cell is too slow (ie, a massive number of cells
     * displayed).  If {@code number_of_rows} is -1, then the fixed height is unset, and
     * the height is determined by the properties again.
     * @param numberOfRows Number of rows of text each cell renderer is allocated, or -1
     */
    public void setFixedHeightFromFont(int numberOfRows) {
        try {
            DowncallHandles.gtk_cell_renderer_text_set_fixed_height_from_font.invokeExact(
                    handle(),
                    numberOfRows);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Edited {
        void signalReceived(CellRendererText source, @NotNull java.lang.String path, @NotNull java.lang.String newText);
    }
    
    /**
     * This signal is emitted after {@code renderer} has been edited.
     * <p>
     * It is the responsibility of the application to update the model
     * and store {@code new_text} at the position indicated by {@code path}.
     */
    public Signal<CellRendererText.Edited> onEdited(CellRendererText.Edited handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("edited"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellRendererText.Callbacks.class, "signalCellRendererTextEdited",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<CellRendererText.Edited>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_renderer_text_new = Interop.downcallHandle(
            "gtk_cell_renderer_text_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_cell_renderer_text_set_fixed_height_from_font = Interop.downcallHandle(
            "gtk_cell_renderer_text_set_fixed_height_from_font",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
    
    private static class Callbacks {
        
        public static void signalCellRendererTextEdited(MemoryAddress source, MemoryAddress path, MemoryAddress newText, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (CellRendererText.Edited) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new CellRendererText(Refcounted.get(source)), Interop.getStringFrom(path), Interop.getStringFrom(newText));
        }
    }
}
