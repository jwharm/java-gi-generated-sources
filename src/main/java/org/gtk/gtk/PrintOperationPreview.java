package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkPrintOperationPreview} is the interface that is used to
 * implement print preview.
 * <p>
 * A {@code GtkPrintOperationPreview} object is passed to the
 * {@code Gtk.PrintOperation::preview} signal by
 * {@link PrintOperation}.
 */
public interface PrintOperationPreview extends io.github.jwharm.javagi.Proxy {
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PrintOperationPreviewImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PrintOperationPreviewImpl(input, ownership);
    
    /**
     * Ends a preview.
     * <p>
     * This function must be called to finish a custom print preview.
     */
    default void endPreview() {
        try {
            DowncallHandles.gtk_print_operation_preview_end_preview.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns whether the given page is included in the set of pages that
     * have been selected for printing.
     * @param pageNr a page number
     * @return {@code true} if the page has been selected for printing
     */
    default boolean isSelected(int pageNr) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_operation_preview_is_selected.invokeExact(
                    handle(),
                    pageNr);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Renders a page to the preview.
     * <p>
     * This is using the print context that was passed to the
     * {@code Gtk.PrintOperation::preview} handler together
     * with {@code preview}.
     * <p>
     * A custom print preview should use this function to render
     * the currently selected page.
     * <p>
     * Note that this function requires a suitable cairo context to
     * be associated with the print context.
     * @param pageNr the page to render
     */
    default void renderPage(int pageNr) {
        try {
            DowncallHandles.gtk_print_operation_preview_render_page.invokeExact(
                    handle(),
                    pageNr);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_print_operation_preview_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface GotPageSize {
        void run(org.gtk.gtk.PrintContext context, org.gtk.gtk.PageSetup pageSetup);

        @ApiStatus.Internal default void upcall(MemoryAddress sourcePrintOperationPreview, MemoryAddress context, MemoryAddress pageSetup) {
            run((org.gtk.gtk.PrintContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gtk.PrintContext.fromAddress).marshal(context, Ownership.NONE), (org.gtk.gtk.PageSetup) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pageSetup)), org.gtk.gtk.PageSetup.fromAddress).marshal(pageSetup, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GotPageSize.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted once for each page that gets rendered to the preview.
     * <p>
     * A handler for this signal should update the {@code context}
     * according to {@code page_setup} and set up a suitable cairo
     * context, using {@link PrintContext#setCairoContext}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<PrintOperationPreview.GotPageSize> onGotPageSize(PrintOperationPreview.GotPageSize handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("got-page-size"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Ready {
        void run(org.gtk.gtk.PrintContext context);

        @ApiStatus.Internal default void upcall(MemoryAddress sourcePrintOperationPreview, MemoryAddress context) {
            run((org.gtk.gtk.PrintContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gtk.PrintContext.fromAddress).marshal(context, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Ready.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * The ::ready signal gets emitted once per preview operation,
     * before the first page is rendered.
     * <p>
     * A handler for this signal can be used for setup tasks.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<PrintOperationPreview.Ready> onReady(PrintOperationPreview.Ready handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("ready"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_print_operation_preview_end_preview = Interop.downcallHandle(
            "gtk_print_operation_preview_end_preview",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_print_operation_preview_is_selected = Interop.downcallHandle(
            "gtk_print_operation_preview_is_selected",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_print_operation_preview_render_page = Interop.downcallHandle(
            "gtk_print_operation_preview_render_page",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_print_operation_preview_get_type = Interop.downcallHandle(
            "gtk_print_operation_preview_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class PrintOperationPreviewImpl extends org.gtk.gobject.GObject implements PrintOperationPreview {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public PrintOperationPreviewImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
