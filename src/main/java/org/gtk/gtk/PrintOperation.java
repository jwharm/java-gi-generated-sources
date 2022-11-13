package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkPrintOperation} is the high-level, portable printing API.
 * <p>
 * It looks a bit different than other GTK dialogs such as the
 * {@code GtkFileChooser}, since some platforms don’t expose enough
 * infrastructure to implement a good print dialog. On such
 * platforms, {@code GtkPrintOperation} uses the native print dialog.
 * On platforms which do not provide a native print dialog, GTK
 * uses its own, see {@link PrintUnixDialog}.
 * <p>
 * The typical way to use the high-level printing API is to create
 * a {@code GtkPrintOperation} object with {@link PrintOperation#PrintOperation}
 * when the user selects to print. Then you set some properties on it,
 * e.g. the page size, any {@link PrintSettings} from previous print
 * operations, the number of pages, the current page, etc.
 * <p>
 * Then you start the print operation by calling {@link PrintOperation#run}.
 * It will then show a dialog, let the user select a printer and options.
 * When the user finished the dialog, various signals will be emitted on
 * the {@code GtkPrintOperation}, the main one being
 * {@code Gtk.PrintOperation::draw-page}, which you are supposed to handle
 * and render the page on the provided {@link PrintContext} using Cairo.
 * <p>
 * <strong>The high-level printing API</strong><br/>
 * <pre>{@code c
 * static GtkPrintSettings *settings = NULL;
 * 
 * static void
 * do_print (void)
 * {
 *   GtkPrintOperation *print;
 *   GtkPrintOperationResult res;
 * 
 *   print = gtk_print_operation_new ();
 * 
 *   if (settings != NULL)
 *     gtk_print_operation_set_print_settings (print, settings);
 * 
 *   g_signal_connect (print, "begin_print", G_CALLBACK (begin_print), NULL);
 *   g_signal_connect (print, "draw_page", G_CALLBACK (draw_page), NULL);
 * 
 *   res = gtk_print_operation_run (print, GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG,
 *                                  GTK_WINDOW (main_window), NULL);
 * 
 *   if (res == GTK_PRINT_OPERATION_RESULT_APPLY)
 *     {
 *       if (settings != NULL)
 *         g_object_unref (settings);
 *       settings = g_object_ref (gtk_print_operation_get_print_settings (print));
 *     }
 * 
 *   g_object_unref (print);
 * }
 * }</pre>
 * <p>
 * By default {@code GtkPrintOperation} uses an external application to do
 * print preview. To implement a custom print preview, an application
 * must connect to the preview signal. The functions
 * {@link PrintOperationPreview#renderPage},
 * {@link PrintOperationPreview#endPreview} and
 * {@link PrintOperationPreview#isSelected}
 * are useful when implementing a print preview.
 */
public class PrintOperation extends org.gtk.gobject.Object implements org.gtk.gtk.PrintOperationPreview {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkPrintOperation";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a PrintOperation proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PrintOperation(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PrintOperation if its GType is a (or inherits from) "GtkPrintOperation".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PrintOperation} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkPrintOperation", a ClassCastException will be thrown.
     */
    public static PrintOperation castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkPrintOperation"))) {
            return new PrintOperation(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkPrintOperation");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_operation_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkPrintOperation}.
     */
    public PrintOperation() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Cancels a running print operation.
     * <p>
     * This function may be called from a {@code Gtk.PrintOperation::begin-print},
     * {@code Gtk.PrintOperation::paginate} or {@code Gtk.PrintOperation::draw-page}
     * signal handler to stop the currently running print operation.
     */
    public void cancel() {
        try {
            DowncallHandles.gtk_print_operation_cancel.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Signal that drawing of particular page is complete.
     * <p>
     * It is called after completion of page drawing (e.g. drawing
     * in another thread). If {@link PrintOperation#setDeferDrawing}
     * was called before, then this function has to be called by application.
     * Otherwise it is called by GTK itself.
     */
    public void drawPageFinish() {
        try {
            DowncallHandles.gtk_print_operation_draw_page_finish.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the default page setup.
     * @return the default page setup
     */
    public @NotNull org.gtk.gtk.PageSetup getDefaultPageSetup() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_operation_get_default_page_setup.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PageSetup(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether page setup selection combos are embedded
     * @return whether page setup selection combos are embedded
     */
    public boolean getEmbedPageSetup() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_operation_get_embed_page_setup.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Call this when the result of a print operation is
     * {@link PrintOperationResult#ERROR}.
     * <p>
     * It can be called either after {@link PrintOperation#run}
     * returns, or in the {@code Gtk.PrintOperation::done} signal
     * handler.
     * <p>
     * The returned {@code GError} will contain more details on what went wrong.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public void getError() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.gtk_print_operation_get_error.invokeExact(
                    handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
    }
    
    /**
     * Gets whether there is a selection.
     * @return whether there is a selection
     */
    public boolean getHasSelection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_operation_get_has_selection.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the number of pages that will be printed.
     * <p>
     * Note that this value is set during print preparation phase
     * ({@link PrintStatus#PREPARING}), so this function should never be
     * called before the data generation phase ({@link PrintStatus#GENERATING_DATA}).
     * You can connect to the {@code Gtk.PrintOperation::status-changed}
     * signal and call gtk_print_operation_get_n_pages_to_print() when
     * print status is {@link PrintStatus#GENERATING_DATA}.
     * <p>
     * This is typically used to track the progress of print operation.
     * @return the number of pages that will be printed
     */
    public int getNPagesToPrint() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_operation_get_n_pages_to_print.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the current print settings.
     * <p>
     * Note that the return value is {@code null} until either
     * {@link PrintOperation#setPrintSettings} or
     * {@link PrintOperation#run} have been called.
     * @return the current print settings of {@code op}.
     */
    public @Nullable org.gtk.gtk.PrintSettings getPrintSettings() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_operation_get_print_settings.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PrintSettings(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the status of the print operation.
     * <p>
     * Also see {@link PrintOperation#getStatusString}.
     * @return the status of the print operation
     */
    public @NotNull org.gtk.gtk.PrintStatus getStatus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_operation_get_status.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PrintStatus(RESULT);
    }
    
    /**
     * Returns a string representation of the status of the
     * print operation.
     * <p>
     * The string is translated and suitable for displaying
     * the print status e.g. in a {@code GtkStatusbar}.
     * <p>
     * Use {@link PrintOperation#getStatus} to obtain
     * a status value that is suitable for programmatic use.
     * @return a string representation of the status
     *    of the print operation
     */
    public @NotNull java.lang.String getStatusString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_operation_get_status_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets whether the application supports print of selection
     * @return whether the application supports print of selection
     */
    public boolean getSupportSelection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_operation_get_support_selection.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * A convenience function to find out if the print operation
     * is finished.
     * <p>
     * a print operation is finished if its status is either
     * {@link PrintStatus#FINISHED} or {@link PrintStatus#FINISHED_ABORTED}.
     * <p>
     * Note: when you enable print status tracking the print operation
     * can be in a non-finished state even after done has been called, as
     * the operation status then tracks the print job status on the printer.
     * @return {@code true}, if the print operation is finished.
     */
    public boolean isFinished() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_operation_is_finished.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Runs the print operation.
     * <p>
     * Normally that this function does not return until the rendering
     * of all pages is complete. You can connect to the
     * {@code Gtk.PrintOperation::status-changed} signal on {@code op} to obtain
     * some information about the progress of the print operation.
     * <p>
     * Furthermore, it may use a recursive mainloop to show the print dialog.
     * <p>
     * If you set the [Gtk.PrintOperation:allow-async] property, the operation
     * will run asynchronously if this is supported on the platform. The
     * {@code Gtk.PrintOperation::done} signal will be emitted with the result
     * of the operation when the it is done (i.e. when the dialog is canceled,
     * or when the print succeeds or fails).
     * <pre>{@code c
     * if (settings != NULL)
     *   gtk_print_operation_set_print_settings (print, settings);
     * 
     * if (page_setup != NULL)
     *   gtk_print_operation_set_default_page_setup (print, page_setup);
     * 
     * g_signal_connect (print, "begin-print",
     *                   G_CALLBACK (begin_print), &data);
     * g_signal_connect (print, "draw-page",
     *                   G_CALLBACK (draw_page), &data);
     * 
     * res = gtk_print_operation_run (print,
     *                                GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG,
     *                                parent,
     *                                &error);
     * 
     * if (res == GTK_PRINT_OPERATION_RESULT_ERROR)
     *  {
     *    error_dialog = gtk_message_dialog_new (GTK_WINDOW (parent),
     *   			                     GTK_DIALOG_DESTROY_WITH_PARENT,
     * 					     GTK_MESSAGE_ERROR,
     * 					     GTK_BUTTONS_CLOSE,
     * 					     "Error printing file:\\n%s",
     * 					     error->message);
     *    g_signal_connect (error_dialog, "response",
     *                      G_CALLBACK (gtk_window_destroy), NULL);
     *    gtk_widget_show (error_dialog);
     *    g_error_free (error);
     *  }
     * else if (res == GTK_PRINT_OPERATION_RESULT_APPLY)
     *  {
     *    if (settings != NULL)
     * g_object_unref (settings);
     *    settings = g_object_ref (gtk_print_operation_get_print_settings (print));
     *  }
     * }</pre>
     * <p>
     * Note that gtk_print_operation_run() can only be called once on a
     * given {@code GtkPrintOperation}.
     * @param action the action to start
     * @param parent Transient parent of the dialog
     * @return the result of the print operation. A return value of
     *   {@link PrintOperationResult#APPLY} indicates that the printing was
     *   completed successfully. In this case, it is a good idea to obtain
     *   the used print settings with
     *   {@link PrintOperation#getPrintSettings}
     *   and store them for reuse with the next print operation. A value of
     *   {@link PrintOperationResult#IN_PROGRESS} means the operation is running
     *   asynchronously, and will emit the {@code Gtk.PrintOperation::done}
     *   signal when done.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gtk.PrintOperationResult run(@NotNull org.gtk.gtk.PrintOperationAction action, @Nullable org.gtk.gtk.Window parent) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(action, "Parameter 'action' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_operation_run.invokeExact(
                    handle(),
                    action.getValue(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gtk.PrintOperationResult(RESULT);
    }
    
    /**
     * Sets whether gtk_print_operation_run() may return
     * before the print operation is completed.
     * <p>
     * Note that some platforms may not allow asynchronous
     * operation.
     * @param allowAsync {@code true} to allow asynchronous operation
     */
    public void setAllowAsync(boolean allowAsync) {
        try {
            DowncallHandles.gtk_print_operation_set_allow_async.invokeExact(
                    handle(),
                    allowAsync ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the current page.
     * <p>
     * If this is called before {@link PrintOperation#run},
     * the user will be able to select to print only the current page.
     * <p>
     * Note that this only makes sense for pre-paginated documents.
     * @param currentPage the current page, 0-based
     */
    public void setCurrentPage(int currentPage) {
        try {
            DowncallHandles.gtk_print_operation_set_current_page.invokeExact(
                    handle(),
                    currentPage);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the label for the tab holding custom widgets.
     * @param label the label to use, or {@code null} to use the default label
     */
    public void setCustomTabLabel(@Nullable java.lang.String label) {
        try {
            DowncallHandles.gtk_print_operation_set_custom_tab_label.invokeExact(
                    handle(),
                    (Addressable) (label == null ? MemoryAddress.NULL : Interop.allocateNativeString(label)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Makes {@code default_page_setup} the default page setup for {@code op}.
     * <p>
     * This page setup will be used by {@link PrintOperation#run},
     * but it can be overridden on a per-page basis by connecting
     * to the {@code Gtk.PrintOperation::request-page-setup} signal.
     * @param defaultPageSetup a {@code GtkPageSetup}
     */
    public void setDefaultPageSetup(@Nullable org.gtk.gtk.PageSetup defaultPageSetup) {
        try {
            DowncallHandles.gtk_print_operation_set_default_page_setup.invokeExact(
                    handle(),
                    (Addressable) (defaultPageSetup == null ? MemoryAddress.NULL : defaultPageSetup.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets up the {@code GtkPrintOperation} to wait for calling of
     * [method{@code Gtk}.PrintOperation.draw_page_finish from application.
     * <p>
     * This can be used for drawing page in another thread.
     * <p>
     * This function must be called in the callback of the
     * {@code Gtk.PrintOperation::draw-page} signal.
     */
    public void setDeferDrawing() {
        try {
            DowncallHandles.gtk_print_operation_set_defer_drawing.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Embed page size combo box and orientation combo box into page setup page.
     * <p>
     * Selected page setup is stored as default page setup in {@code GtkPrintOperation}.
     * @param embed {@code true} to embed page setup selection in the {@code GtkPrintUnixDialog}
     */
    public void setEmbedPageSetup(boolean embed) {
        try {
            DowncallHandles.gtk_print_operation_set_embed_page_setup.invokeExact(
                    handle(),
                    embed ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets up the {@code GtkPrintOperation} to generate a file instead
     * of showing the print dialog.
     * <p>
     * The intended use of this function is for implementing
     * “Export to PDF” actions. Currently, PDF is the only supported
     * format.
     * <p>
     * “Print to PDF” support is independent of this and is done
     * by letting the user pick the “Print to PDF” item from the list
     * of printers in the print dialog.
     * @param filename the filename for the exported file
     */
    public void setExportFilename(@NotNull java.lang.String filename) {
        java.util.Objects.requireNonNull(filename, "Parameter 'filename' must not be null");
        try {
            DowncallHandles.gtk_print_operation_set_export_filename.invokeExact(
                    handle(),
                    Interop.allocateNativeString(filename));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether there is a selection to print.
     * <p>
     * Application has to set number of pages to which the selection
     * will draw by {@link PrintOperation#setNPages} in a handler
     * for the {@code Gtk.PrintOperation::begin-print} signal.
     * @param hasSelection {@code true} indicates that a selection exists
     */
    public void setHasSelection(boolean hasSelection) {
        try {
            DowncallHandles.gtk_print_operation_set_has_selection.invokeExact(
                    handle(),
                    hasSelection ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the name of the print job.
     * <p>
     * The name is used to identify the job (e.g. in monitoring
     * applications like eggcups).
     * <p>
     * If you don’t set a job name, GTK picks a default one by
     * numbering successive print jobs.
     * @param jobName a string that identifies the print job
     */
    public void setJobName(@NotNull java.lang.String jobName) {
        java.util.Objects.requireNonNull(jobName, "Parameter 'jobName' must not be null");
        try {
            DowncallHandles.gtk_print_operation_set_job_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(jobName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the number of pages in the document.
     * <p>
     * This must be set to a positive number before the rendering
     * starts. It may be set in a {@code Gtk.PrintOperation::begin-print}
     * signal handler.
     * <p>
     * Note that the page numbers passed to the
     * {@code Gtk.PrintOperation::request-page-setup}
     * and {@code Gtk.PrintOperation::draw-page} signals are 0-based, i.e.
     * if the user chooses to print all pages, the last ::draw-page signal
     * will be for page {@code n_pages} - 1.
     * @param nPages the number of pages
     */
    public void setNPages(int nPages) {
        try {
            DowncallHandles.gtk_print_operation_set_n_pages.invokeExact(
                    handle(),
                    nPages);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the print settings for {@code op}.
     * <p>
     * This is typically used to re-establish print settings
     * from a previous print operation, see {@link PrintOperation#run}.
     * @param printSettings {@code GtkPrintSettings}
     */
    public void setPrintSettings(@Nullable org.gtk.gtk.PrintSettings printSettings) {
        try {
            DowncallHandles.gtk_print_operation_set_print_settings.invokeExact(
                    handle(),
                    (Addressable) (printSettings == null ? MemoryAddress.NULL : printSettings.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code show_progress} is {@code true}, the print operation will show
     * a progress dialog during the print operation.
     * @param showProgress {@code true} to show a progress dialog
     */
    public void setShowProgress(boolean showProgress) {
        try {
            DowncallHandles.gtk_print_operation_set_show_progress.invokeExact(
                    handle(),
                    showProgress ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether selection is supported by {@code GtkPrintOperation}.
     * @param supportSelection {@code true} to support selection
     */
    public void setSupportSelection(boolean supportSelection) {
        try {
            DowncallHandles.gtk_print_operation_set_support_selection.invokeExact(
                    handle(),
                    supportSelection ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If track_status is {@code true}, the print operation will try to continue
     * report on the status of the print job in the printer queues and printer.
     * <p>
     * This can allow your application to show things like “out of paper”
     * issues, and when the print job actually reaches the printer.
     * <p>
     * This function is often implemented using some form of polling,
     * so it should not be enabled unless needed.
     * @param trackStatus {@code true} to track status after printing
     */
    public void setTrackPrintStatus(boolean trackStatus) {
        try {
            DowncallHandles.gtk_print_operation_set_track_print_status.invokeExact(
                    handle(),
                    trackStatus ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets up the transformation for the cairo context obtained from
     * {@code GtkPrintContext} in such a way that distances are measured in
     * units of {@code unit}.
     * @param unit the unit to use
     */
    public void setUnit(@NotNull org.gtk.gtk.Unit unit) {
        java.util.Objects.requireNonNull(unit, "Parameter 'unit' must not be null");
        try {
            DowncallHandles.gtk_print_operation_set_unit.invokeExact(
                    handle(),
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code full_page} is {@code true}, the transformation for the cairo context
     * obtained from {@code GtkPrintContext} puts the origin at the top left
     * corner of the page.
     * <p>
     * This may not be the top left corner of the sheet, depending on page
     * orientation and the number of pages per sheet). Otherwise, the origin
     * is at the top left corner of the imageable area (i.e. inside the margins).
     * @param fullPage {@code true} to set up the {@code GtkPrintContext} for the full page
     */
    public void setUseFullPage(boolean fullPage) {
        try {
            DowncallHandles.gtk_print_operation_set_use_full_page.invokeExact(
                    handle(),
                    fullPage ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface BeginPrint {
        void signalReceived(PrintOperation source, @NotNull org.gtk.gtk.PrintContext context);
    }
    
    /**
     * Emitted after the user has finished changing print settings
     * in the dialog, before the actual rendering starts.
     * <p>
     * A typical use for ::begin-print is to use the parameters from the
     * {@link PrintContext} and paginate the document accordingly,
     * and then set the number of pages with
     * {@link PrintOperation#setNPages}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<PrintOperation.BeginPrint> onBeginPrint(PrintOperation.BeginPrint handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("begin-print"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperation.Callbacks.class, "signalPrintOperationBeginPrint",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PrintOperation.BeginPrint>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CreateCustomWidget {
        void signalReceived(PrintOperation source);
    }
    
    /**
     * Emitted when displaying the print dialog.
     * <p>
     * If you return a widget in a handler for this signal it will be
     * added to a custom tab in the print dialog. You typically return a
     * container widget with multiple widgets in it.
     * <p>
     * The print dialog owns the returned widget, and its lifetime is not
     * controlled by the application. However, the widget is guaranteed
     * to stay around until the {@code Gtk.PrintOperation::custom-widget-apply}
     * signal is emitted on the operation. Then you can read out any
     * information you need from the widgets.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<PrintOperation.CreateCustomWidget> onCreateCustomWidget(PrintOperation.CreateCustomWidget handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("create-custom-widget"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperation.Callbacks.class, "signalPrintOperationCreateCustomWidget",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PrintOperation.CreateCustomWidget>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CustomWidgetApply {
        void signalReceived(PrintOperation source, @NotNull org.gtk.gtk.Widget widget);
    }
    
    /**
     * Emitted right before ::begin-print if you added
     * a custom widget in the ::create-custom-widget handler.
     * <p>
     * When you get this signal you should read the information from the
     * custom widgets, as the widgets are not guaranteed to be around at a
     * later time.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<PrintOperation.CustomWidgetApply> onCustomWidgetApply(PrintOperation.CustomWidgetApply handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("custom-widget-apply"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperation.Callbacks.class, "signalPrintOperationCustomWidgetApply",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PrintOperation.CustomWidgetApply>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Done {
        void signalReceived(PrintOperation source, @NotNull org.gtk.gtk.PrintOperationResult result);
    }
    
    /**
     * Emitted when the print operation run has finished doing
     * everything required for printing.
     * <p>
     * {@code result} gives you information about what happened during the run.
     * If {@code result} is {@link PrintOperationResult#ERROR} then you can call
     * {@link PrintOperation#getError} for more information.
     * <p>
     * If you enabled print status tracking then
     * {@link PrintOperation#isFinished} may still return {@code false}
     * after the ::done signal was emitted.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<PrintOperation.Done> onDone(PrintOperation.Done handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("done"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperation.Callbacks.class, "signalPrintOperationDone",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PrintOperation.Done>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DrawPage {
        void signalReceived(PrintOperation source, @NotNull org.gtk.gtk.PrintContext context, int pageNr);
    }
    
    /**
     * Emitted for every page that is printed.
     * <p>
     * The signal handler must render the {@code page_nr}'s page onto the cairo
     * context obtained from {@code context} using
     * {@link PrintContext#getCairoContext}.
     * <pre>{@code c
     * static void
     * draw_page (GtkPrintOperation *operation,
     *            GtkPrintContext   *context,
     *            int                page_nr,
     *            gpointer           user_data)
     * {
     *   cairo_t *cr;
     *   PangoLayout *layout;
     *   double width, text_height;
     *   int layout_height;
     *   PangoFontDescription *desc;
     *   
     *   cr = gtk_print_context_get_cairo_context (context);
     *   width = gtk_print_context_get_width (context);
     *   
     *   cairo_rectangle (cr, 0, 0, width, HEADER_HEIGHT);
     *   
     *   cairo_set_source_rgb (cr, 0.8, 0.8, 0.8);
     *   cairo_fill (cr);
     *   
     *   layout = gtk_print_context_create_pango_layout (context);
     *   
     *   desc = pango_font_description_from_string ("sans 14");
     *   pango_layout_set_font_description (layout, desc);
     *   pango_font_description_free (desc);
     *   
     *   pango_layout_set_text (layout, "some text", -1);
     *   pango_layout_set_width (layout, width * PANGO_SCALE);
     *   pango_layout_set_alignment (layout, PANGO_ALIGN_CENTER);
     *      		      
     *   pango_layout_get_size (layout, NULL, &layout_height);
     *   text_height = (double)layout_height / PANGO_SCALE;
     *   
     *   cairo_move_to (cr, width / 2,  (HEADER_HEIGHT - text_height) / 2);
     *   pango_cairo_show_layout (cr, layout);
     *   
     *   g_object_unref (layout);
     * }
     * }</pre>
     * <p>
     * Use {@link PrintOperation#setUseFullPage} and
     * {@link PrintOperation#setUnit} before starting the print
     * operation to set up the transformation of the cairo context
     * according to your needs.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<PrintOperation.DrawPage> onDrawPage(PrintOperation.DrawPage handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("draw-page"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperation.Callbacks.class, "signalPrintOperationDrawPage",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PrintOperation.DrawPage>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface EndPrint {
        void signalReceived(PrintOperation source, @NotNull org.gtk.gtk.PrintContext context);
    }
    
    /**
     * Emitted after all pages have been rendered.
     * <p>
     * A handler for this signal can clean up any resources that have
     * been allocated in the {@code Gtk.PrintOperation::begin-print} handler.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<PrintOperation.EndPrint> onEndPrint(PrintOperation.EndPrint handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("end-print"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperation.Callbacks.class, "signalPrintOperationEndPrint",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PrintOperation.EndPrint>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Paginate {
        boolean signalReceived(PrintOperation source, @NotNull org.gtk.gtk.PrintContext context);
    }
    
    /**
     * Emitted after the ::begin-print signal, but before the actual rendering
     * starts.
     * <p>
     * It keeps getting emitted until a connected signal handler returns {@code true}.
     * <p>
     * The ::paginate signal is intended to be used for paginating a document
     * in small chunks, to avoid blocking the user interface for a long
     * time. The signal handler should update the number of pages using
     * {@link PrintOperation#setNPages}, and return {@code true} if the document
     * has been completely paginated.
     * <p>
     * If you don't need to do pagination in chunks, you can simply do
     * it all in the ::begin-print handler, and set the number of pages
     * from there.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<PrintOperation.Paginate> onPaginate(PrintOperation.Paginate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("paginate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperation.Callbacks.class, "signalPrintOperationPaginate",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PrintOperation.Paginate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Preview {
        boolean signalReceived(PrintOperation source, @NotNull org.gtk.gtk.PrintOperationPreview preview, @NotNull org.gtk.gtk.PrintContext context, @Nullable org.gtk.gtk.Window parent);
    }
    
    /**
     * Gets emitted when a preview is requested from the native dialog.
     * <p>
     * The default handler for this signal uses an external viewer
     * application to preview.
     * <p>
     * To implement a custom print preview, an application must return
     * {@code true} from its handler for this signal. In order to use the
     * provided {@code context} for the preview implementation, it must be
     * given a suitable cairo context with
     * {@link PrintContext#setCairoContext}.
     * <p>
     * The custom preview implementation can use
     * {@link PrintOperationPreview#isSelected} and
     * {@link PrintOperationPreview#renderPage} to find pages which
     * are selected for print and render them. The preview must be
     * finished by calling {@link PrintOperationPreview#endPreview}
     * (typically in response to the user clicking a close button).
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<PrintOperation.Preview> onPreview(PrintOperation.Preview handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("preview"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperation.Callbacks.class, "signalPrintOperationPreview",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PrintOperation.Preview>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RequestPageSetup {
        void signalReceived(PrintOperation source, @NotNull org.gtk.gtk.PrintContext context, int pageNr, @NotNull org.gtk.gtk.PageSetup setup);
    }
    
    /**
     * Emitted once for every page that is printed.
     * <p>
     * This gives the application a chance to modify the page setup.
     * Any changes done to {@code setup} will be in force only for printing
     * this page.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<PrintOperation.RequestPageSetup> onRequestPageSetup(PrintOperation.RequestPageSetup handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("request-page-setup"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperation.Callbacks.class, "signalPrintOperationRequestPageSetup",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PrintOperation.RequestPageSetup>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface StatusChanged {
        void signalReceived(PrintOperation source);
    }
    
    /**
     * Emitted at between the various phases of the print operation.
     * <p>
     * See {@code Gtk.PrintStatus} for the phases that are being discriminated.
     * Use {@link PrintOperation#getStatus} to find out the current
     * status.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<PrintOperation.StatusChanged> onStatusChanged(PrintOperation.StatusChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("status-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperation.Callbacks.class, "signalPrintOperationStatusChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PrintOperation.StatusChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface UpdateCustomWidget {
        void signalReceived(PrintOperation source, @NotNull org.gtk.gtk.Widget widget, @NotNull org.gtk.gtk.PageSetup setup, @NotNull org.gtk.gtk.PrintSettings settings);
    }
    
    /**
     * Emitted after change of selected printer.
     * <p>
     * The actual page setup and print settings are passed to the custom
     * widget, which can actualize itself according to this change.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<PrintOperation.UpdateCustomWidget> onUpdateCustomWidget(PrintOperation.UpdateCustomWidget handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("update-custom-widget"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperation.Callbacks.class, "signalPrintOperationUpdateCustomWidget",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PrintOperation.UpdateCustomWidget>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_print_operation_new = Interop.downcallHandle(
            "gtk_print_operation_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_operation_cancel = Interop.downcallHandle(
            "gtk_print_operation_cancel",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_operation_draw_page_finish = Interop.downcallHandle(
            "gtk_print_operation_draw_page_finish",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_operation_get_default_page_setup = Interop.downcallHandle(
            "gtk_print_operation_get_default_page_setup",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_operation_get_embed_page_setup = Interop.downcallHandle(
            "gtk_print_operation_get_embed_page_setup",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_operation_get_error = Interop.downcallHandle(
            "gtk_print_operation_get_error",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_operation_get_has_selection = Interop.downcallHandle(
            "gtk_print_operation_get_has_selection",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_operation_get_n_pages_to_print = Interop.downcallHandle(
            "gtk_print_operation_get_n_pages_to_print",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_operation_get_print_settings = Interop.downcallHandle(
            "gtk_print_operation_get_print_settings",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_operation_get_status = Interop.downcallHandle(
            "gtk_print_operation_get_status",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_operation_get_status_string = Interop.downcallHandle(
            "gtk_print_operation_get_status_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_operation_get_support_selection = Interop.downcallHandle(
            "gtk_print_operation_get_support_selection",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_operation_is_finished = Interop.downcallHandle(
            "gtk_print_operation_is_finished",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_operation_run = Interop.downcallHandle(
            "gtk_print_operation_run",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_operation_set_allow_async = Interop.downcallHandle(
            "gtk_print_operation_set_allow_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_print_operation_set_current_page = Interop.downcallHandle(
            "gtk_print_operation_set_current_page",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_print_operation_set_custom_tab_label = Interop.downcallHandle(
            "gtk_print_operation_set_custom_tab_label",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_operation_set_default_page_setup = Interop.downcallHandle(
            "gtk_print_operation_set_default_page_setup",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_operation_set_defer_drawing = Interop.downcallHandle(
            "gtk_print_operation_set_defer_drawing",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_operation_set_embed_page_setup = Interop.downcallHandle(
            "gtk_print_operation_set_embed_page_setup",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_print_operation_set_export_filename = Interop.downcallHandle(
            "gtk_print_operation_set_export_filename",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_operation_set_has_selection = Interop.downcallHandle(
            "gtk_print_operation_set_has_selection",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_print_operation_set_job_name = Interop.downcallHandle(
            "gtk_print_operation_set_job_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_operation_set_n_pages = Interop.downcallHandle(
            "gtk_print_operation_set_n_pages",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_print_operation_set_print_settings = Interop.downcallHandle(
            "gtk_print_operation_set_print_settings",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_operation_set_show_progress = Interop.downcallHandle(
            "gtk_print_operation_set_show_progress",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_print_operation_set_support_selection = Interop.downcallHandle(
            "gtk_print_operation_set_support_selection",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_print_operation_set_track_print_status = Interop.downcallHandle(
            "gtk_print_operation_set_track_print_status",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_print_operation_set_unit = Interop.downcallHandle(
            "gtk_print_operation_set_unit",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_print_operation_set_use_full_page = Interop.downcallHandle(
            "gtk_print_operation_set_use_full_page",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalPrintOperationBeginPrint(MemoryAddress source, MemoryAddress context, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (PrintOperation.BeginPrint) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PrintOperation(source, Ownership.UNKNOWN), new org.gtk.gtk.PrintContext(context, Ownership.NONE));
        }
        
        public static void signalPrintOperationCreateCustomWidget(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (PrintOperation.CreateCustomWidget) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PrintOperation(source, Ownership.UNKNOWN));
        }
        
        public static void signalPrintOperationCustomWidgetApply(MemoryAddress source, MemoryAddress widget, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (PrintOperation.CustomWidgetApply) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PrintOperation(source, Ownership.UNKNOWN), new org.gtk.gtk.Widget(widget, Ownership.NONE));
        }
        
        public static void signalPrintOperationDone(MemoryAddress source, int result, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (PrintOperation.Done) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PrintOperation(source, Ownership.UNKNOWN), new org.gtk.gtk.PrintOperationResult(result));
        }
        
        public static void signalPrintOperationDrawPage(MemoryAddress source, MemoryAddress context, int pageNr, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (PrintOperation.DrawPage) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PrintOperation(source, Ownership.UNKNOWN), new org.gtk.gtk.PrintContext(context, Ownership.NONE), pageNr);
        }
        
        public static void signalPrintOperationEndPrint(MemoryAddress source, MemoryAddress context, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (PrintOperation.EndPrint) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PrintOperation(source, Ownership.UNKNOWN), new org.gtk.gtk.PrintContext(context, Ownership.NONE));
        }
        
        public static boolean signalPrintOperationPaginate(MemoryAddress source, MemoryAddress context, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (PrintOperation.Paginate) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new PrintOperation(source, Ownership.UNKNOWN), new org.gtk.gtk.PrintContext(context, Ownership.NONE));
        }
        
        public static boolean signalPrintOperationPreview(MemoryAddress source, MemoryAddress preview, MemoryAddress context, MemoryAddress parent, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (PrintOperation.Preview) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new PrintOperation(source, Ownership.UNKNOWN), new org.gtk.gtk.PrintOperationPreview.PrintOperationPreviewImpl(preview, Ownership.NONE), new org.gtk.gtk.PrintContext(context, Ownership.NONE), new org.gtk.gtk.Window(parent, Ownership.NONE));
        }
        
        public static void signalPrintOperationRequestPageSetup(MemoryAddress source, MemoryAddress context, int pageNr, MemoryAddress setup, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (PrintOperation.RequestPageSetup) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PrintOperation(source, Ownership.UNKNOWN), new org.gtk.gtk.PrintContext(context, Ownership.NONE), pageNr, new org.gtk.gtk.PageSetup(setup, Ownership.NONE));
        }
        
        public static void signalPrintOperationStatusChanged(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (PrintOperation.StatusChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PrintOperation(source, Ownership.UNKNOWN));
        }
        
        public static void signalPrintOperationUpdateCustomWidget(MemoryAddress source, MemoryAddress widget, MemoryAddress setup, MemoryAddress settings, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (PrintOperation.UpdateCustomWidget) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PrintOperation(source, Ownership.UNKNOWN), new org.gtk.gtk.Widget(widget, Ownership.NONE), new org.gtk.gtk.PageSetup(setup, Ownership.NONE), new org.gtk.gtk.PrintSettings(settings, Ownership.NONE));
        }
    }
}
