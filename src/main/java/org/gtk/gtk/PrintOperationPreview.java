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

    @ApiStatus.Internal static final MethodHandle gtk_print_operation_preview_end_preview = Interop.downcallHandle(
        "gtk_print_operation_preview_end_preview",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Ends a preview.
     * <p>
     * This function must be called to finish a custom print preview.
     */
    default @NotNull void endPreview() {
        try {
            gtk_print_operation_preview_end_preview.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_print_operation_preview_is_selected = Interop.downcallHandle(
        "gtk_print_operation_preview_is_selected",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns whether the given page is included in the set of pages that
     * have been selected for printing.
     */
    default boolean isSelected(@NotNull int pageNr) {
        int RESULT;
        try {
            RESULT = (int) gtk_print_operation_preview_is_selected.invokeExact(handle(), pageNr);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_print_operation_preview_render_page = Interop.downcallHandle(
        "gtk_print_operation_preview_render_page",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     */
    default @NotNull void renderPage(@NotNull int pageNr) {
        try {
            gtk_print_operation_preview_render_page.invokeExact(handle(), pageNr);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface GotPageSizeHandler {
        void signalReceived(PrintOperationPreview source, @NotNull PrintContext context, @NotNull PageSetup pageSetup);
    }
    
    /**
     * Emitted once for each page that gets rendered to the preview.
     * <p>
     * A handler for this signal should update the {@code context}
     * according to {@code page_setup} and set up a suitable cairo
     * context, using {@link PrintContext#setCairoContext}.
     */
    public default SignalHandle onGotPageSize(GotPageSizeHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("got-page-size"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperationPreview.Callbacks.class, "signalPrintOperationPreviewGotPageSize",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ReadyHandler {
        void signalReceived(PrintOperationPreview source, @NotNull PrintContext context);
    }
    
    /**
     * The ::ready signal gets emitted once per preview operation,
     * before the first page is rendered.
     * <p>
     * A handler for this signal can be used for setup tasks.
     */
    public default SignalHandle onReady(ReadyHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("ready"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperationPreview.Callbacks.class, "signalPrintOperationPreviewReady",
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
    
        public static void signalPrintOperationPreviewGotPageSize(MemoryAddress source, MemoryAddress context, MemoryAddress pageSetup, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (PrintOperationPreview.GotPageSizeHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new PrintOperationPreview.PrintOperationPreviewImpl(Refcounted.get(source)), new PrintContext(Refcounted.get(context, false)), new PageSetup(Refcounted.get(pageSetup, false)));
        }
        
        public static void signalPrintOperationPreviewReady(MemoryAddress source, MemoryAddress context, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (PrintOperationPreview.ReadyHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new PrintOperationPreview.PrintOperationPreviewImpl(Refcounted.get(source)), new PrintContext(Refcounted.get(context, false)));
        }
        
    }
    
    class PrintOperationPreviewImpl extends org.gtk.gobject.Object implements PrintOperationPreview {
        public PrintOperationPreviewImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
