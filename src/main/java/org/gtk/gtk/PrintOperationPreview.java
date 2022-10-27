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
     * Ends a preview.
     * <p>
     * This function must be called to finish a custom print preview.
     */
    default void endPreview() {
        try {
            DowncallHandles.gtk_print_operation_preview_end_preview.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gtk_print_operation_preview_is_selected.invokeExact(handle(), pageNr);
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
            DowncallHandles.gtk_print_operation_preview_render_page.invokeExact(handle(), pageNr);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     */
    public default Signal<PrintOperationPreview.GotPageSize> onGotPageSize(PrintOperationPreview.GotPageSize handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("got-page-size"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperationPreview.Callbacks.class, "signalPrintOperationPreviewGotPageSize",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
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
     */
    public default Signal<PrintOperationPreview.Ready> onReady(PrintOperationPreview.Ready handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("ready"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperationPreview.Callbacks.class, "signalPrintOperationPreviewReady",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
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
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_print_operation_preview_is_selected = Interop.downcallHandle(
            "gtk_print_operation_preview_is_selected",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_print_operation_preview_render_page = Interop.downcallHandle(
            "gtk_print_operation_preview_render_page",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
    
    @ApiStatus.Internal
    static class Callbacks {
        
        public static void signalPrintOperationPreviewGotPageSize(MemoryAddress source, MemoryAddress context, MemoryAddress pageSetup, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (PrintOperationPreview.GotPageSize) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PrintOperationPreview.PrintOperationPreviewImpl(Refcounted.get(source)), new org.gtk.gtk.PrintContext(Refcounted.get(context, false)), new org.gtk.gtk.PageSetup(Refcounted.get(pageSetup, false)));
        }
        
        public static void signalPrintOperationPreviewReady(MemoryAddress source, MemoryAddress context, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (PrintOperationPreview.Ready) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PrintOperationPreview.PrintOperationPreviewImpl(Refcounted.get(source)), new org.gtk.gtk.PrintContext(Refcounted.get(context, false)));
        }
    }
    
    class PrintOperationPreviewImpl extends org.gtk.gobject.Object implements PrintOperationPreview {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public PrintOperationPreviewImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
