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
    
    /**
     * Cast object to PrintOperationPreview if its GType is a (or inherits from) "GtkPrintOperationPreview".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PrintOperationPreview} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkPrintOperationPreview", a ClassCastException will be thrown.
     */
    public static PrintOperationPreview castFrom(org.gtk.gobject.Object gobject) {
            return new PrintOperationPreviewImpl(gobject.handle(), gobject.yieldOwnership());
    }
    
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
        return RESULT != 0;
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
    public static @NotNull org.gtk.glib.Type getType() {
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
        void signalReceived(PrintOperationPreview source, @NotNull org.gtk.gtk.PrintContext context, @NotNull org.gtk.gtk.PageSetup pageSetup);
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
                handle(),
                Interop.allocateNativeString("got-page-size"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperationPreview.Callbacks.class, "signalPrintOperationPreviewGotPageSize",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PrintOperationPreview.GotPageSize>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Ready {
        void signalReceived(PrintOperationPreview source, @NotNull org.gtk.gtk.PrintContext context);
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
                handle(),
                Interop.allocateNativeString("ready"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperationPreview.Callbacks.class, "signalPrintOperationPreviewReady",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PrintOperationPreview.Ready>(handle(), RESULT);
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
    
    @ApiStatus.Internal
    static class Callbacks {
        
        public static void signalPrintOperationPreviewGotPageSize(MemoryAddress source, MemoryAddress context, MemoryAddress pageSetup, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PrintOperationPreview.GotPageSize) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PrintOperationPreview.PrintOperationPreviewImpl(source, Ownership.NONE), new org.gtk.gtk.PrintContext(context, Ownership.NONE), new org.gtk.gtk.PageSetup(pageSetup, Ownership.NONE));
        }
        
        public static void signalPrintOperationPreviewReady(MemoryAddress source, MemoryAddress context, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PrintOperationPreview.Ready) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PrintOperationPreview.PrintOperationPreviewImpl(source, Ownership.NONE), new org.gtk.gtk.PrintContext(context, Ownership.NONE));
        }
    }
    
    class PrintOperationPreviewImpl extends org.gtk.gobject.Object implements PrintOperationPreview {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public PrintOperationPreviewImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
