package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
public class CellRendererText extends CellRenderer {

    public CellRendererText(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CellRendererText */
    public static CellRendererText castFrom(org.gtk.gobject.Object gobject) {
        return new CellRendererText(gobject.refcounted());
    }
    
    static final MethodHandle gtk_cell_renderer_text_new = Interop.downcallHandle(
        "gtk_cell_renderer_text_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_cell_renderer_text_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    
    static final MethodHandle gtk_cell_renderer_text_set_fixed_height_from_font = Interop.downcallHandle(
        "gtk_cell_renderer_text_set_fixed_height_from_font",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the height of a renderer to explicitly be determined by the “font” and
     * “y_pad” property set on it.  Further changes in these properties do not
     * affect the height, so they must be accompanied by a subsequent call to this
     * function.  Using this function is inflexible, and should really only be used
     * if calculating the size of a cell is too slow (ie, a massive number of cells
     * displayed).  If {@code number_of_rows} is -1, then the fixed height is unset, and
     * the height is determined by the properties again.
     */
    public void setFixedHeightFromFont(int numberOfRows) {
        try {
            gtk_cell_renderer_text_set_fixed_height_from_font.invokeExact(handle(), numberOfRows);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface EditedHandler {
        void signalReceived(CellRendererText source, java.lang.String path, java.lang.String newText);
    }
    
    /**
     * This signal is emitted after {@code renderer} has been edited.
     * <p>
     * It is the responsibility of the application to update the model
     * and store {@code new_text} at the position indicated by {@code path}.
     */
    public SignalHandle onEdited(EditedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("edited").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellRendererText.Callbacks.class, "signalCellRendererTextEdited",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalCellRendererTextEdited(MemoryAddress source, MemoryAddress path, MemoryAddress newText, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (CellRendererText.EditedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new CellRendererText(Refcounted.get(source)), path.getUtf8String(0), newText.getUtf8String(0));
        }
        
    }
}
