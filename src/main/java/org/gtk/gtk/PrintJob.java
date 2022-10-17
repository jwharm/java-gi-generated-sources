package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkPrintJob} object represents a job that is sent to a printer.
 * <p>
 * You only need to deal directly with print jobs if you use the
 * non-portable {@link PrintUnixDialog} API.
 * <p>
 * Use {@link PrintJob#getSurface} to obtain the cairo surface
 * onto which the pages must be drawn. Use {@link PrintJob#send}
 * to send the finished job to the printer. If you don’t use cairo
 * {@code GtkPrintJob} also supports printing of manually generated PostScript,
 * via {@link PrintJob#setSourceFile}.
 */
public class PrintJob extends org.gtk.gobject.Object {

    public PrintJob(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PrintJob */
    public static PrintJob castFrom(org.gtk.gobject.Object gobject) {
        return new PrintJob(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_print_job_new = Interop.downcallHandle(
        "gtk_print_job_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull java.lang.String title, @NotNull Printer printer, @NotNull PrintSettings settings, @NotNull PageSetup pageSetup) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_print_job_new.invokeExact(Interop.allocateNativeString(title), printer.handle(), settings.handle(), pageSetup.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkPrintJob}.
     */
    public PrintJob(@NotNull java.lang.String title, @NotNull Printer printer, @NotNull PrintSettings settings, @NotNull PageSetup pageSetup) {
        super(constructNew(title, printer, settings, pageSetup));
    }
    
    private static final MethodHandle gtk_print_job_get_collate = Interop.downcallHandle(
        "gtk_print_job_get_collate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether this job is printed collated.
     */
    public boolean getCollate() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_job_get_collate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_print_job_get_n_up = Interop.downcallHandle(
        "gtk_print_job_get_n_up",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the n-up setting for this job.
     */
    public int getNUp() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_job_get_n_up.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_print_job_get_n_up_layout = Interop.downcallHandle(
        "gtk_print_job_get_n_up_layout",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the n-up layout setting for this job.
     */
    public @NotNull NumberUpLayout getNUpLayout() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_job_get_n_up_layout.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new NumberUpLayout(RESULT);
    }
    
    private static final MethodHandle gtk_print_job_get_num_copies = Interop.downcallHandle(
        "gtk_print_job_get_num_copies",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of copies of this job.
     */
    public int getNumCopies() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_job_get_num_copies.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_print_job_get_page_ranges = Interop.downcallHandle(
        "gtk_print_job_get_page_ranges",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the page ranges for this job.
     */
    public PageRange[] getPageRanges(@NotNull Out<Integer> nRanges) {
        MemorySegment nRangesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_print_job_get_page_ranges.invokeExact(handle(), (Addressable) nRangesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nRanges.set(nRangesPOINTER.get(ValueLayout.JAVA_INT, 0));
        PageRange[] resultARRAY = new PageRange[nRanges.get().intValue()];
        for (int I = 0; I < nRanges.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = new PageRange(Refcounted.get(OBJ, false));
        }
        return resultARRAY;
    }
    
    private static final MethodHandle gtk_print_job_get_page_set = Interop.downcallHandle(
        "gtk_print_job_get_page_set",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GtkPageSet} setting for this job.
     */
    public @NotNull PageSet getPageSet() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_job_get_page_set.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PageSet(RESULT);
    }
    
    private static final MethodHandle gtk_print_job_get_pages = Interop.downcallHandle(
        "gtk_print_job_get_pages",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GtkPrintPages} setting for this job.
     */
    public @NotNull PrintPages getPages() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_job_get_pages.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PrintPages(RESULT);
    }
    
    private static final MethodHandle gtk_print_job_get_printer = Interop.downcallHandle(
        "gtk_print_job_get_printer",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GtkPrinter} of the print job.
     */
    public @NotNull Printer getPrinter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_print_job_get_printer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Printer(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_print_job_get_reverse = Interop.downcallHandle(
        "gtk_print_job_get_reverse",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether this job is printed reversed.
     */
    public boolean getReverse() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_job_get_reverse.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_print_job_get_rotate = Interop.downcallHandle(
        "gtk_print_job_get_rotate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the job is printed rotated.
     */
    public boolean getRotate() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_job_get_rotate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_print_job_get_scale = Interop.downcallHandle(
        "gtk_print_job_get_scale",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the scale for this job.
     */
    public double getScale() {
        double RESULT;
        try {
            RESULT = (double) gtk_print_job_get_scale.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_print_job_get_settings = Interop.downcallHandle(
        "gtk_print_job_get_settings",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GtkPrintSettings} of the print job.
     */
    public @NotNull PrintSettings getSettings() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_print_job_get_settings.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PrintSettings(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_print_job_get_status = Interop.downcallHandle(
        "gtk_print_job_get_status",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the status of the print job.
     */
    public @NotNull PrintStatus getStatus() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_job_get_status.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PrintStatus(RESULT);
    }
    
    private static final MethodHandle gtk_print_job_get_surface = Interop.downcallHandle(
        "gtk_print_job_get_surface",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a cairo surface onto which the pages of
     * the print job should be rendered.
     */
    public @NotNull org.cairographics.Surface getSurface() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_print_job_get_surface.invokeExact(handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.cairographics.Surface(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_print_job_get_title = Interop.downcallHandle(
        "gtk_print_job_get_title",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the job title.
     */
    public @NotNull java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_print_job_get_title.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_print_job_get_track_print_status = Interop.downcallHandle(
        "gtk_print_job_get_track_print_status",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether jobs will be tracked after printing.
     * <p>
     * For details, see {@link PrintJob#setTrackPrintStatus}.
     */
    public boolean getTrackPrintStatus() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_job_get_track_print_status.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_print_job_send = Interop.downcallHandle(
        "gtk_print_job_send",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sends the print job off to the printer.
     */
    public @NotNull void send(@NotNull PrintJobCompleteFunc callback) {
        try {
            gtk_print_job_send.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbPrintJobCompleteFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_job_set_collate = Interop.downcallHandle(
        "gtk_print_job_set_collate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether this job is printed collated.
     */
    public @NotNull void setCollate(@NotNull boolean collate) {
        try {
            gtk_print_job_set_collate.invokeExact(handle(), collate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_job_set_n_up = Interop.downcallHandle(
        "gtk_print_job_set_n_up",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the n-up setting for this job.
     */
    public @NotNull void setNUp(@NotNull int nUp) {
        try {
            gtk_print_job_set_n_up.invokeExact(handle(), nUp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_job_set_n_up_layout = Interop.downcallHandle(
        "gtk_print_job_set_n_up_layout",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the n-up layout setting for this job.
     */
    public @NotNull void setNUpLayout(@NotNull NumberUpLayout layout) {
        try {
            gtk_print_job_set_n_up_layout.invokeExact(handle(), layout.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_job_set_num_copies = Interop.downcallHandle(
        "gtk_print_job_set_num_copies",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the number of copies for this job.
     */
    public @NotNull void setNumCopies(@NotNull int numCopies) {
        try {
            gtk_print_job_set_num_copies.invokeExact(handle(), numCopies);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_job_set_page_ranges = Interop.downcallHandle(
        "gtk_print_job_set_page_ranges",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the page ranges for this job.
     */
    public @NotNull void setPageRanges(@NotNull PageRange[] ranges, @NotNull int nRanges) {
        try {
            gtk_print_job_set_page_ranges.invokeExact(handle(), Interop.allocateNativeArray(ranges), nRanges);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_job_set_page_set = Interop.downcallHandle(
        "gtk_print_job_set_page_set",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the {@code GtkPageSet} setting for this job.
     */
    public @NotNull void setPageSet(@NotNull PageSet pageSet) {
        try {
            gtk_print_job_set_page_set.invokeExact(handle(), pageSet.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_job_set_pages = Interop.downcallHandle(
        "gtk_print_job_set_pages",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the {@code GtkPrintPages} setting for this job.
     */
    public @NotNull void setPages(@NotNull PrintPages pages) {
        try {
            gtk_print_job_set_pages.invokeExact(handle(), pages.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_job_set_reverse = Interop.downcallHandle(
        "gtk_print_job_set_reverse",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether this job is printed reversed.
     */
    public @NotNull void setReverse(@NotNull boolean reverse) {
        try {
            gtk_print_job_set_reverse.invokeExact(handle(), reverse ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_job_set_rotate = Interop.downcallHandle(
        "gtk_print_job_set_rotate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether this job is printed rotated.
     */
    public @NotNull void setRotate(@NotNull boolean rotate) {
        try {
            gtk_print_job_set_rotate.invokeExact(handle(), rotate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_job_set_scale = Interop.downcallHandle(
        "gtk_print_job_set_scale",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the scale for this job.
     * <p>
     * 1.0 means unscaled.
     */
    public @NotNull void setScale(@NotNull double scale) {
        try {
            gtk_print_job_set_scale.invokeExact(handle(), scale);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_job_set_source_fd = Interop.downcallHandle(
        "gtk_print_job_set_source_fd",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Make the {@code GtkPrintJob} send an existing document to the
     * printing system.
     * <p>
     * The file can be in any format understood by the platforms
     * printing system (typically PostScript, but on many platforms
     * PDF may work too). See {@link Printer#acceptsPdf} and
     * {@link Printer#acceptsPs}.
     * <p>
     * This is similar to {@link PrintJob#setSourceFile},
     * but takes expects an open file descriptor for the file,
     * instead of a filename.
     */
    public boolean setSourceFd(@NotNull int fd) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) gtk_print_job_set_source_fd.invokeExact(handle(), fd, (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_print_job_set_source_file = Interop.downcallHandle(
        "gtk_print_job_set_source_file",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Make the {@code GtkPrintJob} send an existing document to the
     * printing system.
     * <p>
     * The file can be in any format understood by the platforms
     * printing system (typically PostScript, but on many platforms
     * PDF may work too). See {@link Printer#acceptsPdf} and
     * {@link Printer#acceptsPs}.
     */
    public boolean setSourceFile(@NotNull java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) gtk_print_job_set_source_file.invokeExact(handle(), Interop.allocateNativeString(filename), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_print_job_set_track_print_status = Interop.downcallHandle(
        "gtk_print_job_set_track_print_status",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If track_status is {@code true}, the print job will try to continue report
     * on the status of the print job in the printer queues and printer.
     * <p>
     * This can allow your application to show things like “out of paper”
     * issues, and when the print job actually reaches the printer.
     * <p>
     * This function is often implemented using some form of polling,
     * so it should not be enabled unless needed.
     */
    public @NotNull void setTrackPrintStatus(@NotNull boolean trackStatus) {
        try {
            gtk_print_job_set_track_print_status.invokeExact(handle(), trackStatus ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface StatusChangedHandler {
        void signalReceived(PrintJob source);
    }
    
    /**
     * Emitted when the status of a job changes.
     * <p>
     * The signal handler can use {@link PrintJob#getStatus}
     * to obtain the new status.
     */
    public SignalHandle onStatusChanged(StatusChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("status-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintJob.Callbacks.class, "signalPrintJobStatusChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalPrintJobStatusChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (PrintJob.StatusChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new PrintJob(Refcounted.get(source)));
        }
        
    }
}
