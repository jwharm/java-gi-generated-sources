package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Renders a toggle button in a cell
 * <p>
 * {@code GtkCellRendererToggle} renders a toggle button in a cell. The
 * button is drawn as a radio or a checkbutton, depending on the
 * {@code GtkCellRendererToggle:radio} property.
 * When activated, it emits the {@code GtkCellRendererToggle::toggled} signal.
 */
public class CellRendererToggle extends CellRenderer {

    public CellRendererToggle(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CellRendererToggle */
    public static CellRendererToggle castFrom(org.gtk.gobject.Object gobject) {
        return new CellRendererToggle(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_cell_renderer_toggle_new = Interop.downcallHandle(
        "gtk_cell_renderer_toggle_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_cell_renderer_toggle_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkCellRendererToggle}. Adjust rendering
     * parameters using object properties. Object properties can be set
     * globally (with g_object_set()). Also, with {@code GtkTreeViewColumn}, you
     * can bind a property to a value in a {@code GtkTreeModel}. For example, you
     * can bind the “active” property on the cell renderer to a boolean value
     * in the model, thus causing the check button to reflect the state of
     * the model.
     */
    public CellRendererToggle() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_cell_renderer_toggle_get_activatable = Interop.downcallHandle(
        "gtk_cell_renderer_toggle_get_activatable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the cell renderer is activatable. See
     * gtk_cell_renderer_toggle_set_activatable().
     */
    public boolean getActivatable() {
        int RESULT;
        try {
            RESULT = (int) gtk_cell_renderer_toggle_get_activatable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_cell_renderer_toggle_get_active = Interop.downcallHandle(
        "gtk_cell_renderer_toggle_get_active",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the cell renderer is active. See
     * gtk_cell_renderer_toggle_set_active().
     */
    public boolean getActive() {
        int RESULT;
        try {
            RESULT = (int) gtk_cell_renderer_toggle_get_active.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_cell_renderer_toggle_get_radio = Interop.downcallHandle(
        "gtk_cell_renderer_toggle_get_radio",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether we’re rendering radio toggles rather than checkboxes.
     */
    public boolean getRadio() {
        int RESULT;
        try {
            RESULT = (int) gtk_cell_renderer_toggle_get_radio.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_cell_renderer_toggle_set_activatable = Interop.downcallHandle(
        "gtk_cell_renderer_toggle_set_activatable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Makes the cell renderer activatable.
     */
    public @NotNull void setActivatable(@NotNull boolean setting) {
        try {
            gtk_cell_renderer_toggle_set_activatable.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_cell_renderer_toggle_set_active = Interop.downcallHandle(
        "gtk_cell_renderer_toggle_set_active",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Activates or deactivates a cell renderer.
     */
    public @NotNull void setActive(@NotNull boolean setting) {
        try {
            gtk_cell_renderer_toggle_set_active.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_cell_renderer_toggle_set_radio = Interop.downcallHandle(
        "gtk_cell_renderer_toggle_set_radio",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If {@code radio} is {@code true}, the cell renderer renders a radio toggle
     * (i.e. a toggle in a group of mutually-exclusive toggles).
     * If {@code false}, it renders a check toggle (a standalone boolean option).
     * This can be set globally for the cell renderer, or changed just
     * before rendering each cell in the model (for {@code GtkTreeView}, you set
     * up a per-row setting using {@code GtkTreeViewColumn} to associate model
     * columns with cell renderer properties).
     */
    public @NotNull void setRadio(@NotNull boolean radio) {
        try {
            gtk_cell_renderer_toggle_set_radio.invokeExact(handle(), radio ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToggledHandler {
        void signalReceived(CellRendererToggle source, @NotNull java.lang.String path);
    }
    
    /**
     * The ::toggled signal is emitted when the cell is toggled.
     * <p>
     * It is the responsibility of the application to update the model
     * with the correct value to store at {@code path}.  Often this is simply the
     * opposite of the value currently stored at {@code path}.
     */
    public SignalHandle onToggled(ToggledHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("toggled"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellRendererToggle.Callbacks.class, "signalCellRendererToggleToggled",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalCellRendererToggleToggled(MemoryAddress source, MemoryAddress path, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (CellRendererToggle.ToggledHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new CellRendererToggle(Refcounted.get(source)), path.getUtf8String(0));
        }
        
    }
}
